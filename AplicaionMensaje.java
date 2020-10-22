/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaionmensaje;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author FP Mañana A
 */
public class AplicaionMensaje extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button enviar = new Button ("Enviar");
        VBox v=new VBox(20);
        Label correo=new Label ("Para:");
        
        //ComboBox del email
        ComboBox email=new ComboBox();
        email.getItems().addAll(
            "sara@gail.com",
            "carlota@gmail.com",
            "estela@gamil.com",
            "david@gmail.com",
            "diego@gmail.com"
        );
        
        //Solo sera viible 3 correor y saldra una barra de desplazamiento
        email.setVisibleRowCount(3);
        
        //Hint email
        
        email.setPromptText("Escriba ladireccion de correo electronico");
        
        //Editar el texto
        
        email.setEditable(true);
        
        Label priorid = new Label ("Notificacion");
        
        ComboBox prioridad=new ComboBox();
        prioridad.getItems().addAll(
            "Alta",
            "Media",
            "Baja"           
        );
         
        //Predeterminado
        prioridad.setValue("Media");
        
        //Cambar color al ComboBox prioridad
        
        prioridad.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
                @Override public ListCell<String> call(ListView<String> param) {
                    final ListCell<String> cell = new ListCell<String>() {
                        {
                            super.setPrefWidth(100);
                        }    
                        @Override public void updateItem(String item, 
                            boolean empty) {
                                super.updateItem(item, empty);
                                if (item != null) {
                                    setText(item);    
                                    if (item.contains("Alta")) {
                                        setTextFill(Color.RED);
                                    }
                                    else if (item.contains("Media")){
                                        setTextFill(Color.GREEN);
                                    }
                                    else {
                                        setTextFill(Color.BROWN);
                                    }
                                }
                                else {
                                    setText(null);
                                }
                            }
                };
                return cell;
            }
        });
        
        Label destinatrio=new Label ("Titulo");
        TextField titulo = new TextField("");
        TextArea mensaje = new TextArea ("");
        Scene escena=new Scene(v,500,500);

        v.getChildren().addAll(correo,email,priorid,prioridad,destinatrio,titulo,mensaje,enviar);
        stage.setScene(escena);
        stage.show();
    }
    
}
