package SSPP.view;

import SSPP.dao.ReclusoDAO;
import SSPP.model.Recluso;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {

    @FXML
    private TextField nombresField, apellidosField, documentoField, condenaField, penaField;
    @FXML
    private ComboBox<String> tipoDocumentoComboBox;
    @FXML
    private DatePicker fechaNacimientoPicker;
    @FXML
    private Slider conductaSlider;
    @FXML
    private Label conductaLabel;

    private ReclusoDAO reclusoDAO;

    // Singleton instance
    private static Stage instance;

    @FXML
    public void initialize() {
        reclusoDAO = new ReclusoDAO();

        // Inicializar opciones del ComboBox
        tipoDocumentoComboBox.getItems().addAll("DNI", "Carnet de Extranjería");

        // Configurar el Slider para mostrar el valor seleccionado
        conductaSlider.valueProperty().addListener((observable, oldValue, newValue) -> 
            conductaLabel.setText(String.valueOf(newValue.intValue()))
        );
    }

    public static void show() {
        if (instance == null) {
            try {
                FXMLLoader loader = new FXMLLoader(RegistroController.class.getResource("/SSPP/view/Registro.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Registro de Presos");
                stage.setScene(new Scene(root));
                instance = stage;

                stage.setOnCloseRequest(event -> instance = null);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            instance.toFront();
        }
    }

    @FXML
    public void guardarPreso(ActionEvent event) {
        try {
            // Capturar datos de los campos
            String nombres = nombresField.getText();
            String apellidos = apellidosField.getText();
            String tipoDocumento = tipoDocumentoComboBox.getValue();
            int documento = Integer.parseInt(documentoField.getText());
            java.sql.Date fechaNacimiento = java.sql.Date.valueOf(fechaNacimientoPicker.getValue());
            int condena = Integer.parseInt(condenaField.getText());
            String pena = penaField.getText();
            int conducta = (int) conductaSlider.getValue();

            // Validar que se haya seleccionado un tipo de documento
            if (tipoDocumento == null) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Seleccione un tipo de documento.");
                alert.showAndWait();
                return;
            }

            // Crear objeto Recluso
            Recluso nuevoRecluso = new Recluso(
                0,
                nombres,
                apellidos,
                fechaNacimiento,
                null,
                null,
                null,
                null
            );

            // Guardar en la base de datos
            reclusoDAO.insertarRecluso(nuevoRecluso);

            // Mostrar confirmación
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Recluso registrado exitosamente.");
            alert.showAndWait();

            // Limpiar los campos
            nombresField.clear();
            apellidosField.clear();
            tipoDocumentoComboBox.setValue(null);
            documentoField.clear();
            fechaNacimientoPicker.setValue(null);
            condenaField.clear();
            penaField.clear();
            conductaSlider.setValue(50); // Restablecer el slider a un valor por defecto

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Error al registrar al recluso: " + e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    public void volverAlMenu(ActionEvent event) {
        Stage stage = (Stage) nombresField.getScene().getWindow();
        stage.close();
        instance = null; // Liberar la instancia singleton al cerrar
    }
}
