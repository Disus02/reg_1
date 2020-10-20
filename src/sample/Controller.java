package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Controller {

    Module module = new Module();

    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private Label status;
    String pass="";
    String log="";
    @FXML
    public void pressRegistr(ActionEvent event) throws IOException {
        module.createFile(name.getText(),password.getText());
        status.setText("Вы зарегистрированы");
        status.getText();
    }
    @FXML
    public void PressOpen(ActionEvent event) throws IOException {
        FileReader fis = new FileReader("D://Java.pro/Reg.txt");
        String str;
        var buffer=new BufferedReader(fis);
        ArrayList<String> arrayList = new ArrayList<>();
        while ((str = buffer.readLine())!=null){
            if (str.isEmpty())break;
            arrayList.add(str);
        }
        pass=password.getText();
        log = name.getText();
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(log);
        arrayList1.add(pass);
        if (arrayList.equals(arrayList1)){
            status.setText("Вы авторизованы");
        }else status.setText("Зарегистрируйтесь: ");

        fis.close();
    }
}