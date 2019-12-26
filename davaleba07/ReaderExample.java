import java.io.*;
import java.io.FileReader;
public class ReaderExample {
    static void modifyFile(String filePath, String name1, String name2) {
        File file = new File(filePath);
        String oldData = "";
        BufferedReader reader = null;
        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                oldData = oldData + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newData = oldData.replaceAll(name1, name2);
            writer = new FileWriter(file);
            writer.write(newData);

            reader.close();
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        modifyFile("C:/Users/Khatia/IdeaProjects/dav06/src/file.txt", "seu", "sangu");

        System.out.println("done");
    }
}