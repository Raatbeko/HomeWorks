package dBConn;

import models.User;
import models.UserLogs;

import java.sql.*;

public class UserConn {

    public boolean addUser(User user) {
        String sql = "INSERT INTO users(user_name,e_mail,password,date_of_registration,is_blocked)" +
                "VALUES(?,?,?,now(),?)";
        try (Connection connection = DBconn.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getUserName());
            statement.setString(2, user.geteMail());
            statement.setString(3, user.getPassword());
            statement.setBoolean(4, user.isBlocked());
            return 0 < statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }

    public boolean addUserLogs(User user, String result) {
        String sql = "INSERT INTO user_logs(user_id,login_time,login_result)" +
                "VALUES(?,now(),?)";
        try (Connection connection = DBconn.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, user.getId());
            statement.setString(2, result);
            return 0 < statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updateUserLogs(Long userId){
        String sql = "UPDATE user_logs" +
                "SET update_time = now(), counter = SELECT counter FROM user_logs" +
                "WHERE user_id = ?";
        try(Connection connection = DBconn.connection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1,userId);
            return 0 < statement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

//    public User getUser(Long id) {
//        String sql = "SELECT * FROM users" +
//                "WHERE id = " + id;
//        try (Connection connection = DBconn.connection();
//             Statement statement = connection.prepareStatement(sql);
//             ResultSet resultSet = statement.getResultSet()) {
//            while (resultSet.next()) {
//
//                return new User(resultSet.getLong("user_id"), resultSet.getString("user_name"),
//                        resultSet.getString("e_mail"),
//                        resultSet.getString("password"),
//                        resultSet.getTimestamp("data_of_registration"),
//                        resultSet.getBoolean("is_blocked"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return null;
//    }

    public int getCountFailLogs(User user) {
        String sql = "SELECT count(*) FROM user_logs" +
                "WHERE user_id = ? and login_result = 'FAIL'";
        try (Connection connection = DBconn.connection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, user.getId());
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                return resultSet.getInt(1);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public boolean deleteFailEntryLogins(User user, int num) {
        String sql = "DELETE FROM users " +
                "WHERE user_id = ? AND login_result = 'FAIL'";
        if (num <= 3) {

            try (Connection connection = DBconn.connection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setLong(1, user.getId());
                return 0 < statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return false;
    }

    public void unlockingUser(User user, boolean unlock) {
        String sql = "UPDATE users" +
                "SET is_bocked = " + unlock +
                "WHERE user_id = "+ user.getId();
        try (Connection connection = DBconn.connection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean deleteUser(long user_id) {
        String sql = "DELETE FROM users WHERE user_id =" + user_id;
        try (Connection con = DBconn.connection();
             Statement statement = con.prepareStatement(sql)
        ) {
            return 0 < statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


}
