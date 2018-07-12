import java.io.*;

public class IOTest {
    public static void main(String[] args) {
        try {
            FileInputStream is = new FileInputStream("test.ser");
            ObjectInputStream obj = new ObjectInputStream(is);

            IOTest box;
            box = (IOTest) obj.readObject();
            is.close();

            System.out.println("Successful");

            int a = box.height;
            int b = box.width;
             
            System.out.println(a);
            System.out.println(b);
        } catch(IOException ex) {
            System.out.println("Failed");
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}