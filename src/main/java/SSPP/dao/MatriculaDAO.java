package SSPP.dao;

import SSPP.model.Matricula;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {
    public List<Matricula> obtenerTodos() {
        List<Matricula> lista = new ArrayList<>();
        String query = "SELECT * FROM Matricula";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Matricula matricula = new Matricula(
                    resultSet.getInt("Cod_matricula"),
                    resultSet.getInt("Cod_recluso"),
                    resultSet.getInt("Cod_curso")
                );
                lista.add(matricula);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener matrículas: " + e.getMessage());
        }

        return lista;
    }
}
