package SSPP.dao;

import SSPP.model.Crimen;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CrimenDAO {
    public List<Crimen> obtenerTodos() {
        List<Crimen> lista = new ArrayList<>();
        String query = "SELECT * FROM Crimen";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Crimen crimen = new Crimen(
                    resultSet.getInt("Cod_crimen"),
                    resultSet.getString("Nombre"),
                    resultSet.getString("Descripcion")
                );
                lista.add(crimen);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener crímenes: " + e.getMessage());
        }

        return lista;
    }
}
