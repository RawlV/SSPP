package SSPP.dao;

import SSPP.model.Prision;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrisionDAO {

    public List<Prision> obtenerPrisiones() {
        List<Prision> prisiones = new ArrayList<>();
        String query = "SELECT * FROM Prision";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Prision prision = new Prision(
                        resultSet.getInt("Cod_prision"),
                        resultSet.getString("Nombre"),
                        resultSet.getString("Direccion"),
                        resultSet.getInt("Capacidad")
                );
                prisiones.add(prision);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener prisiones: " + e.getMessage());
        }

        return prisiones;
    }
}
