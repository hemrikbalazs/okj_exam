package persistence;

import entities.Entity;
import exceptions.PersistenceException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Hemrik Balázs
 */
public class TestEntityHandler extends EntityHandlerAbstract {

    private static final String INSERT_INTO;
    private static final String UPDATE;
    private static final String DELETE;
    private static final String SELECT_ALL;
    
    static {
        INSERT_INTO = "";
        UPDATE = "";
        DELETE = "";
        SELECT_ALL = "";
    }
    
    public TestEntityHandler() {
    }


    @Override
    public void insert(Entity entity) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Entity entity) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<? extends Entity> selectAll() throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void delete(Entity entity) throws PersistenceException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    protected List<? extends Entity> getResultFromResultSet(ResultSet resultSet) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
