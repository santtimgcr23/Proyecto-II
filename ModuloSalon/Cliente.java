import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

// public class Cliente {
//     Socket socket;

//     public Cliente() {
//         conectar();
//     }
    
//     public void conectar(){ 
//         try {
//             socket = new Socket("localhost", 8084);//192.4.1.1 o "127.0.0.1" o "localhost"
//             System.out.println("Soy el cliente y me conecté");
            
//             DataInputStream entrada = new DataInputStream(socket.getInputStream());
//             System.out.println("Leído del server un: " + entrada.readUTF());
            
//             DataOutputStream salida = new DataOutputStream(socket.getOutputStream());
//             salida.writeUTF("Sí ya se que me conecté, te mando mi codigo");
//             salida.writeInt(999);     
            
//         } catch (IOException ex) {
            
//         }
        
//     }

//     public void enviarOrden(Orden orden) throws IOException{
//         OutputStream socketOrden = socket.getOutputStream();
//         ObjectOutputStream enviarOrden = new ObjectOutputStream(socketOrden);
//         enviarOrden.writeObject(orden);
//         System.out.println("Orden enviada con exito".toUpperCase());
//     }
    
// }
public class Cliente {
    Socket socket;
    int mesas;
    public Cliente() throws IOException{
        conectar();
    }
    public void conectar() throws IOException{
        try {
            socket = new Socket("localhost", 9999);
            System.out.println("Cliente conectado");
            // DataInputStream dis = new DataInputStream(socket.getInputStream());
            // mesas = dis.readInt();
            // System.out.println("Cantidad de mesas: " + mesas);
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public int getMesas() {
        return mesas;
    }
    public void setMesas(int mesas) {
        this.mesas = mesas;
    }
    public void enviarOrden(Orden orden) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(orden);
        System.out.println("SEXPNGO");
    }
}