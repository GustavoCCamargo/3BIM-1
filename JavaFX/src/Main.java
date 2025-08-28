import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Chama o exemplo 1
        Ex1 ex1 = new Ex1();
        ex1.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
