package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;
import com.server.graph_db.core.vertex.computational.VariableVertex;
import com.server.graph_db.core.vertex.computational.operations.AdditionVertex;
import com.server.graph_db.core.vertex.computational.operations.DivisionVertex;
import com.server.graph_db.core.vertex.computational.operations.MultiplicationVertex;
import com.server.graph_db.core.vertex.computational.operations.SubtractionVertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputationalGraph {
    private final List<ComputationalVertex> vertices;
    private final Map<String, VariableVertex> variables;

    public ComputationalGraph(){
        this.vertices = new ArrayList<>();
        this.variables = new HashMap<>();
    }

    public VariableVertex addVariable(String name, double value){
        VariableVertex variable = new VariableVertex(value);
        variable.setLayer(1);
        variables.put(name, variable);
        vertices.add(variable);
        return variable;
    }

    public void setVariable(String name, double value){
        if (variables.containsKey(name))
            variables.get(name).setValue(value);
    }

    public double getVariable(String name){
        if (variables.containsKey(name))
            return variables.get(name).compute();
        return Double.MAX_VALUE;
    }

    public ComputationalVertex addAdditionVertex(ComputationalVertex a, ComputationalVertex b){
        AdditionVertex addition = new AdditionVertex(a, b);
        addition.setLayer(Math.max(a.getLayer() + 1, b.getLayer()) + 1);
        vertices.add(addition);
        return addition;
    }

    public ComputationalVertex addSubtractionVertex(ComputationalVertex a, ComputationalVertex b){
        SubtractionVertex subtraction = new SubtractionVertex(a, b);
        subtraction.setLayer(Math.max(a.getLayer() + 1, b.getLayer()) + 1);
        vertices.add(subtraction);
        return subtraction;
    }

    public ComputationalVertex addMultiplicationVertex(ComputationalVertex a, ComputationalVertex b){
        MultiplicationVertex multiplication = new MultiplicationVertex(a, b);
        multiplication.setLayer(Math.max(a.getLayer() + 1, b.getLayer()) + 1);
        vertices.add(multiplication);
        return multiplication;
    }

    public ComputationalVertex addDivisionVertex(ComputationalVertex a, ComputationalVertex b){
        DivisionVertex division = new DivisionVertex(a, b);
        division.setLayer(Math.max(a.getLayer() + 1, b.getLayer()) + 1);
        vertices.add(division);
        return division;
    }

    public double compute(ComputationalVertex vertex){
        return vertex.compute();
    }

    public void computeGradient(ComputationalVertex vertex){
        for (ComputationalVertex v : vertices)
            if(v instanceof VariableVertex)
                ((VariableVertex) v).resetGradient();
        vertex.computeGradient(1.0);
    }

    public double getGradient(String name){
        if (variables.containsKey(name))
            return variables.get(name).getGradient();
        return 0.0;
    }
}
