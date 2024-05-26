grammar Ql;



// Define the basic elements of the language as lexer ru
STRING: [a-zA-Z0-9_][a-zA-Z0-9_]*;
INT: ('+' | '-')? [0-9]+;
FLOAT: ('+' | '-')? [0-9]+ '.' [0-9]+;
WS: [ \t\r\n]+ -> skip;
QOUTED_STRING: '"' ( ~'"' | '""' )* '"' ;

// Define the parser rules for the commands
command : match_query | crud_command | database_command;

crud_command: vertex_command | edge_command | index_command;

vertex_command: create_vertex | delete_vertex | update_vertex;
edge_command: create_edge | delete_edge | update_edge;
index_command: create_index | delete_index;
create: 'CREATE' create_vertex | create_edge | create_index;
delete: 'DELETE' delete_vertex | delete_edge | delete_index;
update: 'UPDATE' update_vertex | update_edge ;

create_vertex: 'CREATE' 'VERTEX' '(' id ':' label? properties? ')';
create_edge: 'CREATE' 'EDGE' label? 'FROM' sourceId 'TO' destinationId ('WITH'  properties)?;
create_index: 'CREATE' 'INDEX' 'ON' key;

delete_vertex: 'DELETE' 'VERTEX' id;
delete_edge: 'DELETE' 'EDGE' label? 'FROM' sourceId 'TO' destinationId;
delete_index: 'DELETE' 'INDEX' 'ON' key;

update_vertex: 'UPDATE' 'VERTEX' id set_clause;
update_edge: 'UPDATE' 'EDGE' label? 'FROM' sourceId 'TO' destinationId set_clause;

sourceId: id;
destinationId: id;
cost: STRING;
set_clause: 'SET' set_item (',' set_item)*;
set_item: key '=' value;
properties: '{' property (',' property)* '}';
property: key ':' value;

label : STRING;
key: STRING;
value:  INT | FLOAT | QOUTED_STRING |STRING;
id : STRING;


database_command: create_database | delete_database| drop_database | switch_database |get_curr_database | switch_database_to_default | drop_default_database | get_curr_database | reshard_curr_database | assert_graph_type;
assert_graph_type: 'ASSERT' 'GRAPH_TYPE' 'IS' graph_type;
graph_type: 'HAMILTONIAN' | 'EULERIAN' | 'CUBIC' | 'SPLIT' | 'STAR' | 'TOURNAMENT' | 'WHEEL' | 'REGULAR' | 'LINE' | 'INTERVAL' | 'BIPARTITE' | ('GRID' rows columns) | 'COMPLETE_BIPARTITE' | 'REGULAR_BIPARTITE';
rows: value;
columns: value;
reshard_curr_database: 'RESHARD' 'DATABASE' 'USING' sharding_strategy;
sharding_strategy: ('HASH' | 'RANDOM' | 'EQUAL' | 'ROUND_ROBIN' | 'TARJAN');
create_database: 'CREATE' 'DATABASE' database_name;
delete_database: 'DELETE' 'DATABASE' database_name;
drop_database: 'DROP' 'DATABASE' database_name;
switch_database : 'SWITCH' 'DATABASE' database_name;
get_curr_database: 'GET' 'CURRENT' 'DATABASE';

switch_database_to_default: 'SWITCH' 'DATABASE' 'TO' 'DEFAULT';
drop_default_database: 'DROP' 'DEFAULT' 'DATABASE';

database_name: STRING;
match_query: 'MATCH' (path_query | shortest_path_query | topological_sort_query | maximum_flow_query | minimum_spanning_tree_query | bridge_edges_query | all_shortest_paths_query | eccentricity_query | radius_query | diameter_query | articulation_points_query | girth_query | vertex_connectivity_query | edge_connectivity_query | strongly_connected_components_query);
diameter_query: 'DIAMETER';
strongly_connected_components_query: 'STRONGLY' 'CONNECTED' 'COMPONENTS';
vertex_connectivity_query: 'VERTEX' 'CONNECTIVITY' 'WITH CAPACITY =' cost;
edge_connectivity_query: 'EDGE' 'CONNECTIVITY' 'WITH CAPACITY =' cost;
girth_query: 'GIRTH';
articulation_points_query: 'ARTICULATION' 'POINTS';
radius_query: 'RADIUS';
eccentricity_query: 'ECCENTRICITY' 'OF' id;
all_shortest_paths_query: 'ALL' 'SHORTEST' 'PATHS' 'WITH COST =' cost;
bridge_edges_query: 'BRIDGE' 'EDGES';
minimum_spanning_tree_query: 'MINIMUM' 'SPANNING' 'TREE' 'WITH COST =' cost;
maximum_flow_query: 'MAXIMUM' 'FLOW' 'FROM' sourceId 'TO' destinationId 'WITH CAPACITY =' cost;
topological_sort_query: 'TOPOLOGICAL' 'SORT';
shortest_path_query: 'SHORTEST' 'PATH' 'FROM' sourceId 'TO' destinationId 'WITH COST =' cost (heuristic)? (has_negative)?;
has_negative: 'HAS' 'NEGATIVE';
heuristic: 'USING HUERISTIC' heuristic_function;
heuristic_function: manhattan | euclidean | octile | chebyshev;
chebyshev: 'CHEBYSHEV' '(' 'x ='first_variable ',' 'y ='second_variable ')';
octile: 'OCTILE' '(' 'x ='first_variable ',' 'y ='second_variable ')';
manhattan: 'MANHATTAN' '(' 'x ='first_variable ',' 'y ='second_variable ')';
euclidean: 'EUCLIDEAN' '(' 'x ='first_variable ',' 'y ='second_variable ')';
first_variable: variable;
second_variable: variable;
path_query: path where_clause? return_clause;

path: starting_vertex (path_level )*;
starting_vertex: vertex_binding;
path_level: edge_binding vertex_binding;
vertex_binding: '[('id?  (':' label)? selectOperators? ')' alias? ']';
alias: 'AS' variable;
variable : STRING;
edge_binding: out_edge_binding | in_edge_binding;
out_edge_binding: '-' label? ('WITH'  selectOperators)? alias? '->';
in_edge_binding: '<-' label? ('WITH'  selectOperators)? alias? '-';

selectOperators: '{'selectOperator (',' selectOperator)*'}';
selectOperator: fieldName operator fieldValue;

fieldName: STRING;
fieldValue:INT|FLOAT|QOUTED_STRING|STRING;
operator: '=' | '<>' | '<' | '>' | '<=' | '>=' ;

where_clause: 'WHERE';

return_clause: 'RETURN' return_item (',' return_item)*;

return_item: variable | variable'.'fieldName;



// Define the entry point for the parser
start: command;

