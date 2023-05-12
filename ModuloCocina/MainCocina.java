import java.io.IOException;

public class MainCocina {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        Cocina c = new Cocina();
        Server s = new Server(c);
        c.printOrdenes();
    }
}
