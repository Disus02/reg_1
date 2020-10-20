package sample;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Module {
    public void createFile(String login,String password) throws IOException {
        File file = new File("D://Java.pro/Reg.txt");
        FileWriter fos = new FileWriter(file);
        file.createNewFile();
        fos.write( login +"\n" + password);
        fos.close();
    }
}
