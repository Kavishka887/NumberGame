package controller.gameformcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LevelTwo {
    public AnchorPane root;

    public void btnLevelTwoOnAction(ActionEvent actionEvent) throws Exception{
        Parent parent = FXMLLoader.load(this.getClass().getResource("../../view/gameformlevels/LevelThreeForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Level Three");
        stage.centerOnScreen();
    }
}
