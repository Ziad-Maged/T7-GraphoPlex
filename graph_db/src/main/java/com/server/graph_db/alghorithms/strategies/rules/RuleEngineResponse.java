package com.server.graph_db.alghorithms.strategies.rules;

public class RuleEngineResponse {
    private static Object response;

    public static Object getResponse() {
        return response;
    }

    public static void setResponse(Object response) {
        RuleEngineResponse.response = response;
    }
}
