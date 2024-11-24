package SSPP.dao;

import SSPP.model.CalificacionCond;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CalificacionCondDAO {
    public List<CalificacionCond> obtenerTodos() {
        List<CalificacionCond> lista = new ArrayList<>();
        String query = "SELECT * FROM Calificacion_cond";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                CalificacionCond calificacionCond = new CalificacionCond(
                    resultSet.getInt("Cod_calificacion_cond"),
                    resultSet.getInt("Cod_recluso"),
                    resultSet.getInt("Cod_conducta")
                );
                lista.add(calificacionCond);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener calificaciones de conducta: " + e.getMessage());
        }

        return lista;
    }
}
