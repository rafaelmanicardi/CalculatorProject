package src;
import javafx.application.*;
import javafx.stage.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Result");
        Button botao = new Button("Clique");
        botao.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("resultado");
                
            }
            
        });
        
        StackPane root = new  StackPane();
        root.getChildren().addAll(botao);
        primaryStage.setScene(new Scene(root, 300, 250 ));
        primaryStage.show();
    }
    
}
