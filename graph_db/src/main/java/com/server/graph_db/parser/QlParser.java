// Generated from /home/ziad/IdeaProjects/GraphoPlexTesting/src/main/java/com/server/graph_db/parser/Ql.g4 by ANTLR 4.13.1
package com.server.graph_db.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class QlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, STRING=99, INT=100, FLOAT=101, 
		WS=102, QOUTED_STRING=103;
	public static final int
		RULE_command = 0, RULE_crud_command = 1, RULE_vertex_command = 2, RULE_edge_command = 3, 
		RULE_index_command = 4, RULE_create = 5, RULE_delete = 6, RULE_update = 7, 
		RULE_create_vertex = 8, RULE_create_edge = 9, RULE_create_index = 10, 
		RULE_delete_vertex = 11, RULE_delete_edge = 12, RULE_delete_index = 13, 
		RULE_update_vertex = 14, RULE_update_edge = 15, RULE_sourceId = 16, RULE_destinationId = 17, 
		RULE_cost = 18, RULE_set_clause = 19, RULE_set_item = 20, RULE_properties = 21, 
		RULE_property = 22, RULE_label = 23, RULE_key = 24, RULE_value = 25, RULE_id = 26, 
		RULE_database_command = 27, RULE_assert_graph_type = 28, RULE_graph_type = 29, 
		RULE_rows = 30, RULE_columns = 31, RULE_reshard_curr_database = 32, RULE_sharding_strategy = 33, 
		RULE_create_database = 34, RULE_delete_database = 35, RULE_drop_database = 36, 
		RULE_switch_database = 37, RULE_get_curr_database = 38, RULE_switch_database_to_default = 39, 
		RULE_drop_default_database = 40, RULE_database_name = 41, RULE_match_query = 42, 
		RULE_diameter_query = 43, RULE_strongly_connected_components_query = 44, 
		RULE_vertex_connectivity_query = 45, RULE_edge_connectivity_query = 46, 
		RULE_girth_query = 47, RULE_articulation_points_query = 48, RULE_radius_query = 49, 
		RULE_eccentricity_query = 50, RULE_all_shortest_paths_query = 51, RULE_bridge_edges_query = 52, 
		RULE_minimum_spanning_tree_query = 53, RULE_maximum_flow_query = 54, RULE_topological_sort_query = 55, 
		RULE_shortest_path_query = 56, RULE_has_negative = 57, RULE_heuristic = 58, 
		RULE_heuristic_function = 59, RULE_chebyshev = 60, RULE_octile = 61, RULE_manhattan = 62, 
		RULE_euclidean = 63, RULE_first_variable = 64, RULE_second_variable = 65, 
		RULE_path_query = 66, RULE_path = 67, RULE_starting_vertex = 68, RULE_path_level = 69, 
		RULE_vertex_binding = 70, RULE_alias = 71, RULE_variable = 72, RULE_edge_binding = 73, 
		RULE_out_edge_binding = 74, RULE_in_edge_binding = 75, RULE_selectOperators = 76, 
		RULE_selectOperator = 77, RULE_fieldName = 78, RULE_fieldValue = 79, RULE_operator = 80, 
		RULE_where_clause = 81, RULE_return_clause = 82, RULE_return_item = 83, 
		RULE_start = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "crud_command", "vertex_command", "edge_command", "index_command", 
			"create", "delete", "update", "create_vertex", "create_edge", "create_index", 
			"delete_vertex", "delete_edge", "delete_index", "update_vertex", "update_edge", 
			"sourceId", "destinationId", "cost", "set_clause", "set_item", "properties", 
			"property", "label", "key", "value", "id", "database_command", "assert_graph_type", 
			"graph_type", "rows", "columns", "reshard_curr_database", "sharding_strategy", 
			"create_database", "delete_database", "drop_database", "switch_database", 
			"get_curr_database", "switch_database_to_default", "drop_default_database", 
			"database_name", "match_query", "diameter_query", "strongly_connected_components_query", 
			"vertex_connectivity_query", "edge_connectivity_query", "girth_query", 
			"articulation_points_query", "radius_query", "eccentricity_query", "all_shortest_paths_query", 
			"bridge_edges_query", "minimum_spanning_tree_query", "maximum_flow_query", 
			"topological_sort_query", "shortest_path_query", "has_negative", "heuristic", 
			"heuristic_function", "chebyshev", "octile", "manhattan", "euclidean", 
			"first_variable", "second_variable", "path_query", "path", "starting_vertex", 
			"path_level", "vertex_binding", "alias", "variable", "edge_binding", 
			"out_edge_binding", "in_edge_binding", "selectOperators", "selectOperator", 
			"fieldName", "fieldValue", "operator", "where_clause", "return_clause", 
			"return_item", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'DELETE'", "'UPDATE'", "'VERTEX'", "'('", "':'", "')'", 
			"'EDGE'", "'FROM'", "'TO'", "'WITH'", "'INDEX'", "'ON'", "'SET'", "','", 
			"'='", "'{'", "'}'", "'ASSERT'", "'GRAPH_TYPE'", "'IS'", "'HAMILTONIAN'", 
			"'EULERIAN'", "'CUBIC'", "'SPLIT'", "'STAR'", "'TOURNAMENT'", "'WHEEL'", 
			"'REGULAR'", "'LINE'", "'INTERVAL'", "'BIPARTITE'", "'GRID'", "'COMPLETE_BIPARTITE'", 
			"'REGULAR_BIPARTITE'", "'RESHARD'", "'DATABASE'", "'USING'", "'HASH'", 
			"'RANDOM'", "'EQUAL'", "'ROUND_ROBIN'", "'TARJAN'", "'DROP'", "'SWITCH'", 
			"'GET'", "'CURRENT'", "'DEFAULT'", "'MATCH'", "'DIAMETER'", "'STRONGLY'", 
			"'CONNECTED'", "'COMPONENTS'", "'CONNECTIVITY'", "'WITH CAPACITY ='", 
			"'GIRTH'", "'ARTICULATION'", "'POINTS'", "'RADIUS'", "'ECCENTRICITY'", 
			"'OF'", "'ALL'", "'SHORTEST'", "'PATHS'", "'WITH COST ='", "'BRIDGE'", 
			"'EDGES'", "'MINIMUM'", "'SPANNING'", "'TREE'", "'MAXIMUM'", "'FLOW'", 
			"'TOPOLOGICAL'", "'SORT'", "'PATH'", "'HAS'", "'NEGATIVE'", "'USING HUERISTIC'", 
			"'CHEBYSHEV'", "'x ='", "'y ='", "'OCTILE'", "'MANHATTAN'", "'EUCLIDEAN'", 
			"'[('", "']'", "'AS'", "'-'", "'->'", "'<-'", "'<>'", "'<'", "'>'", "'<='", 
			"'>='", "'WHERE'", "'RETURN'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "INT", "FLOAT", "WS", "QOUTED_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Ql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public Match_queryContext match_query() {
			return getRuleContext(Match_queryContext.class,0);
		}
		public Crud_commandContext crud_command() {
			return getRuleContext(Crud_commandContext.class,0);
		}
		public Database_commandContext database_command() {
			return getRuleContext(Database_commandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match_query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				crud_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				database_command();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Crud_commandContext extends ParserRuleContext {
		public Vertex_commandContext vertex_command() {
			return getRuleContext(Vertex_commandContext.class,0);
		}
		public Edge_commandContext edge_command() {
			return getRuleContext(Edge_commandContext.class,0);
		}
		public Index_commandContext index_command() {
			return getRuleContext(Index_commandContext.class,0);
		}
		public Crud_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crud_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCrud_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCrud_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCrud_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Crud_commandContext crud_command() throws RecognitionException {
		Crud_commandContext _localctx = new Crud_commandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_crud_command);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				vertex_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				edge_command();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				index_command();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vertex_commandContext extends ParserRuleContext {
		public Create_vertexContext create_vertex() {
			return getRuleContext(Create_vertexContext.class,0);
		}
		public Delete_vertexContext delete_vertex() {
			return getRuleContext(Delete_vertexContext.class,0);
		}
		public Update_vertexContext update_vertex() {
			return getRuleContext(Update_vertexContext.class,0);
		}
		public Vertex_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterVertex_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitVertex_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitVertex_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_commandContext vertex_command() throws RecognitionException {
		Vertex_commandContext _localctx = new Vertex_commandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vertex_command);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				create_vertex();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				delete_vertex();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				update_vertex();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_commandContext extends ParserRuleContext {
		public Create_edgeContext create_edge() {
			return getRuleContext(Create_edgeContext.class,0);
		}
		public Delete_edgeContext delete_edge() {
			return getRuleContext(Delete_edgeContext.class,0);
		}
		public Update_edgeContext update_edge() {
			return getRuleContext(Update_edgeContext.class,0);
		}
		public Edge_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterEdge_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitEdge_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitEdge_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_commandContext edge_command() throws RecognitionException {
		Edge_commandContext _localctx = new Edge_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_edge_command);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				create_edge();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				delete_edge();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				update_edge();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Index_commandContext extends ParserRuleContext {
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Delete_indexContext delete_index() {
			return getRuleContext(Delete_indexContext.class,0);
		}
		public Index_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterIndex_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitIndex_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitIndex_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_commandContext index_command() throws RecognitionException {
		Index_commandContext _localctx = new Index_commandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_index_command);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				create_index();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				delete_index();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreateContext extends ParserRuleContext {
		public Create_vertexContext create_vertex() {
			return getRuleContext(Create_vertexContext.class,0);
		}
		public Create_edgeContext create_edge() {
			return getRuleContext(Create_edgeContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__0);
				setState(195);
				create_vertex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				create_edge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				create_index();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteContext extends ParserRuleContext {
		public Delete_vertexContext delete_vertex() {
			return getRuleContext(Delete_vertexContext.class,0);
		}
		public Delete_edgeContext delete_edge() {
			return getRuleContext(Delete_edgeContext.class,0);
		}
		public Delete_indexContext delete_index() {
			return getRuleContext(Delete_indexContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__1);
				setState(201);
				delete_vertex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				delete_edge();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				delete_index();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public Update_vertexContext update_vertex() {
			return getRuleContext(Update_vertexContext.class,0);
		}
		public Update_edgeContext update_edge() {
			return getRuleContext(Update_edgeContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_update);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__2);
				setState(207);
				update_vertex();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				update_edge();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_vertexContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Create_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCreate_vertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCreate_vertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCreate_vertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_vertexContext create_vertex() throws RecognitionException {
		Create_vertexContext _localctx = new Create_vertexContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_vertex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__0);
			setState(212);
			match(T__3);
			setState(213);
			match(T__4);
			setState(214);
			id();
			setState(215);
			match(T__5);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(216);
				label();
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(219);
				properties();
				}
			}

			setState(222);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_edgeContext extends ParserRuleContext {
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public DestinationIdContext destinationId() {
			return getRuleContext(DestinationIdContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public Create_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCreate_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCreate_edge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCreate_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_edgeContext create_edge() throws RecognitionException {
		Create_edgeContext _localctx = new Create_edgeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__0);
			setState(225);
			match(T__7);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(226);
				label();
				}
			}

			setState(229);
			match(T__8);
			setState(230);
			sourceId();
			setState(231);
			match(T__9);
			setState(232);
			destinationId();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(233);
				match(T__10);
				setState(234);
				properties();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_indexContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCreate_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__0);
			setState(238);
			match(T__11);
			setState(239);
			match(T__12);
			setState(240);
			key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_vertexContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Delete_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDelete_vertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDelete_vertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDelete_vertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_vertexContext delete_vertex() throws RecognitionException {
		Delete_vertexContext _localctx = new Delete_vertexContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delete_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__1);
			setState(243);
			match(T__3);
			setState(244);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_edgeContext extends ParserRuleContext {
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public DestinationIdContext destinationId() {
			return getRuleContext(DestinationIdContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Delete_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDelete_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDelete_edge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDelete_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_edgeContext delete_edge() throws RecognitionException {
		Delete_edgeContext _localctx = new Delete_edgeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_delete_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__1);
			setState(247);
			match(T__7);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(248);
				label();
				}
			}

			setState(251);
			match(T__8);
			setState(252);
			sourceId();
			setState(253);
			match(T__9);
			setState(254);
			destinationId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_indexContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public Delete_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDelete_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDelete_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDelete_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_indexContext delete_index() throws RecognitionException {
		Delete_indexContext _localctx = new Delete_indexContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_delete_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__1);
			setState(257);
			match(T__11);
			setState(258);
			match(T__12);
			setState(259);
			key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_vertexContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public Update_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterUpdate_vertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitUpdate_vertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitUpdate_vertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_vertexContext update_vertex() throws RecognitionException {
		Update_vertexContext _localctx = new Update_vertexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__2);
			setState(262);
			match(T__3);
			setState(263);
			id();
			setState(264);
			set_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_edgeContext extends ParserRuleContext {
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public DestinationIdContext destinationId() {
			return getRuleContext(DestinationIdContext.class,0);
		}
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Update_edgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterUpdate_edge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitUpdate_edge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitUpdate_edge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_edgeContext update_edge() throws RecognitionException {
		Update_edgeContext _localctx = new Update_edgeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_update_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__2);
			setState(267);
			match(T__7);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(268);
				label();
				}
			}

			setState(271);
			match(T__8);
			setState(272);
			sourceId();
			setState(273);
			match(T__9);
			setState(274);
			destinationId();
			setState(275);
			set_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SourceIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSourceId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSourceId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSourceId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceIdContext sourceId() throws RecognitionException {
		SourceIdContext _localctx = new SourceIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sourceId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DestinationIdContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public DestinationIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destinationId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDestinationId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDestinationId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDestinationId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestinationIdContext destinationId() throws RecognitionException {
		DestinationIdContext _localctx = new DestinationIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_destinationId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CostContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public CostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CostContext cost() throws RecognitionException {
		CostContext _localctx = new CostContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_clauseContext extends ParserRuleContext {
		public List<Set_itemContext> set_item() {
			return getRuleContexts(Set_itemContext.class);
		}
		public Set_itemContext set_item(int i) {
			return getRuleContext(Set_itemContext.class,i);
		}
		public Set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_clauseContext set_clause() throws RecognitionException {
		Set_clauseContext _localctx = new Set_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_set_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__13);
			setState(284);
			set_item();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(285);
				match(T__14);
				setState(286);
				set_item();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Set_itemContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Set_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSet_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSet_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSet_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_itemContext set_item() throws RecognitionException {
		Set_itemContext _localctx = new Set_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_set_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			key();
			setState(293);
			match(T__15);
			setState(294);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__16);
			setState(297);
			property();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(298);
				match(T__14);
				setState(299);
				property();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			key();
			setState(308);
			match(T__5);
			setState(309);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QlParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(QlParser.FLOAT, 0); }
		public TerminalNode QOUTED_STRING() { return getToken(QlParser.QOUTED_STRING, 0); }
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 23L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_commandContext extends ParserRuleContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Delete_databaseContext delete_database() {
			return getRuleContext(Delete_databaseContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Switch_databaseContext switch_database() {
			return getRuleContext(Switch_databaseContext.class,0);
		}
		public Get_curr_databaseContext get_curr_database() {
			return getRuleContext(Get_curr_databaseContext.class,0);
		}
		public Switch_database_to_defaultContext switch_database_to_default() {
			return getRuleContext(Switch_database_to_defaultContext.class,0);
		}
		public Drop_default_databaseContext drop_default_database() {
			return getRuleContext(Drop_default_databaseContext.class,0);
		}
		public Reshard_curr_databaseContext reshard_curr_database() {
			return getRuleContext(Reshard_curr_databaseContext.class,0);
		}
		public Assert_graph_typeContext assert_graph_type() {
			return getRuleContext(Assert_graph_typeContext.class,0);
		}
		public Database_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDatabase_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDatabase_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDatabase_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_commandContext database_command() throws RecognitionException {
		Database_commandContext _localctx = new Database_commandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_database_command);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				create_database();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				delete_database();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				drop_database();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				switch_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				get_curr_database();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				switch_database_to_default();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				drop_default_database();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				get_curr_database();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(327);
				reshard_curr_database();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(328);
				assert_graph_type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assert_graph_typeContext extends ParserRuleContext {
		public Graph_typeContext graph_type() {
			return getRuleContext(Graph_typeContext.class,0);
		}
		public Assert_graph_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_graph_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterAssert_graph_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitAssert_graph_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitAssert_graph_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_graph_typeContext assert_graph_type() throws RecognitionException {
		Assert_graph_typeContext _localctx = new Assert_graph_typeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assert_graph_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__18);
			setState(332);
			match(T__19);
			setState(333);
			match(T__20);
			setState(334);
			graph_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Graph_typeContext extends ParserRuleContext {
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public Graph_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterGraph_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitGraph_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitGraph_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Graph_typeContext graph_type() throws RecognitionException {
		Graph_typeContext _localctx = new Graph_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_graph_type);
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__22);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(T__24);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(T__25);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(T__26);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(T__27);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 8);
				{
				setState(343);
				match(T__28);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(344);
				match(T__29);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				setState(345);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(346);
				match(T__31);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(347);
				match(T__32);
				setState(348);
				rows();
				setState(349);
				columns();
				}
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 13);
				{
				setState(351);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 14);
				{
				setState(352);
				match(T__34);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RowsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitRows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rows);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnsContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reshard_curr_databaseContext extends ParserRuleContext {
		public Sharding_strategyContext sharding_strategy() {
			return getRuleContext(Sharding_strategyContext.class,0);
		}
		public Reshard_curr_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reshard_curr_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterReshard_curr_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitReshard_curr_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitReshard_curr_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reshard_curr_databaseContext reshard_curr_database() throws RecognitionException {
		Reshard_curr_databaseContext _localctx = new Reshard_curr_databaseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_reshard_curr_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__35);
			setState(360);
			match(T__36);
			setState(361);
			match(T__37);
			setState(362);
			sharding_strategy();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sharding_strategyContext extends ParserRuleContext {
		public Sharding_strategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sharding_strategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSharding_strategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSharding_strategy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSharding_strategy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sharding_strategyContext sharding_strategy() throws RecognitionException {
		Sharding_strategyContext _localctx = new Sharding_strategyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sharding_strategy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17042430230528L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_databaseContext extends ParserRuleContext {
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitCreate_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__0);
			setState(367);
			match(T__36);
			setState(368);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_databaseContext extends ParserRuleContext {
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Delete_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDelete_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDelete_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDelete_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_databaseContext delete_database() throws RecognitionException {
		Delete_databaseContext _localctx = new Delete_databaseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_delete_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__1);
			setState(371);
			match(T__36);
			setState(372);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_databaseContext extends ParserRuleContext {
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDrop_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDrop_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDrop_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__43);
			setState(375);
			match(T__36);
			setState(376);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_databaseContext extends ParserRuleContext {
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Switch_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSwitch_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSwitch_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSwitch_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_databaseContext switch_database() throws RecognitionException {
		Switch_databaseContext _localctx = new Switch_databaseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switch_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__44);
			setState(379);
			match(T__36);
			setState(380);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_curr_databaseContext extends ParserRuleContext {
		public Get_curr_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_curr_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterGet_curr_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitGet_curr_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitGet_curr_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_curr_databaseContext get_curr_database() throws RecognitionException {
		Get_curr_databaseContext _localctx = new Get_curr_databaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_get_curr_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__45);
			setState(383);
			match(T__46);
			setState(384);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_database_to_defaultContext extends ParserRuleContext {
		public Switch_database_to_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_database_to_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSwitch_database_to_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSwitch_database_to_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSwitch_database_to_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_database_to_defaultContext switch_database_to_default() throws RecognitionException {
		Switch_database_to_defaultContext _localctx = new Switch_database_to_defaultContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_switch_database_to_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__44);
			setState(387);
			match(T__36);
			setState(388);
			match(T__9);
			setState(389);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_default_databaseContext extends ParserRuleContext {
		public Drop_default_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_default_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDrop_default_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDrop_default_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDrop_default_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_default_databaseContext drop_default_database() throws RecognitionException {
		Drop_default_databaseContext _localctx = new Drop_default_databaseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_drop_default_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__43);
			setState(392);
			match(T__47);
			setState(393);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Match_queryContext extends ParserRuleContext {
		public Path_queryContext path_query() {
			return getRuleContext(Path_queryContext.class,0);
		}
		public Shortest_path_queryContext shortest_path_query() {
			return getRuleContext(Shortest_path_queryContext.class,0);
		}
		public Topological_sort_queryContext topological_sort_query() {
			return getRuleContext(Topological_sort_queryContext.class,0);
		}
		public Maximum_flow_queryContext maximum_flow_query() {
			return getRuleContext(Maximum_flow_queryContext.class,0);
		}
		public Minimum_spanning_tree_queryContext minimum_spanning_tree_query() {
			return getRuleContext(Minimum_spanning_tree_queryContext.class,0);
		}
		public Bridge_edges_queryContext bridge_edges_query() {
			return getRuleContext(Bridge_edges_queryContext.class,0);
		}
		public All_shortest_paths_queryContext all_shortest_paths_query() {
			return getRuleContext(All_shortest_paths_queryContext.class,0);
		}
		public Eccentricity_queryContext eccentricity_query() {
			return getRuleContext(Eccentricity_queryContext.class,0);
		}
		public Radius_queryContext radius_query() {
			return getRuleContext(Radius_queryContext.class,0);
		}
		public Diameter_queryContext diameter_query() {
			return getRuleContext(Diameter_queryContext.class,0);
		}
		public Articulation_points_queryContext articulation_points_query() {
			return getRuleContext(Articulation_points_queryContext.class,0);
		}
		public Girth_queryContext girth_query() {
			return getRuleContext(Girth_queryContext.class,0);
		}
		public Vertex_connectivity_queryContext vertex_connectivity_query() {
			return getRuleContext(Vertex_connectivity_queryContext.class,0);
		}
		public Edge_connectivity_queryContext edge_connectivity_query() {
			return getRuleContext(Edge_connectivity_queryContext.class,0);
		}
		public Strongly_connected_components_queryContext strongly_connected_components_query() {
			return getRuleContext(Strongly_connected_components_queryContext.class,0);
		}
		public Match_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterMatch_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitMatch_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitMatch_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_queryContext match_query() throws RecognitionException {
		Match_queryContext _localctx = new Match_queryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_match_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__48);
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__84:
				{
				setState(398);
				path_query();
				}
				break;
			case T__62:
				{
				setState(399);
				shortest_path_query();
				}
				break;
			case T__72:
				{
				setState(400);
				topological_sort_query();
				}
				break;
			case T__70:
				{
				setState(401);
				maximum_flow_query();
				}
				break;
			case T__67:
				{
				setState(402);
				minimum_spanning_tree_query();
				}
				break;
			case T__65:
				{
				setState(403);
				bridge_edges_query();
				}
				break;
			case T__61:
				{
				setState(404);
				all_shortest_paths_query();
				}
				break;
			case T__59:
				{
				setState(405);
				eccentricity_query();
				}
				break;
			case T__58:
				{
				setState(406);
				radius_query();
				}
				break;
			case T__49:
				{
				setState(407);
				diameter_query();
				}
				break;
			case T__56:
				{
				setState(408);
				articulation_points_query();
				}
				break;
			case T__55:
				{
				setState(409);
				girth_query();
				}
				break;
			case T__3:
				{
				setState(410);
				vertex_connectivity_query();
				}
				break;
			case T__7:
				{
				setState(411);
				edge_connectivity_query();
				}
				break;
			case T__50:
				{
				setState(412);
				strongly_connected_components_query();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Diameter_queryContext extends ParserRuleContext {
		public Diameter_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diameter_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterDiameter_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitDiameter_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitDiameter_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Diameter_queryContext diameter_query() throws RecognitionException {
		Diameter_queryContext _localctx = new Diameter_queryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_diameter_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__49);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Strongly_connected_components_queryContext extends ParserRuleContext {
		public Strongly_connected_components_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strongly_connected_components_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterStrongly_connected_components_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitStrongly_connected_components_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitStrongly_connected_components_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Strongly_connected_components_queryContext strongly_connected_components_query() throws RecognitionException {
		Strongly_connected_components_queryContext _localctx = new Strongly_connected_components_queryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_strongly_connected_components_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__50);
			setState(418);
			match(T__51);
			setState(419);
			match(T__52);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vertex_connectivity_queryContext extends ParserRuleContext {
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Vertex_connectivity_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_connectivity_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterVertex_connectivity_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitVertex_connectivity_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitVertex_connectivity_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_connectivity_queryContext vertex_connectivity_query() throws RecognitionException {
		Vertex_connectivity_queryContext _localctx = new Vertex_connectivity_queryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_vertex_connectivity_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(T__3);
			setState(422);
			match(T__53);
			setState(423);
			match(T__54);
			setState(424);
			cost();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_connectivity_queryContext extends ParserRuleContext {
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Edge_connectivity_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_connectivity_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterEdge_connectivity_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitEdge_connectivity_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitEdge_connectivity_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_connectivity_queryContext edge_connectivity_query() throws RecognitionException {
		Edge_connectivity_queryContext _localctx = new Edge_connectivity_queryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_edge_connectivity_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__7);
			setState(427);
			match(T__53);
			setState(428);
			match(T__54);
			setState(429);
			cost();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Girth_queryContext extends ParserRuleContext {
		public Girth_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_girth_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterGirth_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitGirth_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitGirth_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Girth_queryContext girth_query() throws RecognitionException {
		Girth_queryContext _localctx = new Girth_queryContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_girth_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Articulation_points_queryContext extends ParserRuleContext {
		public Articulation_points_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articulation_points_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterArticulation_points_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitArticulation_points_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitArticulation_points_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Articulation_points_queryContext articulation_points_query() throws RecognitionException {
		Articulation_points_queryContext _localctx = new Articulation_points_queryContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_articulation_points_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__56);
			setState(434);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Radius_queryContext extends ParserRuleContext {
		public Radius_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radius_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterRadius_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitRadius_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitRadius_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Radius_queryContext radius_query() throws RecognitionException {
		Radius_queryContext _localctx = new Radius_queryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_radius_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Eccentricity_queryContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Eccentricity_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eccentricity_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterEccentricity_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitEccentricity_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitEccentricity_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eccentricity_queryContext eccentricity_query() throws RecognitionException {
		Eccentricity_queryContext _localctx = new Eccentricity_queryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_eccentricity_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__59);
			setState(439);
			match(T__60);
			setState(440);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class All_shortest_paths_queryContext extends ParserRuleContext {
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public All_shortest_paths_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_shortest_paths_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterAll_shortest_paths_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitAll_shortest_paths_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitAll_shortest_paths_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_shortest_paths_queryContext all_shortest_paths_query() throws RecognitionException {
		All_shortest_paths_queryContext _localctx = new All_shortest_paths_queryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_all_shortest_paths_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__61);
			setState(443);
			match(T__62);
			setState(444);
			match(T__63);
			setState(445);
			match(T__64);
			setState(446);
			cost();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bridge_edges_queryContext extends ParserRuleContext {
		public Bridge_edges_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bridge_edges_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterBridge_edges_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitBridge_edges_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitBridge_edges_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bridge_edges_queryContext bridge_edges_query() throws RecognitionException {
		Bridge_edges_queryContext _localctx = new Bridge_edges_queryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_bridge_edges_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__65);
			setState(449);
			match(T__66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Minimum_spanning_tree_queryContext extends ParserRuleContext {
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Minimum_spanning_tree_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimum_spanning_tree_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterMinimum_spanning_tree_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitMinimum_spanning_tree_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitMinimum_spanning_tree_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minimum_spanning_tree_queryContext minimum_spanning_tree_query() throws RecognitionException {
		Minimum_spanning_tree_queryContext _localctx = new Minimum_spanning_tree_queryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_minimum_spanning_tree_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__67);
			setState(452);
			match(T__68);
			setState(453);
			match(T__69);
			setState(454);
			match(T__64);
			setState(455);
			cost();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Maximum_flow_queryContext extends ParserRuleContext {
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public DestinationIdContext destinationId() {
			return getRuleContext(DestinationIdContext.class,0);
		}
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Maximum_flow_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maximum_flow_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterMaximum_flow_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitMaximum_flow_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitMaximum_flow_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Maximum_flow_queryContext maximum_flow_query() throws RecognitionException {
		Maximum_flow_queryContext _localctx = new Maximum_flow_queryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_maximum_flow_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(T__70);
			setState(458);
			match(T__71);
			setState(459);
			match(T__8);
			setState(460);
			sourceId();
			setState(461);
			match(T__9);
			setState(462);
			destinationId();
			setState(463);
			match(T__54);
			setState(464);
			cost();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Topological_sort_queryContext extends ParserRuleContext {
		public Topological_sort_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topological_sort_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterTopological_sort_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitTopological_sort_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitTopological_sort_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Topological_sort_queryContext topological_sort_query() throws RecognitionException {
		Topological_sort_queryContext _localctx = new Topological_sort_queryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_topological_sort_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(T__72);
			setState(467);
			match(T__73);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shortest_path_queryContext extends ParserRuleContext {
		public SourceIdContext sourceId() {
			return getRuleContext(SourceIdContext.class,0);
		}
		public DestinationIdContext destinationId() {
			return getRuleContext(DestinationIdContext.class,0);
		}
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public HeuristicContext heuristic() {
			return getRuleContext(HeuristicContext.class,0);
		}
		public Has_negativeContext has_negative() {
			return getRuleContext(Has_negativeContext.class,0);
		}
		public Shortest_path_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortest_path_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterShortest_path_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitShortest_path_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitShortest_path_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shortest_path_queryContext shortest_path_query() throws RecognitionException {
		Shortest_path_queryContext _localctx = new Shortest_path_queryContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_shortest_path_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__62);
			setState(470);
			match(T__74);
			setState(471);
			match(T__8);
			setState(472);
			sourceId();
			setState(473);
			match(T__9);
			setState(474);
			destinationId();
			setState(475);
			match(T__64);
			setState(476);
			cost();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(477);
				heuristic();
				}
			}

			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(480);
				has_negative();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Has_negativeContext extends ParserRuleContext {
		public Has_negativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_has_negative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterHas_negative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitHas_negative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitHas_negative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Has_negativeContext has_negative() throws RecognitionException {
		Has_negativeContext _localctx = new Has_negativeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_has_negative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__75);
			setState(484);
			match(T__76);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeuristicContext extends ParserRuleContext {
		public Heuristic_functionContext heuristic_function() {
			return getRuleContext(Heuristic_functionContext.class,0);
		}
		public HeuristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heuristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterHeuristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitHeuristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitHeuristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeuristicContext heuristic() throws RecognitionException {
		HeuristicContext _localctx = new HeuristicContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_heuristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__77);
			setState(487);
			heuristic_function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Heuristic_functionContext extends ParserRuleContext {
		public ManhattanContext manhattan() {
			return getRuleContext(ManhattanContext.class,0);
		}
		public EuclideanContext euclidean() {
			return getRuleContext(EuclideanContext.class,0);
		}
		public OctileContext octile() {
			return getRuleContext(OctileContext.class,0);
		}
		public ChebyshevContext chebyshev() {
			return getRuleContext(ChebyshevContext.class,0);
		}
		public Heuristic_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heuristic_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterHeuristic_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitHeuristic_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitHeuristic_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Heuristic_functionContext heuristic_function() throws RecognitionException {
		Heuristic_functionContext _localctx = new Heuristic_functionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_heuristic_function);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				manhattan();
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				euclidean();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				octile();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				chebyshev();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChebyshevContext extends ParserRuleContext {
		public First_variableContext first_variable() {
			return getRuleContext(First_variableContext.class,0);
		}
		public Second_variableContext second_variable() {
			return getRuleContext(Second_variableContext.class,0);
		}
		public ChebyshevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chebyshev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterChebyshev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitChebyshev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitChebyshev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChebyshevContext chebyshev() throws RecognitionException {
		ChebyshevContext _localctx = new ChebyshevContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_chebyshev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__78);
			setState(496);
			match(T__4);
			setState(497);
			match(T__79);
			setState(498);
			first_variable();
			setState(499);
			match(T__14);
			setState(500);
			match(T__80);
			setState(501);
			second_variable();
			setState(502);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OctileContext extends ParserRuleContext {
		public First_variableContext first_variable() {
			return getRuleContext(First_variableContext.class,0);
		}
		public Second_variableContext second_variable() {
			return getRuleContext(Second_variableContext.class,0);
		}
		public OctileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterOctile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitOctile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitOctile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctileContext octile() throws RecognitionException {
		OctileContext _localctx = new OctileContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_octile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__81);
			setState(505);
			match(T__4);
			setState(506);
			match(T__79);
			setState(507);
			first_variable();
			setState(508);
			match(T__14);
			setState(509);
			match(T__80);
			setState(510);
			second_variable();
			setState(511);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ManhattanContext extends ParserRuleContext {
		public First_variableContext first_variable() {
			return getRuleContext(First_variableContext.class,0);
		}
		public Second_variableContext second_variable() {
			return getRuleContext(Second_variableContext.class,0);
		}
		public ManhattanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manhattan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterManhattan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitManhattan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitManhattan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManhattanContext manhattan() throws RecognitionException {
		ManhattanContext _localctx = new ManhattanContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_manhattan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__82);
			setState(514);
			match(T__4);
			setState(515);
			match(T__79);
			setState(516);
			first_variable();
			setState(517);
			match(T__14);
			setState(518);
			match(T__80);
			setState(519);
			second_variable();
			setState(520);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EuclideanContext extends ParserRuleContext {
		public First_variableContext first_variable() {
			return getRuleContext(First_variableContext.class,0);
		}
		public Second_variableContext second_variable() {
			return getRuleContext(Second_variableContext.class,0);
		}
		public EuclideanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_euclidean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterEuclidean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitEuclidean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitEuclidean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EuclideanContext euclidean() throws RecognitionException {
		EuclideanContext _localctx = new EuclideanContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_euclidean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__83);
			setState(523);
			match(T__4);
			setState(524);
			match(T__79);
			setState(525);
			first_variable();
			setState(526);
			match(T__14);
			setState(527);
			match(T__80);
			setState(528);
			second_variable();
			setState(529);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class First_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public First_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterFirst_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitFirst_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitFirst_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final First_variableContext first_variable() throws RecognitionException {
		First_variableContext _localctx = new First_variableContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_first_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Second_variableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Second_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSecond_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSecond_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSecond_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_variableContext second_variable() throws RecognitionException {
		Second_variableContext _localctx = new Second_variableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_second_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Path_queryContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Return_clauseContext return_clause() {
			return getRuleContext(Return_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Path_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterPath_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitPath_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitPath_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_queryContext path_query() throws RecognitionException {
		Path_queryContext _localctx = new Path_queryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_path_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			path();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__95) {
				{
				setState(536);
				where_clause();
				}
			}

			setState(539);
			return_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public Starting_vertexContext starting_vertex() {
			return getRuleContext(Starting_vertexContext.class,0);
		}
		public List<Path_levelContext> path_level() {
			return getRuleContexts(Path_levelContext.class);
		}
		public Path_levelContext path_level(int i) {
			return getRuleContext(Path_levelContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			starting_vertex();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__87 || _la==T__89) {
				{
				{
				setState(542);
				path_level();
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Starting_vertexContext extends ParserRuleContext {
		public Vertex_bindingContext vertex_binding() {
			return getRuleContext(Vertex_bindingContext.class,0);
		}
		public Starting_vertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starting_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterStarting_vertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitStarting_vertex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitStarting_vertex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Starting_vertexContext starting_vertex() throws RecognitionException {
		Starting_vertexContext _localctx = new Starting_vertexContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_starting_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			vertex_binding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Path_levelContext extends ParserRuleContext {
		public Edge_bindingContext edge_binding() {
			return getRuleContext(Edge_bindingContext.class,0);
		}
		public Vertex_bindingContext vertex_binding() {
			return getRuleContext(Vertex_bindingContext.class,0);
		}
		public Path_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterPath_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitPath_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitPath_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Path_levelContext path_level() throws RecognitionException {
		Path_levelContext _localctx = new Path_levelContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_path_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			edge_binding();
			setState(551);
			vertex_binding();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vertex_bindingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SelectOperatorsContext selectOperators() {
			return getRuleContext(SelectOperatorsContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Vertex_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterVertex_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitVertex_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitVertex_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vertex_bindingContext vertex_binding() throws RecognitionException {
		Vertex_bindingContext _localctx = new Vertex_bindingContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_vertex_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__84);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(554);
				id();
				}
			}

			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(557);
				match(T__5);
				setState(558);
				label();
				}
			}

			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(561);
				selectOperators();
				}
			}

			setState(564);
			match(T__6);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(565);
				alias();
				}
			}

			setState(568);
			match(T__85);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__86);
			setState(571);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edge_bindingContext extends ParserRuleContext {
		public Out_edge_bindingContext out_edge_binding() {
			return getRuleContext(Out_edge_bindingContext.class,0);
		}
		public In_edge_bindingContext in_edge_binding() {
			return getRuleContext(In_edge_bindingContext.class,0);
		}
		public Edge_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterEdge_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitEdge_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitEdge_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_bindingContext edge_binding() throws RecognitionException {
		Edge_bindingContext _localctx = new Edge_bindingContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_edge_binding);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				out_edge_binding();
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				in_edge_binding();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Out_edge_bindingContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SelectOperatorsContext selectOperators() {
			return getRuleContext(SelectOperatorsContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Out_edge_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_edge_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterOut_edge_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitOut_edge_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitOut_edge_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Out_edge_bindingContext out_edge_binding() throws RecognitionException {
		Out_edge_bindingContext _localctx = new Out_edge_bindingContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_out_edge_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(T__87);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(580);
				label();
				}
			}

			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(583);
				match(T__10);
				setState(584);
				selectOperators();
				}
			}

			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(587);
				alias();
				}
			}

			setState(590);
			match(T__88);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class In_edge_bindingContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public SelectOperatorsContext selectOperators() {
			return getRuleContext(SelectOperatorsContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public In_edge_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_edge_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterIn_edge_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitIn_edge_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitIn_edge_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_edge_bindingContext in_edge_binding() throws RecognitionException {
		In_edge_bindingContext _localctx = new In_edge_bindingContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_in_edge_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(T__89);
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(593);
				label();
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(596);
				match(T__10);
				setState(597);
				selectOperators();
				}
			}

			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(600);
				alias();
				}
			}

			setState(603);
			match(T__87);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectOperatorsContext extends ParserRuleContext {
		public List<SelectOperatorContext> selectOperator() {
			return getRuleContexts(SelectOperatorContext.class);
		}
		public SelectOperatorContext selectOperator(int i) {
			return getRuleContext(SelectOperatorContext.class,i);
		}
		public SelectOperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOperators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSelectOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSelectOperators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSelectOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectOperatorsContext selectOperators() throws RecognitionException {
		SelectOperatorsContext _localctx = new SelectOperatorsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_selectOperators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__16);
			setState(606);
			selectOperator();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(607);
				match(T__14);
				setState(608);
				selectOperator();
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectOperatorContext extends ParserRuleContext {
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public SelectOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterSelectOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitSelectOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitSelectOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectOperatorContext selectOperator() throws RecognitionException {
		SelectOperatorContext _localctx = new SelectOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_selectOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			fieldName();
			setState(617);
			operator();
			setState(618);
			fieldValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitFieldName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitFieldName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(QlParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(QlParser.FLOAT, 0); }
		public TerminalNode QOUTED_STRING() { return getToken(QlParser.QOUTED_STRING, 0); }
		public TerminalNode STRING() { return getToken(QlParser.STRING, 0); }
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitFieldValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_fieldValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 23L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==T__15 || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__95);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_clauseContext extends ParserRuleContext {
		public List<Return_itemContext> return_item() {
			return getRuleContexts(Return_itemContext.class);
		}
		public Return_itemContext return_item(int i) {
			return getRuleContext(Return_itemContext.class,i);
		}
		public Return_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterReturn_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitReturn_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitReturn_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_clauseContext return_clause() throws RecognitionException {
		Return_clauseContext _localctx = new Return_clauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_return_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__96);
			setState(629);
			return_item();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(630);
				match(T__14);
				setState(631);
				return_item();
				}
				}
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_itemContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public Return_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterReturn_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitReturn_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitReturn_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_itemContext return_item() throws RecognitionException {
		Return_itemContext _localctx = new Return_itemContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_return_item);
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				variable();
				setState(639);
				match(T__97);
				setState(640);
				fieldName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QlListener ) ((QlListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QlVisitor ) return ((QlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u0287\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00ae\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u00b3\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00b8\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00bd\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00c1\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c7\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cd\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d2\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001\b\u0003"+
		"\b\u00dd\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00e4\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ec\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00fa\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u010e\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0120\b\u0013\n\u0013\f\u0013\u0123\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u012d\b\u0015\n\u0015\f\u0015\u0130"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u014a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0162\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u019e\b*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u01df\b8\u00018\u00038\u01e2\b8\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0003;\u01ee\b;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0003"+
		"B\u021a\bB\u0001B\u0001B\u0001C\u0001C\u0005C\u0220\bC\nC\fC\u0223\tC"+
		"\u0001D\u0001D\u0001E\u0001E\u0001E\u0001F\u0001F\u0003F\u022c\bF\u0001"+
		"F\u0001F\u0003F\u0230\bF\u0001F\u0003F\u0233\bF\u0001F\u0001F\u0003F\u0237"+
		"\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0003"+
		"I\u0242\bI\u0001J\u0001J\u0003J\u0246\bJ\u0001J\u0001J\u0003J\u024a\b"+
		"J\u0001J\u0003J\u024d\bJ\u0001J\u0001J\u0001K\u0001K\u0003K\u0253\bK\u0001"+
		"K\u0001K\u0003K\u0257\bK\u0001K\u0003K\u025a\bK\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001L\u0005L\u0262\bL\nL\fL\u0265\tL\u0001L\u0001L\u0001M\u0001"+
		"M\u0001M\u0001M\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001"+
		"Q\u0001R\u0001R\u0001R\u0001R\u0005R\u0279\bR\nR\fR\u027c\tR\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0003S\u0283\bS\u0001T\u0001T\u0001T\u0000\u0000"+
		"U\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u0000\u0003\u0002\u0000ceg"+
		"g\u0001\u0000\'+\u0002\u0000\u0010\u0010[_\u0280\u0000\u00ad\u0001\u0000"+
		"\u0000\u0000\u0002\u00b2\u0001\u0000\u0000\u0000\u0004\u00b7\u0001\u0000"+
		"\u0000\u0000\u0006\u00bc\u0001\u0000\u0000\u0000\b\u00c0\u0001\u0000\u0000"+
		"\u0000\n\u00c6\u0001\u0000\u0000\u0000\f\u00cc\u0001\u0000\u0000\u0000"+
		"\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00d3\u0001\u0000\u0000\u0000"+
		"\u0012\u00e0\u0001\u0000\u0000\u0000\u0014\u00ed\u0001\u0000\u0000\u0000"+
		"\u0016\u00f2\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000\u0000\u0000"+
		"\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0105\u0001\u0000\u0000\u0000"+
		"\u001e\u010a\u0001\u0000\u0000\u0000 \u0115\u0001\u0000\u0000\u0000\""+
		"\u0117\u0001\u0000\u0000\u0000$\u0119\u0001\u0000\u0000\u0000&\u011b\u0001"+
		"\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000*\u0128\u0001\u0000\u0000"+
		"\u0000,\u0133\u0001\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u00000"+
		"\u0139\u0001\u0000\u0000\u00002\u013b\u0001\u0000\u0000\u00004\u013d\u0001"+
		"\u0000\u0000\u00006\u0149\u0001\u0000\u0000\u00008\u014b\u0001\u0000\u0000"+
		"\u0000:\u0161\u0001\u0000\u0000\u0000<\u0163\u0001\u0000\u0000\u0000>"+
		"\u0165\u0001\u0000\u0000\u0000@\u0167\u0001\u0000\u0000\u0000B\u016c\u0001"+
		"\u0000\u0000\u0000D\u016e\u0001\u0000\u0000\u0000F\u0172\u0001\u0000\u0000"+
		"\u0000H\u0176\u0001\u0000\u0000\u0000J\u017a\u0001\u0000\u0000\u0000L"+
		"\u017e\u0001\u0000\u0000\u0000N\u0182\u0001\u0000\u0000\u0000P\u0187\u0001"+
		"\u0000\u0000\u0000R\u018b\u0001\u0000\u0000\u0000T\u018d\u0001\u0000\u0000"+
		"\u0000V\u019f\u0001\u0000\u0000\u0000X\u01a1\u0001\u0000\u0000\u0000Z"+
		"\u01a5\u0001\u0000\u0000\u0000\\\u01aa\u0001\u0000\u0000\u0000^\u01af"+
		"\u0001\u0000\u0000\u0000`\u01b1\u0001\u0000\u0000\u0000b\u01b4\u0001\u0000"+
		"\u0000\u0000d\u01b6\u0001\u0000\u0000\u0000f\u01ba\u0001\u0000\u0000\u0000"+
		"h\u01c0\u0001\u0000\u0000\u0000j\u01c3\u0001\u0000\u0000\u0000l\u01c9"+
		"\u0001\u0000\u0000\u0000n\u01d2\u0001\u0000\u0000\u0000p\u01d5\u0001\u0000"+
		"\u0000\u0000r\u01e3\u0001\u0000\u0000\u0000t\u01e6\u0001\u0000\u0000\u0000"+
		"v\u01ed\u0001\u0000\u0000\u0000x\u01ef\u0001\u0000\u0000\u0000z\u01f8"+
		"\u0001\u0000\u0000\u0000|\u0201\u0001\u0000\u0000\u0000~\u020a\u0001\u0000"+
		"\u0000\u0000\u0080\u0213\u0001\u0000\u0000\u0000\u0082\u0215\u0001\u0000"+
		"\u0000\u0000\u0084\u0217\u0001\u0000\u0000\u0000\u0086\u021d\u0001\u0000"+
		"\u0000\u0000\u0088\u0224\u0001\u0000\u0000\u0000\u008a\u0226\u0001\u0000"+
		"\u0000\u0000\u008c\u0229\u0001\u0000\u0000\u0000\u008e\u023a\u0001\u0000"+
		"\u0000\u0000\u0090\u023d\u0001\u0000\u0000\u0000\u0092\u0241\u0001\u0000"+
		"\u0000\u0000\u0094\u0243\u0001\u0000\u0000\u0000\u0096\u0250\u0001\u0000"+
		"\u0000\u0000\u0098\u025d\u0001\u0000\u0000\u0000\u009a\u0268\u0001\u0000"+
		"\u0000\u0000\u009c\u026c\u0001\u0000\u0000\u0000\u009e\u026e\u0001\u0000"+
		"\u0000\u0000\u00a0\u0270\u0001\u0000\u0000\u0000\u00a2\u0272\u0001\u0000"+
		"\u0000\u0000\u00a4\u0274\u0001\u0000\u0000\u0000\u00a6\u0282\u0001\u0000"+
		"\u0000\u0000\u00a8\u0284\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003T*\u0000"+
		"\u00ab\u00ae\u0003\u0002\u0001\u0000\u00ac\u00ae\u00036\u001b\u0000\u00ad"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u0001\u0001\u0000\u0000\u0000\u00af"+
		"\u00b3\u0003\u0004\u0002\u0000\u00b0\u00b3\u0003\u0006\u0003\u0000\u00b1"+
		"\u00b3\u0003\b\u0004\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u0003"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b8\u0003\u0010\b\u0000\u00b5\u00b8\u0003"+
		"\u0016\u000b\u0000\u00b6\u00b8\u0003\u001c\u000e\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u0005\u0001\u0000\u0000\u0000\u00b9\u00bd\u0003"+
		"\u0012\t\u0000\u00ba\u00bd\u0003\u0018\f\u0000\u00bb\u00bd\u0003\u001e"+
		"\u000f\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u0007\u0001\u0000"+
		"\u0000\u0000\u00be\u00c1\u0003\u0014\n\u0000\u00bf\u00c1\u0003\u001a\r"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000"+
		"\u00c3\u00c7\u0003\u0010\b\u0000\u00c4\u00c7\u0003\u0012\t\u0000\u00c5"+
		"\u00c7\u0003\u0014\n\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u000b"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00cd"+
		"\u0003\u0016\u000b\u0000\u00ca\u00cd\u0003\u0018\f\u0000\u00cb\u00cd\u0003"+
		"\u001a\r\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0003\u0000\u0000\u00cf\u00d2\u0003\u001c\u000e"+
		"\u0000\u00d0\u00d2\u0003\u001e\u000f\u0000\u00d1\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005\u0001\u0000\u0000\u00d4\u00d5\u0005\u0004\u0000"+
		"\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d7\u00034\u001a\u0000"+
		"\u00d7\u00d9\u0005\u0006\u0000\u0000\u00d8\u00da\u0003.\u0017\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00dd\u0003*\u0015\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000\u00df\u0011"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000\u00e1\u00e3"+
		"\u0005\b\u0000\u0000\u00e2\u00e4\u0003.\u0017\u0000\u00e3\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0005\t\u0000\u0000\u00e6\u00e7\u0003 "+
		"\u0010\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8\u00eb\u0003\"\u0011"+
		"\u0000\u00e9\u00ea\u0005\u000b\u0000\u0000\u00ea\u00ec\u0003*\u0015\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u0013\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0001\u0000\u0000"+
		"\u00ee\u00ef\u0005\f\u0000\u0000\u00ef\u00f0\u0005\r\u0000\u0000\u00f0"+
		"\u00f1\u00030\u0018\u0000\u00f1\u0015\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0002\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00f5"+
		"\u00034\u001a\u0000\u00f5\u0017\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"\u0002\u0000\u0000\u00f7\u00f9\u0005\b\u0000\u0000\u00f8\u00fa\u0003."+
		"\u0017\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\t\u0000"+
		"\u0000\u00fc\u00fd\u0003 \u0010\u0000\u00fd\u00fe\u0005\n\u0000\u0000"+
		"\u00fe\u00ff\u0003\"\u0011\u0000\u00ff\u0019\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\u0002\u0000\u0000\u0101\u0102\u0005\f\u0000\u0000\u0102\u0103"+
		"\u0005\r\u0000\u0000\u0103\u0104\u00030\u0018\u0000\u0104\u001b\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0003\u0000\u0000\u0106\u0107\u0005"+
		"\u0004\u0000\u0000\u0107\u0108\u00034\u001a\u0000\u0108\u0109\u0003&\u0013"+
		"\u0000\u0109\u001d\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0003\u0000"+
		"\u0000\u010b\u010d\u0005\b\u0000\u0000\u010c\u010e\u0003.\u0017\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005\t\u0000\u0000\u0110"+
		"\u0111\u0003 \u0010\u0000\u0111\u0112\u0005\n\u0000\u0000\u0112\u0113"+
		"\u0003\"\u0011\u0000\u0113\u0114\u0003&\u0013\u0000\u0114\u001f\u0001"+
		"\u0000\u0000\u0000\u0115\u0116\u00034\u001a\u0000\u0116!\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u00034\u001a\u0000\u0118#\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005c\u0000\u0000\u011a%\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u000e\u0000\u0000\u011c\u0121\u0003(\u0014\u0000\u011d\u011e\u0005\u000f"+
		"\u0000\u0000\u011e\u0120\u0003(\u0014\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\'\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0125\u00030\u0018\u0000\u0125"+
		"\u0126\u0005\u0010\u0000\u0000\u0126\u0127\u00032\u0019\u0000\u0127)\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005\u0011\u0000\u0000\u0129\u012e\u0003"+
		",\u0016\u0000\u012a\u012b\u0005\u000f\u0000\u0000\u012b\u012d\u0003,\u0016"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0012\u0000\u0000\u0132+\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u00030\u0018\u0000\u0134\u0135\u0005\u0006\u0000\u0000\u0135"+
		"\u0136\u00032\u0019\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"c\u0000\u0000\u0138/\u0001\u0000\u0000\u0000\u0139\u013a\u0005c\u0000"+
		"\u0000\u013a1\u0001\u0000\u0000\u0000\u013b\u013c\u0007\u0000\u0000\u0000"+
		"\u013c3\u0001\u0000\u0000\u0000\u013d\u013e\u0005c\u0000\u0000\u013e5"+
		"\u0001\u0000\u0000\u0000\u013f\u014a\u0003D\"\u0000\u0140\u014a\u0003"+
		"F#\u0000\u0141\u014a\u0003H$\u0000\u0142\u014a\u0003J%\u0000\u0143\u014a"+
		"\u0003L&\u0000\u0144\u014a\u0003N\'\u0000\u0145\u014a\u0003P(\u0000\u0146"+
		"\u014a\u0003L&\u0000\u0147\u014a\u0003@ \u0000\u0148\u014a\u00038\u001c"+
		"\u0000\u0149\u013f\u0001\u0000\u0000\u0000\u0149\u0140\u0001\u0000\u0000"+
		"\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149\u0142\u0001\u0000\u0000"+
		"\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u0149\u0144\u0001\u0000\u0000"+
		"\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a7\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0013\u0000\u0000"+
		"\u014c\u014d\u0005\u0014\u0000\u0000\u014d\u014e\u0005\u0015\u0000\u0000"+
		"\u014e\u014f\u0003:\u001d\u0000\u014f9\u0001\u0000\u0000\u0000\u0150\u0162"+
		"\u0005\u0016\u0000\u0000\u0151\u0162\u0005\u0017\u0000\u0000\u0152\u0162"+
		"\u0005\u0018\u0000\u0000\u0153\u0162\u0005\u0019\u0000\u0000\u0154\u0162"+
		"\u0005\u001a\u0000\u0000\u0155\u0162\u0005\u001b\u0000\u0000\u0156\u0162"+
		"\u0005\u001c\u0000\u0000\u0157\u0162\u0005\u001d\u0000\u0000\u0158\u0162"+
		"\u0005\u001e\u0000\u0000\u0159\u0162\u0005\u001f\u0000\u0000\u015a\u0162"+
		"\u0005 \u0000\u0000\u015b\u015c\u0005!\u0000\u0000\u015c\u015d\u0003<"+
		"\u001e\u0000\u015d\u015e\u0003>\u001f\u0000\u015e\u0162\u0001\u0000\u0000"+
		"\u0000\u015f\u0162\u0005\"\u0000\u0000\u0160\u0162\u0005#\u0000\u0000"+
		"\u0161\u0150\u0001\u0000\u0000\u0000\u0161\u0151\u0001\u0000\u0000\u0000"+
		"\u0161\u0152\u0001\u0000\u0000\u0000\u0161\u0153\u0001\u0000\u0000\u0000"+
		"\u0161\u0154\u0001\u0000\u0000\u0000\u0161\u0155\u0001\u0000\u0000\u0000"+
		"\u0161\u0156\u0001\u0000\u0000\u0000\u0161\u0157\u0001\u0000\u0000\u0000"+
		"\u0161\u0158\u0001\u0000\u0000\u0000\u0161\u0159\u0001\u0000\u0000\u0000"+
		"\u0161\u015a\u0001\u0000\u0000\u0000\u0161\u015b\u0001\u0000\u0000\u0000"+
		"\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000"+
		"\u0162;\u0001\u0000\u0000\u0000\u0163\u0164\u00032\u0019\u0000\u0164="+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u00032\u0019\u0000\u0166?\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0005$\u0000\u0000\u0168\u0169\u0005%\u0000\u0000"+
		"\u0169\u016a\u0005&\u0000\u0000\u016a\u016b\u0003B!\u0000\u016bA\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0007\u0001\u0000\u0000\u016dC\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005\u0001\u0000\u0000\u016f\u0170\u0005%\u0000"+
		"\u0000\u0170\u0171\u0003R)\u0000\u0171E\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0005\u0002\u0000\u0000\u0173\u0174\u0005%\u0000\u0000\u0174\u0175"+
		"\u0003R)\u0000\u0175G\u0001\u0000\u0000\u0000\u0176\u0177\u0005,\u0000"+
		"\u0000\u0177\u0178\u0005%\u0000\u0000\u0178\u0179\u0003R)\u0000\u0179"+
		"I\u0001\u0000\u0000\u0000\u017a\u017b\u0005-\u0000\u0000\u017b\u017c\u0005"+
		"%\u0000\u0000\u017c\u017d\u0003R)\u0000\u017dK\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0005.\u0000\u0000\u017f\u0180\u0005/\u0000\u0000\u0180\u0181"+
		"\u0005%\u0000\u0000\u0181M\u0001\u0000\u0000\u0000\u0182\u0183\u0005-"+
		"\u0000\u0000\u0183\u0184\u0005%\u0000\u0000\u0184\u0185\u0005\n\u0000"+
		"\u0000\u0185\u0186\u00050\u0000\u0000\u0186O\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0005,\u0000\u0000\u0188\u0189\u00050\u0000\u0000\u0189\u018a\u0005"+
		"%\u0000\u0000\u018aQ\u0001\u0000\u0000\u0000\u018b\u018c\u0005c\u0000"+
		"\u0000\u018cS\u0001\u0000\u0000\u0000\u018d\u019d\u00051\u0000\u0000\u018e"+
		"\u019e\u0003\u0084B\u0000\u018f\u019e\u0003p8\u0000\u0190\u019e\u0003"+
		"n7\u0000\u0191\u019e\u0003l6\u0000\u0192\u019e\u0003j5\u0000\u0193\u019e"+
		"\u0003h4\u0000\u0194\u019e\u0003f3\u0000\u0195\u019e\u0003d2\u0000\u0196"+
		"\u019e\u0003b1\u0000\u0197\u019e\u0003V+\u0000\u0198\u019e\u0003`0\u0000"+
		"\u0199\u019e\u0003^/\u0000\u019a\u019e\u0003Z-\u0000\u019b\u019e\u0003"+
		"\\.\u0000\u019c\u019e\u0003X,\u0000\u019d\u018e\u0001\u0000\u0000\u0000"+
		"\u019d\u018f\u0001\u0000\u0000\u0000\u019d\u0190\u0001\u0000\u0000\u0000"+
		"\u019d\u0191\u0001\u0000\u0000\u0000\u019d\u0192\u0001\u0000\u0000\u0000"+
		"\u019d\u0193\u0001\u0000\u0000\u0000\u019d\u0194\u0001\u0000\u0000\u0000"+
		"\u019d\u0195\u0001\u0000\u0000\u0000\u019d\u0196\u0001\u0000\u0000\u0000"+
		"\u019d\u0197\u0001\u0000\u0000\u0000\u019d\u0198\u0001\u0000\u0000\u0000"+
		"\u019d\u0199\u0001\u0000\u0000\u0000\u019d\u019a\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000"+
		"\u019eU\u0001\u0000\u0000\u0000\u019f\u01a0\u00052\u0000\u0000\u01a0W"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u00053\u0000\u0000\u01a2\u01a3\u0005"+
		"4\u0000\u0000\u01a3\u01a4\u00055\u0000\u0000\u01a4Y\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0005\u0004\u0000\u0000\u01a6\u01a7\u00056\u0000\u0000"+
		"\u01a7\u01a8\u00057\u0000\u0000\u01a8\u01a9\u0003$\u0012\u0000\u01a9["+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005\b\u0000\u0000\u01ab\u01ac\u0005"+
		"6\u0000\u0000\u01ac\u01ad\u00057\u0000\u0000\u01ad\u01ae\u0003$\u0012"+
		"\u0000\u01ae]\u0001\u0000\u0000\u0000\u01af\u01b0\u00058\u0000\u0000\u01b0"+
		"_\u0001\u0000\u0000\u0000\u01b1\u01b2\u00059\u0000\u0000\u01b2\u01b3\u0005"+
		":\u0000\u0000\u01b3a\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005;\u0000"+
		"\u0000\u01b5c\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005<\u0000\u0000\u01b7"+
		"\u01b8\u0005=\u0000\u0000\u01b8\u01b9\u00034\u001a\u0000\u01b9e\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bb\u0005>\u0000\u0000\u01bb\u01bc\u0005?\u0000"+
		"\u0000\u01bc\u01bd\u0005@\u0000\u0000\u01bd\u01be\u0005A\u0000\u0000\u01be"+
		"\u01bf\u0003$\u0012\u0000\u01bfg\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"B\u0000\u0000\u01c1\u01c2\u0005C\u0000\u0000\u01c2i\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0005D\u0000\u0000\u01c4\u01c5\u0005E\u0000\u0000\u01c5"+
		"\u01c6\u0005F\u0000\u0000\u01c6\u01c7\u0005A\u0000\u0000\u01c7\u01c8\u0003"+
		"$\u0012\u0000\u01c8k\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005G\u0000"+
		"\u0000\u01ca\u01cb\u0005H\u0000\u0000\u01cb\u01cc\u0005\t\u0000\u0000"+
		"\u01cc\u01cd\u0003 \u0010\u0000\u01cd\u01ce\u0005\n\u0000\u0000\u01ce"+
		"\u01cf\u0003\"\u0011\u0000\u01cf\u01d0\u00057\u0000\u0000\u01d0\u01d1"+
		"\u0003$\u0012\u0000\u01d1m\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005I"+
		"\u0000\u0000\u01d3\u01d4\u0005J\u0000\u0000\u01d4o\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0005?\u0000\u0000\u01d6\u01d7\u0005K\u0000\u0000\u01d7\u01d8"+
		"\u0005\t\u0000\u0000\u01d8\u01d9\u0003 \u0010\u0000\u01d9\u01da\u0005"+
		"\n\u0000\u0000\u01da\u01db\u0003\"\u0011\u0000\u01db\u01dc\u0005A\u0000"+
		"\u0000\u01dc\u01de\u0003$\u0012\u0000\u01dd\u01df\u0003t:\u0000\u01de"+
		"\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003r9\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2q\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0005L\u0000\u0000\u01e4\u01e5\u0005M\u0000\u0000"+
		"\u01e5s\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005N\u0000\u0000\u01e7\u01e8"+
		"\u0003v;\u0000\u01e8u\u0001\u0000\u0000\u0000\u01e9\u01ee\u0003|>\u0000"+
		"\u01ea\u01ee\u0003~?\u0000\u01eb\u01ee\u0003z=\u0000\u01ec\u01ee\u0003"+
		"x<\u0000\u01ed\u01e9\u0001\u0000\u0000\u0000\u01ed\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000"+
		"\u0000\u01eew\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005O\u0000\u0000\u01f0"+
		"\u01f1\u0005\u0005\u0000\u0000\u01f1\u01f2\u0005P\u0000\u0000\u01f2\u01f3"+
		"\u0003\u0080@\u0000\u01f3\u01f4\u0005\u000f\u0000\u0000\u01f4\u01f5\u0005"+
		"Q\u0000\u0000\u01f5\u01f6\u0003\u0082A\u0000\u01f6\u01f7\u0005\u0007\u0000"+
		"\u0000\u01f7y\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005R\u0000\u0000\u01f9"+
		"\u01fa\u0005\u0005\u0000\u0000\u01fa\u01fb\u0005P\u0000\u0000\u01fb\u01fc"+
		"\u0003\u0080@\u0000\u01fc\u01fd\u0005\u000f\u0000\u0000\u01fd\u01fe\u0005"+
		"Q\u0000\u0000\u01fe\u01ff\u0003\u0082A\u0000\u01ff\u0200\u0005\u0007\u0000"+
		"\u0000\u0200{\u0001\u0000\u0000\u0000\u0201\u0202\u0005S\u0000\u0000\u0202"+
		"\u0203\u0005\u0005\u0000\u0000\u0203\u0204\u0005P\u0000\u0000\u0204\u0205"+
		"\u0003\u0080@\u0000\u0205\u0206\u0005\u000f\u0000\u0000\u0206\u0207\u0005"+
		"Q\u0000\u0000\u0207\u0208\u0003\u0082A\u0000\u0208\u0209\u0005\u0007\u0000"+
		"\u0000\u0209}\u0001\u0000\u0000\u0000\u020a\u020b\u0005T\u0000\u0000\u020b"+
		"\u020c\u0005\u0005\u0000\u0000\u020c\u020d\u0005P\u0000\u0000\u020d\u020e"+
		"\u0003\u0080@\u0000\u020e\u020f\u0005\u000f\u0000\u0000\u020f\u0210\u0005"+
		"Q\u0000\u0000\u0210\u0211\u0003\u0082A\u0000\u0211\u0212\u0005\u0007\u0000"+
		"\u0000\u0212\u007f\u0001\u0000\u0000\u0000\u0213\u0214\u0003\u0090H\u0000"+
		"\u0214\u0081\u0001\u0000\u0000\u0000\u0215\u0216\u0003\u0090H\u0000\u0216"+
		"\u0083\u0001\u0000\u0000\u0000\u0217\u0219\u0003\u0086C\u0000\u0218\u021a"+
		"\u0003\u00a2Q\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0003"+
		"\u00a4R\u0000\u021c\u0085\u0001\u0000\u0000\u0000\u021d\u0221\u0003\u0088"+
		"D\u0000\u021e\u0220\u0003\u008aE\u0000\u021f\u021e\u0001\u0000\u0000\u0000"+
		"\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0087\u0001\u0000\u0000\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0225\u0003\u008cF\u0000\u0225"+
		"\u0089\u0001\u0000\u0000\u0000\u0226\u0227\u0003\u0092I\u0000\u0227\u0228"+
		"\u0003\u008cF\u0000\u0228\u008b\u0001\u0000\u0000\u0000\u0229\u022b\u0005"+
		"U\u0000\u0000\u022a\u022c\u00034\u001a\u0000\u022b\u022a\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0005\u0006\u0000\u0000\u022e\u0230\u0003.\u0017\u0000"+
		"\u022f\u022d\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000"+
		"\u0230\u0232\u0001\u0000\u0000\u0000\u0231\u0233\u0003\u0098L\u0000\u0232"+
		"\u0231\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0234\u0001\u0000\u0000\u0000\u0234\u0236\u0005\u0007\u0000\u0000\u0235"+
		"\u0237\u0003\u008eG\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0236\u0237"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0005V\u0000\u0000\u0239\u008d\u0001\u0000\u0000\u0000\u023a\u023b\u0005"+
		"W\u0000\u0000\u023b\u023c\u0003\u0090H\u0000\u023c\u008f\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0005c\u0000\u0000\u023e\u0091\u0001\u0000\u0000\u0000"+
		"\u023f\u0242\u0003\u0094J\u0000\u0240\u0242\u0003\u0096K\u0000\u0241\u023f"+
		"\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0242\u0093"+
		"\u0001\u0000\u0000\u0000\u0243\u0245\u0005X\u0000\u0000\u0244\u0246\u0003"+
		".\u0017\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000"+
		"\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u000b"+
		"\u0000\u0000\u0248\u024a\u0003\u0098L\u0000\u0249\u0247\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000"+
		"\u0000\u024b\u024d\u0003\u008eG\u0000\u024c\u024b\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000"+
		"\u024e\u024f\u0005Y\u0000\u0000\u024f\u0095\u0001\u0000\u0000\u0000\u0250"+
		"\u0252\u0005Z\u0000\u0000\u0251\u0253\u0003.\u0017\u0000\u0252\u0251\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0256\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0005\u000b\u0000\u0000\u0255\u0257\u0003"+
		"\u0098L\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000"+
		"\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u025a\u0003\u008e"+
		"G\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005X\u0000\u0000"+
		"\u025c\u0097\u0001\u0000\u0000\u0000\u025d\u025e\u0005\u0011\u0000\u0000"+
		"\u025e\u0263\u0003\u009aM\u0000\u025f\u0260\u0005\u000f\u0000\u0000\u0260"+
		"\u0262\u0003\u009aM\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0262\u0265"+
		"\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0263"+
		"\u0001\u0000\u0000\u0000\u0266\u0267\u0005\u0012\u0000\u0000\u0267\u0099"+
		"\u0001\u0000\u0000\u0000\u0268\u0269\u0003\u009cN\u0000\u0269\u026a\u0003"+
		"\u00a0P\u0000\u026a\u026b\u0003\u009eO\u0000\u026b\u009b\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005c\u0000\u0000\u026d\u009d\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u0007\u0000\u0000\u0000\u026f\u009f\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0007\u0002\u0000\u0000\u0271\u00a1\u0001\u0000\u0000\u0000"+
		"\u0272\u0273\u0005`\u0000\u0000\u0273\u00a3\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0005a\u0000\u0000\u0275\u027a\u0003\u00a6S\u0000\u0276\u0277\u0005"+
		"\u000f\u0000\u0000\u0277\u0279\u0003\u00a6S\u0000\u0278\u0276\u0001\u0000"+
		"\u0000\u0000\u0279\u027c\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u00a5\u0001\u0000"+
		"\u0000\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u0283\u0003\u0090"+
		"H\u0000\u027e\u027f\u0003\u0090H\u0000\u027f\u0280\u0005b\u0000\u0000"+
		"\u0280\u0281\u0003\u009cN\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282"+
		"\u027d\u0001\u0000\u0000\u0000\u0282\u027e\u0001\u0000\u0000\u0000\u0283"+
		"\u00a7\u0001\u0000\u0000\u0000\u0284\u0285\u0003\u0000\u0000\u0000\u0285"+
		"\u00a9\u0001\u0000\u0000\u0000&\u00ad\u00b2\u00b7\u00bc\u00c0\u00c6\u00cc"+
		"\u00d1\u00d9\u00dc\u00e3\u00eb\u00f9\u010d\u0121\u012e\u0149\u0161\u019d"+
		"\u01de\u01e1\u01ed\u0219\u0221\u022b\u022f\u0232\u0236\u0241\u0245\u0249"+
		"\u024c\u0252\u0256\u0259\u0263\u027a\u0282";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}