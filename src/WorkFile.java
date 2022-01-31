import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WorkFile {
    public static void main(String[] args)throws IOException {
        try {
            saveFile();
        } catch (IllegalStateException ex){
            System.out.println("«Код слишком большой»");
        } catch (FileNotFoundException e ){
            System.out.println("файл не доступен");
        }

    }

    public static void saveFile() throws IOException {


        File file = new File("tryCatch.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Unchecked исключении компилятор не подсказывает но оно нуждается в обработке\nchecked  её надо обязательно обрабатыват");
        fileWriter.close();
        if (file.length() > 100) {
            throw new IllegalStateException();
        }
        System.out.println(file.length());

    }
}
