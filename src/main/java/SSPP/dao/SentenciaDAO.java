package SSPP.dao;

import SSPP.model.Sentencia;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SentenciaDAO {
    public List<Sentencia> obtenerTodos() {
        List<Sentencia> lista = new ArrayList<>();
        String query = "SELECT * FROM Sentencia";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Sentencia sentencia = new Sentencia(
                    resultSet.getInt("Cod_sentencia"),
                    resultSet.getInt("Cod_recluso"),
                    resultSet.getInt("Cod_crimen")
                );
                lista.add(sentencia);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener sentencias: " + e.getMessage());
        }

        return lista;
    }
}
