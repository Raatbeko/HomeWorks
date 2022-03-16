package dBase;

import model.Group;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class GroupConn {
    private DBConnection dbConnection = new DBConnection();

    public List<Group> getAllGroup() {
        List<Group> groups = new ArrayList<>();
        String sql = "SELECT id, name FROM group";
        try (Connection connection = dbConnection.connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            Group group = new Group(
                    resultSet.getInt("id"),
                    resultSet.getString("name"));
            groups.add(group);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return groups;
    }

}
