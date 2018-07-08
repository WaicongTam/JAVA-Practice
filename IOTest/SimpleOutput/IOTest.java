import java.io.*;

public class IOTest implements Serializable {

    private int width;
    private int height; //Two variables to be saved.

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        IOTest test = new IOTest();
        test.setHeight(50);
        test.setWidth(20);
        System.out.println(test.height);
        System.out.println(test.width);

        try {
            FileOutputStream fs = new FileOutputStream("test.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(test);
            os.close();
            System.out.println("Successful!");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}