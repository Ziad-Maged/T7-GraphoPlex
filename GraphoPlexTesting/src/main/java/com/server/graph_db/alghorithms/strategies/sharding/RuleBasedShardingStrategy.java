package com.server.graph_db.alghorithms.strategies.sharding;

import com.server.graph_db.alghorithms.strategies.ShardingStrategy;
import com.server.graph_db.alghorithms.strategies.misc.Tuple;
import com.server.graph_db.alghorithms.strategies.rules.RuleEngineResponse;
import com.server.graph_db.core.vertex.Edge;
import com.server.graph_db.core.vertex.Vertex;
import com.server.graph_db.graphs.Graph;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

import java.util.HashMap;
import java.util.List;

@SuppressWarnings("ALL")
public class RuleBasedShardingStrategy implements ShardingStrategy {
    Object rule;
    public RuleBasedShardingStrategy(Object rule) {
        this.rule = rule;
    }

    @Override
    public Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>> shard(Graph g) {
        Facts facts = new Facts();

        Rules rules = new Rules();
        rules.register(rule);

        RulesEngine engine = new DefaultRulesEngine();
        engine.fire(rules, facts);

        return (Tuple<HashMap<Integer, List<Vertex>>, HashMap<Integer, List<Edge>>>) RuleEngineResponse.getResponse();
    }
}
