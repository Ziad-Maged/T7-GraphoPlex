// Generated from /home/ziad/IdeaProjects/GraphoPlexTesting/src/main/java/com/server/graph_db/parser/Ql.g4 by ANTLR 4.13.1
package com.server.graph_db.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QlParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(QlParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#crud_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrud_command(QlParser.Crud_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#vertex_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex_command(QlParser.Vertex_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#edge_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_command(QlParser.Edge_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#index_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_command(QlParser.Index_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(QlParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(QlParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(QlParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#create_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_vertex(QlParser.Create_vertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#create_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_edge(QlParser.Create_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(QlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#delete_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_vertex(QlParser.Delete_vertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#delete_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_edge(QlParser.Delete_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#delete_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_index(QlParser.Delete_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#update_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_vertex(QlParser.Update_vertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#update_edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_edge(QlParser.Update_edgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#sourceId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceId(QlParser.SourceIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#destinationId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestinationId(QlParser.DestinationIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost(QlParser.CostContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(QlParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#set_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_item(QlParser.Set_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(QlParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(QlParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(QlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(QlParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(QlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(QlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#database_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_command(QlParser.Database_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#reshard_curr_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReshard_curr_database(QlParser.Reshard_curr_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#sharding_strategy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSharding_strategy(QlParser.Sharding_strategyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(QlParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#delete_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_database(QlParser.Delete_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(QlParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#switch_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_database(QlParser.Switch_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#get_curr_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_curr_database(QlParser.Get_curr_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#switch_database_to_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_database_to_default(QlParser.Switch_database_to_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#drop_default_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_default_database(QlParser.Drop_default_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(QlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#match_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_query(QlParser.Match_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#all_shortest_paths_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_shortest_paths_query(QlParser.All_shortest_paths_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#bridge_edges_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBridge_edges_query(QlParser.Bridge_edges_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#minimum_spanning_tree_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinimum_spanning_tree_query(QlParser.Minimum_spanning_tree_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#maximum_flow_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximum_flow_query(QlParser.Maximum_flow_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#topological_sort_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopological_sort_query(QlParser.Topological_sort_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#shortest_path_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortest_path_query(QlParser.Shortest_path_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#heuristic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeuristic(QlParser.HeuristicContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#heuristic_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeuristic_function(QlParser.Heuristic_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#manhattan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManhattan(QlParser.ManhattanContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#euclidean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEuclidean(QlParser.EuclideanContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#first_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_variable(QlParser.First_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#second_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_variable(QlParser.Second_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#path_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_query(QlParser.Path_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(QlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#starting_vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarting_vertex(QlParser.Starting_vertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#path_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_level(QlParser.Path_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#vertex_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex_binding(QlParser.Vertex_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(QlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(QlParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#edge_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_binding(QlParser.Edge_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#out_edge_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_edge_binding(QlParser.Out_edge_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#in_edge_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_edge_binding(QlParser.In_edge_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#selectOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOperators(QlParser.SelectOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#selectOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOperator(QlParser.SelectOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(QlParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#fieldValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldValue(QlParser.FieldValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(QlParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(QlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#return_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_clause(QlParser.Return_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#return_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_item(QlParser.Return_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link QlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(QlParser.StartContext ctx);
}