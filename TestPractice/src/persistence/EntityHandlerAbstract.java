package persistence;

import entities.Entity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import exceptions.PersistenceException;

/**
 *
 * @author Hemrik Balázs
 */
abstract class EntityHandlerAbstract implements EntityHandler {
    
    private static SqlConnection sqlConnection;

    protected final void executeNonQuery(String sqlCommand) 
            throws PersistenceException {
        try (Statement statement = sqlConnection.getConnection().
                createStatement()) {
            statement.execute(sqlCommand);
        } catch (SQLException ex) {
            throw new PersistenceException(ex.getMessage());
        }
    }

    protected final List<? extends Entity> executeQuery(String queryString)
            throws PersistenceException {
        List<Entity> result = null;
        try (Statement statement = sqlConnection.getConnection().
                createStatement(); ResultSet resultSet = statement.executeQuery(
                        queryString)) {
            result = (List<Entity>) getResultFromResultSet(resultSet);
        } catch (SQLException ex) {
            throw new PersistenceException(ex.getMessage());
        }
        return result;
    }

    protected abstract List<? extends Entity> getResultFromResultSet(
            ResultSet resultSet) throws SQLException;
}
