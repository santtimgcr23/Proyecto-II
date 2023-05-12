import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
    Cocina cocina;
    ServerSocket server;
    Socket socketCliente;
    DataOutputStream salida;
    DataInputStream entrada;
    ObjectInputStream objReader;
    

    public Server(Cocina cocina) throws ClassNotFoundException, IOException {
        this.cocina = cocina;
        start();
        recibirOrden();
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

    public Orden recibirOrden() throws IOException, ClassNotFoundException {
        while (true){
            try {
                InputStream socketOrden = socketCliente.getInputStream();
                ObjectInputStream recibirOrden = new ObjectInputStream(socketOrden);
                Orden orden = (Orden) recibirOrden.readObject();
                cocina.addOrdenes(orden);
                System.out.println("Orden recibida con exito".toUpperCase());
                return orden;
            } catch (SocketException e) {
                System.out.println("Error en la conexión: " + e.getMessage());
                break;
            }
        }
        socketCliente.close();
        return null;
    }
    
}
