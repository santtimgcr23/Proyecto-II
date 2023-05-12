import java.util.ArrayList;
//Clase abstracta para implementar el Factory Method para crear las hamburguesas

public abstract class Hamburguesa {
    protected String nombre;
    protected ArrayList<String> ingredientes;
    int precio;

    public Hamburguesa(String nombre, ArrayList<String> ingredientes, int precio){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(nombre.toUpperCase() + "\nINGREDIENTES:\n");
        for (String ingrediente : ingredientes){
            sb.append(ingrediente);
            sb.append("\n");
        }
        return sb.toString();}

}