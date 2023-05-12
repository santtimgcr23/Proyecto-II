import java.util.ArrayList;

public class Cocina {
    ArrayList<Orden> ordenes = new ArrayList<Orden>();

    public Cocina(){

    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void addOrdenes(Orden orden){
        ordenes.add(orden);
    }

}