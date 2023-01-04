import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args){
        String basePath = System.getProperty("user.dir");
        Path file = Paths.get(basePath + "\\Test\\src\\main\\assets\\credentials.csv");
        if (Files.isReadable(file)) {
            System.out.println("The file is readable.");
        } else {
            System.out.println("The file is not readable.");
}
    }
}
