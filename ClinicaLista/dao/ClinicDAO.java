package ClinicaLista.dao;

import ClinicaLista.model.Clinic;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClinicDAO {
    private final Connection connection;
    
    public ClinicDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean insertClinic(Clinic clinic) {
        String sql = "INSERT INTO clinic (doctor, query, date) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, clinic.getDoctor());
            stmt.setString(2, clinic.getQuery());
            stmt.setString(3, clinic.getDate());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error inserting clinic: " + e.getMessage());
            return false;
        }
    }
}
