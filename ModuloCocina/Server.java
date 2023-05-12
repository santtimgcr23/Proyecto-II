import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

// public class Server {
//     Cocina cocina;
//     ServerSocket server;
//     Socket socketCliente;
//     DataOutputStream salida;
//     DataInputStream entrada;
//     ObjectInputStream objReader;
    

//     public Server(Cocina cocina) throws ClassNotFoundException, IOException {
//         this.cocina = cocina;
//         start();
//         recibirOrden();
//     }
    
//     public void start(){
//         try {
//             server = new ServerSocket(8084); //1025-65535
//             System.out.println("Esperando cliente ...");
//             socketCliente = server.accept();
//             System.out.println("Primer Cliente conectado");
            
//             salida = new DataOutputStream(socketCliente.getOutputStream());
//             salida.writeUTF("Hola, te conectaste con éxito");
            
//             entrada = new DataInputStream(socketCliente.getInputStream());
//             System.out.println("Recibido del cliente: " + entrada.readUTF());
//             System.out.println("Recibido del cliente el código: " + entrada.readInt());
            
//             objReader = new ObjectInputStream(socketCliente.getInputStream());
            
//         } catch (IOException ex) {
            
//         }
//     }

//     public Orden recibirOrden() throws IOException, ClassNotFoundException {
//         while (true){
//             try {
//                 InputStream socketOrden = socketCliente.getInputStream();
//                 ObjectInputStream recibirOrden = new ObjectInputStream(socketOrden);
//                 Orden orden = (Orden) recibirOrden.readObject();
//                 cocina.addOrdenes(orden);
//                 System.out.println("Orden recibida con exito".toUpperCase());
//                 return orden;
//             } catch (SocketException e) {
//                 System.out.println("Error en la conexión: " + e.getMessage());
//                 break;
//             }
//         }
//         socketCliente.close();
//         return null;
//     }
    
// }

public class Server {
    ServerSocket serverSocket;
    Socket socket;
    Cocina cocina;
    ObjectInputStream entrada;

    public Server(Cocina cocina) throws ClassNotFoundException, IOException{
        this.cocina = cocina;
        iniciarServer();
        recibirOrdenes();
    }

    // public void start() throws IOException, ClassNotFoundException{
    //     serverSocket = new ServerSocket(9999);
    //     while (true){
    //         socket = serverSocket.accept();
    //         ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
    //         Orden orden = (Orden)in.readObject();
    //         cocina.addOrdenes(orden);
    //         cocina.printOrdenes();
    //     }
    // }

    public void recibirOrdenes() throws IOException, ClassNotFoundException{
        Thread inputThread = new Thread(() -> {
            while (true) {
                try {
                    entrada = new ObjectInputStream(socket.getInputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    Orden orden = (Orden)entrada.readObject();
                    cocina.addOrdenes(orden);
                    cocina.printOrdenes();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        inputThread.start();
    }

    public void iniciarServer(){
        try {
            serverSocket = new ServerSocket(9999);
            //acepta el cliente
            socket = serverSocket.accept();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
