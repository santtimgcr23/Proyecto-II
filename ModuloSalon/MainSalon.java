import java.io.IOException;

public class MainSalon{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cliente c = new Cliente();
        Salon salon = new Salon(15);
        OrdenScreen os = new OrdenScreen(c,salon,8);
    }     
}