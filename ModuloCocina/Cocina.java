import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        writeFile(orden.toString() + "\n");
    }

    public void writeFile(String str){
        try {
            FileWriter myWriter = new FileWriter("ordenes.txt");
            myWriter.write(str);
            myWriter.close();
            } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
        }
    

    public void crearFile(){
        try {
            File myObj = new File("ordenes.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }

    public void printOrdenes(){
        for(Orden orden : ordenes){
            System.out.println(orden.toString() + "\n");
        }
    }

}