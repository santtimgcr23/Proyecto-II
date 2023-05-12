import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    ServerSocket server;
    Socket socketCliente;
    DataOutputStream salida;
    DataInputStream entrada;
    ObjectInputStream objReader;
    

    public Server() {
        start();
    }
    
    public void start(){
        try {
            server = new ServerSocket(8084); //1025-65535
            System.out.println("Esperando cliente ...");
            socketCliente = server.accept();
            System.out.println("Primer Cliente conectado");
            
            salida = new DataOutputStream(socketCliente.getOutputStream());
            salida.writeUTF("Hola, te conectaste con éxito");
            
            entrada = new DataInputStream(socketCliente.getInputStream());
            System.out.println("Recibido del cliente: " + entrada.readUTF());
            System.out.println("Recibido del cliente el código: " + entrada.readInt());
            
            objReader = new ObjectInputStream(socketCliente.getInputStream());
            
        } catch (IOException ex) {
            
        }
    }
    
    
    
    
}
