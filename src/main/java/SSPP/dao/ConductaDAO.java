package SSPP.dao;

import SSPP.model.Conducta;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConductaDAO {
    public List<Conducta> obtenerTodos() {
        List<Conducta> lista = new ArrayList<>();
        String query = "SELECT * FROM Conducta";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Conducta conducta = new Conducta(
                    resultSet.getInt("Cod_conducta"),
                    resultSet.getString("Nombre"),
                    resultSet.getString("Descripcion")
                );
                lista.add(conducta);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener conductas: " + e.getMessage());
        }

        return lista;
    }
}
