import java.util.ArrayList;
import java.util.List;

public class HambClassic extends Hamburguesa{

    public HambClassic() {
        super("La Classic", new ArrayList<String>(List.of("Pan", "Torta", "Queso")), 800);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}