package com.server.graph_db.alghorithms.strategies.rules;

public class RuleEngineResponse {
    private static Object response;

    public static Object getResponse() {
        Object result = response;
        response = null;
        return result;
    }

    public static void setResponse(Object response) {
        RuleEngineResponse.response = response;
    }
}
