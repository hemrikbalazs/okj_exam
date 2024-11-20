package entities;

import exceptions.PersistenceException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.TestEntityHandler;
import persistence.EntityHandler;

/**
 *
 * @author Hemrik Balázs
 */
public class TestEntity implements Entity{

    private static EntityHandler handler;
    
    static {
        handler = new TestEntityHandler();
    }
    
    private int entityID;
    private String entityName;

    public TestEntity(int entityID, String entityName) {
        this.entityID = entityID;
        this.entityName = entityName;
    }
    
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public int getEntityID() {
        return entityID;
    }
    
    public void setEntityID(int entityID) {
        this.entityID = entityID;
    }
    
    public String getEntityName() {
        return entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
//</editor-fold>
    
    @Override
    public void save() {
        try {
            handler.insert(this);
        } catch (PersistenceException ex) {
            Logger.getLogger(TestEntity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit() {
        try {
            handler.update(this);
        } catch (PersistenceException ex) {
            Logger.getLogger(TestEntity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete() {
        try {
            handler.delete(this);
        } catch (PersistenceException ex) {
            Logger.getLogger(TestEntity.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
