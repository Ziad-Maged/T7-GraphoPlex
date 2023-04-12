package com.server.graph_db.vertex;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.server.graph_db.datastore.redis.RedisDataAccess;


@Repository
public class VertexRepositoryImpl implements VertexRepository {
    


    @Autowired
    private RedisDataAccess redisDataAccess;
    
    public VertexRepositoryImpl(RedisDataAccess redisDataAccess) {
        this.redisDataAccess = redisDataAccess;
    } 

    @Override
    public long count() {
        return redisDataAccess.countVertices();
    }

    @Override
    public void delete(Vertex entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAll() {
          redisDataAccess.deleteAllVertices();
    }

    @Override
    public void deleteAll(Iterable<? extends Vertex> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAllById(Iterable<? extends String> ids) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteById(String id) {
            redisDataAccess.deleteVertex(id);
    }

    @Override
    public boolean existsById(String id) {
        return redisDataAccess.isVertexExists(id);
    }

    @Override
    public Iterable<Vertex> findAll() {
        return redisDataAccess.getAllVertices();
    }

    @Override
    public Iterable<Vertex> findAllById(Iterable<String> ids) {
        // TODO Auto-generated method stub

        return redisDataAccess.getVerticesByIds(ids);
    }

    @Override
    public Optional<Vertex> findById(String id) {
        // get by id from redis
        Vertex vertex = redisDataAccess.getVertex(id);
        return Optional.ofNullable(vertex);
        
    }

    @Override
    public <S extends Vertex> S save(S entity) {
        redisDataAccess.saveVertex(entity);
        return entity;
    }

    @Override
    public <S extends Vertex> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    public Iterable<String> getAllVerticesIds() {

        return redisDataAccess.getAllVerticesIds();
    }

    public void updateVertex(String id, String label , Map<String, String> properties) {
        Vertex vertex = redisDataAccess.getVertex(id);
        vertex.setLabel(label);
        vertex.setProperties(properties);
        redisDataAccess.saveVertex(vertex);
    }

    public void updateVertex (String id , Map<String, String> properties) {
        Vertex vertex = redisDataAccess.getVertex(id);
        vertex.setProperties(properties);
        redisDataAccess.saveVertex(vertex);
    }

    public void addEdge (String sourceVertexId , Edge edge) {
        Vertex vertex = redisDataAccess.getVertex(sourceVertexId);
        vertex.addOutgoingEdge(edge);
        redisDataAccess.saveVertex(vertex);
        edge.setSourceVertexId(sourceVertexId);
        
        
    }

    public void deleteEdge (String sourceVertexId , String distinationId , String label) {
        Vertex vertex = redisDataAccess.getVertex(sourceVertexId);
        vertex.deleteOutgoingEdge(distinationId, label);
        redisDataAccess.saveVertex(vertex);
    }

    public void updateEdge (String sourceId, String destinationId, String label, Map<String, String> properties) {
        Vertex vertex = redisDataAccess.getVertex(sourceId);
        vertex.updateOutgoingEdge(destinationId, label, properties);
        redisDataAccess.saveVertex(vertex);
    }

}
