package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController {
    public AnchorPane root;

    public void btnLoginOnAction(ActionEvent actionEvent) throws Exception{
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }

    public void lblSignUpOnMouseClicked(MouseEvent mouseEvent) throws Exception{
        Parent parent = FXMLLoader.load(this.getClass().getResource("../view/RegisterForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Register Form");
        stage.centerOnScreen();
    }
}
