package SSPP.dao;

import SSPP.model.Celda;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CeldaDAO {
    public List<Celda> obtenerTodos() {
        List<Celda> lista = new ArrayList<>();
        String query = "SELECT * FROM Celda";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Celda celda = new Celda(
                    resultSet.getInt("Cod_celda"),
                    resultSet.getInt("Numero"),
                    resultSet.getInt("Capacidad"),
                    resultSet.getObject("Cod_prision", Integer.class)
                );
                lista.add(celda);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener celdas: " + e.getMessage());
        }

        return lista;
    }
}