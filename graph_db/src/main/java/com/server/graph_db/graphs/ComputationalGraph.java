package com.server.graph_db.graphs;

import com.server.graph_db.core.vertex.computational.ComputationalVertex;
import com.server.graph_db.core.vertex.computational.VariableVertex;
import com.server.graph_db.core.vertex.computational.operations.*;

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

    public ComputationalVertex addNegationVertex(ComputationalVertex a){
        NegationVertex negation = new NegationVertex(a);
        negation.setLayer(a.getLayer() + 1);
        vertices.add(negation);
        return negation;
    }

    public ComputationalVertex addReciprocalVertex(ComputationalVertex a){
        ReciprocalVertex reciprocal = new ReciprocalVertex(a);
        reciprocal.setLayer(a.getLayer() + 1);
        vertices.add(reciprocal);
        return reciprocal;
    }

    public ComputationalVertex addSquareVertex(ComputationalVertex a){
        SquareVertex square = new SquareVertex(a);
        square.setLayer(a.getLayer() + 1);
        vertices.add(square);
        return square;
    }

    public ComputationalVertex addSigmoidVertex(ComputationalVertex a){
        SigmoidVertex sigmoid = new SigmoidVertex(a);
        sigmoid.setLayer(a.getLayer() + 1);
        vertices.add(sigmoid);
        return sigmoid;
    }

    public ComputationalVertex addReluVertex(ComputationalVertex a){
        ReluVertex relu = new ReluVertex(a);
        relu.setLayer(a.getLayer() + 1);
        vertices.add(relu);
        return relu;
    }

    public ComputationalVertex addTanhVertex(ComputationalVertex a){
        TanhVertex tanh = new TanhVertex(a);
        tanh.setLayer(a.getLayer() + 1);
        vertices.add(tanh);
        return tanh;
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

    public static void main(String[] args) {
        ComputationalGraph graph = new ComputationalGraph();

        VariableVertex x = graph.addVariable("x", 2);
        VariableVertex y = graph.addVariable("y", 3);
        VariableVertex z = graph.addVariable("z", 4);

        AdditionVertex addNode = (AdditionVertex) graph.addAdditionVertex(x, y);
        MultiplicationVertex mulNode = (MultiplicationVertex) graph.addMultiplicationVertex(addNode, z);

        double result = graph.compute(mulNode);
        System.out.println("Result: " + result); // Output: Result: 20.0

        graph.computeGradient(mulNode);

        System.out.println("Gradient wrt x: " + graph.getGradient("x")); // Output: Gradient wrt x: 4.0
        System.out.println("Gradient wrt y: " + graph.getGradient("y")); // Output: Gradient wrt y: 4.0
        System.out.println("Gradient wrt z: " + graph.getGradient("z")); // Output: Gradient wrt z: 5.0

        // Update variable values
        graph.setVariable("x", 5);
        graph.setVariable("y", 6);
        graph.setVariable("z", 7);

        double updatedResult = graph.compute(mulNode);
        System.out.println("Updated Result: " + updatedResult); // Output: Updated Result: 77.0

        graph.computeGradient(mulNode);

        System.out.println("Updated Gradient wrt x: " + graph.getGradient("x")); // Output: Updated Gradient wrt x: 7.0
        System.out.println("Updated Gradient wrt y: " + graph.getGradient("y")); // Output: Updated Gradient wrt y: 7.0
        System.out.println("Updated Gradient wrt z: " + graph.getGradient("z")); // Output: Updated Gradient wrt z: 11.0
    }
}
