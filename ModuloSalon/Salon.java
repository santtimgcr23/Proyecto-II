import java.util.ArrayList;

public class Salon {
    int cantidadMesas;
    ArrayList<Mesa> mesas;
    ArrayList<Orden> ordenes;
    public Salon(int cantidadMesas){
        this.cantidadMesas = cantidadMesas;
        //crearMesas();
    }

    public void crearMesas(){
        for (int i = 0; i < mesas.size(); i++){
            mesas.add(new Mesa(i+1, false));
        }
    }
}
