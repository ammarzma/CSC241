import java.io.*;

public class Lab19 {
    public static void main(String[] args) throws IOException {
        try {
            File sourceFile = new File("test.dat");
            File distFile = new File("test-out.dat");

            new BufferedOutputStream(new FileOutputStream(distFile)) {{
                write(new BufferedInputStream(new FileInputStream(sourceFile)).readAllBytes());
                close();
            }};
        }
        catch (FileNotFoundException e){
            File sourceFile = new File("test.dat");
            new DataOutputStream(new FileOutputStream(sourceFile)).write(new byte[]{55, 127, 126});
            main(args);
        }
    }
}
