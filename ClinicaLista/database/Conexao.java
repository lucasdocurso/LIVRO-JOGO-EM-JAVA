package ClinicaLista.database;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String DB_URL = dotenv.get("DB_URL");
    private static final String DB_USER = dotenv.get("DB_USER");
    private static final String DB_PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error connecting to DB: " + e.getMessage());
            return null;
        }
    }

    public static void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS clinic ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "doctor VARCHAR(255) NOT NULL,"
                + "query VARCHAR(255) NOT NULL,"
                + "date VARCHAR(255) NOT NULL"
                + ")";
        try (Connection conn = conectar(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'clinic' created or already exists.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
        }
    }
}
