public class Main{
    public static void main(String[] args) {
        Cliente c = new Cliente();
        OrdenScreen os = new OrdenScreen(c);
        os.setVisible(true);        
    }     
}