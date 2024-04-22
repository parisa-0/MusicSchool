package NetworkSocket;
import java.io.*;
import java.net.*;

import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept(); // Establishes connection
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            ss.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

