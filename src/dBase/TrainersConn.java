package dBase;

import model.Trainer;
import enums.TypeSport;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class TrainersConn {
    private DBConnection dbConnection;

    public Map<Trainer,String> getAllTrainer() {
        String sql = "SELECT t.id, t.full_name, t.experience, ts.name " +
                "FROM trainers" +
                "JOIN type_sport ts ON ts.id = t.type_sport_id";
        Map<Trainer,String> trainers = new HashMap<>();
        try (Connection conn = dbConnection.connection();
             Statement st = conn.createStatement();
             ResultSet set = st.executeQuery(sql)) {

            while (set.next()) {
                Trainer trainer = new Trainer(
                        set.getInt("t.id"),
                        set.getString("t.full_name"),
                        set.getInt("t.experience"),
                        TypeSport.valueOf(set.getString("ts.name")));
                trainers.put(trainer,
                        trainer.getFullName().length() >= 3?"Молодец":"Не молодец");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return trainers;
    }



    public DBConnection getDbConnection() {
        return dbConnection;
    }

}
