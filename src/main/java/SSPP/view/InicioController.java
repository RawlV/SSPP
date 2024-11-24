package SSPP.view;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InicioController {

    @FXML
    public void cerrarSesion(ActionEvent event) {
        // Lógica para cerrar sesión (si es necesario)
        System.out.println("Cerrando sesión...");
        System.exit(0); // Cierra la aplicación
    }

    @FXML
    public void abrirRegistro(ActionEvent event) {
        RegistroController.show(); // Llama al método Singleton para mostrar la pantalla
    }

    @FXML
    public void abrirVisualizacion(ActionEvent event) {
        // Cambiar a la pantalla de Visualización de Presos
        System.out.println("Abriendo pantalla de visualización...");
        // Aquí cargarías la pantalla correspondiente
    }

    @FXML
    public void abrirModificacion(ActionEvent event) {
        // Cambiar a la pantalla de Modificación de Presos
        System.out.println("Abriendo pantalla de modificación...");
        // Aquí cargarías la pantalla correspondiente
    }
}

