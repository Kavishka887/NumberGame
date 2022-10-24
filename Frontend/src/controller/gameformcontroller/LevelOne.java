package controller.gameformcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.GroupBuilder;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LevelOne {
    public AnchorPane root;
    public ImageView questionimg;

    public void btnLevelOneOnAction(ActionEvent actionEvent) throws Exception{
        Parent parent = FXMLLoader.load(this.getClass().getResource("../../view/gameformlevels/LevelTwoForm.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Level Two");
        stage.centerOnScreen();

        Group questionimg = new Group();
        String imageSource = "https://www.sanfoh.com/uob/smile/data/s2cb7cad8553a7cb0133e5dcff9n493.png";
        ImageView imageView = ImageViewBuilder.create()
                .image(new Image(imageSource))
                .build();
        Group myGroup = GroupBuilder.create()
                .children(imageView)
                .build();
        questionimg.getChildren().add(myGroup);
    }
}
