package FileServer.FileServer.src;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer 
{
    private static ObjectInputStream ois;
    private static ObjectOutputStream oos;

    public static void main(String[] args) throws Exception
    {
      ServerSocket serverSocket = new ServerSocket(5432);
      Socket socket = null;

      while (true)
      {
          try
          {
            socket = serverSocket.accept();
            String ip = socket.getInetAddress().toString();
            System.out.println("Se conectaron desde la IP: " +ip);

            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());

            String file = (String)ois.readObject();

            
          }

          catch (Exception ex)
          {
            ex.printStackTrace();
          }

          finally
          {
            if (oos != null) oos.close();
            if (ois != null) ois.close();
            if (socket != null) socket.close();
            if (serverSocket != null) serverSocket.close();
          }

      }
    }
}
