import java.io.*;
import java.net.*;
import java.util.*;

public class VerySimpleChatServer {
    ArrayList ClientOutputStreams;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket ClientSocket) {
            try {
                sock = ClientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
        
        public void run() {
            String message;
            try {
                while((message = reader.readLine()) != null) {
                    System.out.println("read" + message);
                    tellEveryone(message);
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void tellEveryone(String message) {
        Iterator it = ClientOutputStreams.iterator();
        while(it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void go() {
        ClientOutputStreams = new ArrayList();
        try {
            
        }
    }
}