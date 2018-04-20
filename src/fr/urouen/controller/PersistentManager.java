package fr.urouen.controller;

import java.sql.*;
import java.util.UUID;

public class PersistentManager {
    private Connection connection;
    private PreparedStatement delete_query;
    private PreparedStatement insert_query;
    private PreparedStatement update_query;

    public PersistentManager() throws SQLException {
        connection = getConnection();
        delete_query = connection.prepareStatement("DELETE FROM CVI WHERE UUID = ?;");
        insert_query = connection.prepareStatement("INSERT INTO CVI (UUID,XML) VALUES (?, ?);");
        update_query = connection.prepareStatement("UPDATE CVI SET XML=? WHERE UUID=?;");
    }

    public Connection getConnection() throws SQLException {
        if(connection == null) {
            //Récupère l'url en fonction de l'environnement (sur Heroku)
            String dbUrl = System.getenv("JDBC_DATABASE_URL");
            return DriverManager.getConnection(dbUrl);
        } else {
            return connection;
        }
    }

    public void createTable() throws SQLException {
        Statement stmt = connection.createStatement();
        String sql ="CREATE TABLE IF NOT EXISTS CVI " +
                "(UUID CHAR(50) PRIMARY KEY NOT NULL," +
                " XML TEXT NOT NULL)";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public void insertCviFromTable(UUID uuid, String xml) throws SQLException {
        insert_query.setString(1,uuid.toString());
        insert_query.setString(2,xml);
        insert_query.executeUpdate();
    }

    public void removeCviFromTable(UUID uuid) throws SQLException {
        delete_query.setString(1,uuid.toString());
        delete_query.executeUpdate();
    }

    public void updateCviFromTable(UUID uuid, String xml) throws SQLException {
        update_query.setString(1,xml);
        update_query.setString(2,uuid.toString());
        update_query.executeUpdate();
    }
}
