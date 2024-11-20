package persistence;

import entities.Entity;
import exceptions.PersistenceException;
import java.util.List;

/**
 *
 * @author Hemrik Balázs
 */
public interface EntityHandler {
    
    public void insert(Entity entity) throws PersistenceException;
    
    public void update(Entity entity) throws PersistenceException;
    
    public void delete(Entity entity) throws PersistenceException;
    
    public List<? extends Entity> selectAll() throws PersistenceException;
}
