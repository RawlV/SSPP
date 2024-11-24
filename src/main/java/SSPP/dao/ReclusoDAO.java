package SSPP.dao;

import SSPP.model.Recluso;
import SSPP.utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReclusoDAO {

    // Método para obtener todos los reclusos
    public List<Recluso> obtenerTodos() {
        List<Recluso> lista = new ArrayList<>();
        String query = "SELECT * FROM Recluso";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Recluso recluso = new Recluso(
                    resultSet.getInt("Cod_recluso"),
                    resultSet.getString("Nombre"),
                    resultSet.getString("Apellido"),
                    resultSet.getDate("Fecha_nacimiento"),
                    resultSet.getObject("Cod_crimen", Integer.class),
                    resultSet.getObject("Cod_curso", Integer.class),
                    resultSet.getObject("Cod_conducta", Integer.class),
                    resultSet.getObject("Cod_celda", Integer.class)
                );
                lista.add(recluso);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener reclusos: " + e.getMessage());
        }

        return lista;
    }

    public void insertarRecluso(Recluso recluso) {
        String query = "INSERT INTO Recluso (Nombre, Apellido, Fecha_nacimiento, Cod_crimen, Cod_curso, Cod_conducta, Cod_celda) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, recluso.getNombre());
            preparedStatement.setString(2, recluso.getApellido());

            // Conversión de java.util.Date a java.sql.Date
            if (recluso.getFechaNacimiento() != null) {
                preparedStatement.setDate(3, new java.sql.Date(recluso.getFechaNacimiento().getTime()));
            } else {
                preparedStatement.setDate(3, null);
            }

            preparedStatement.setObject(4, recluso.getCodCrimen());
            preparedStatement.setObject(5, recluso.getCodCurso());
            preparedStatement.setObject(6, recluso.getCodConducta());
            preparedStatement.setObject(7, recluso.getCodCelda());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al insertar recluso: " + e.getMessage());
        }
    }
}
