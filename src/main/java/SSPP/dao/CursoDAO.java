package SSPP.dao;

import SSPP.model.Curso;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    public List<Curso> obtenerTodos() {
        List<Curso> lista = new ArrayList<>();
        String query = "SELECT * FROM Curso";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Curso curso = new Curso(
                    resultSet.getInt("Cod_curso"),
                    resultSet.getString("Nombre"),
                    resultSet.getString("Descripcion")
                );
                lista.add(curso);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener cursos: " + e.getMessage());
        }

        return lista;
    }
}
