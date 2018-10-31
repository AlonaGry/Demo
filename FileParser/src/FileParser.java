import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileParser {

    private FileParser(){}

    public List<String> FileToString(String path){

        List<String> fromFile = null;

        try {
            fromFile = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(" ");
        }

        return fromFile;
    }



}