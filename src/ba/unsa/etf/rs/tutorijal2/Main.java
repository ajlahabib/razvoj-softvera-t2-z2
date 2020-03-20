package ba.unsa.etf.rs.tutorijal2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Zadatak 2");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    public static int sumaCifara(int n) {
        int suma = 0;
        int broj;
        do {
            broj = n % 10;
            suma = suma + broj;
            n = n / 10;
        } while (n != 0);
        return suma;
    }


    public static void main(String[] args) {
        Scanner ulaz=new java.util.Scanner(System.in);
        int n;
        System.out.println("Unesite n:");
        n=ulaz.nextInt();
        for(int i=1;i<n;i++) {
            int a = sumaCifara(i);
            if(i%a==0){
                System.out.println(i);
            }
        }
        launch(args);
    }

}
