package healthcare.model.Buildings;
import org.healthcare.model.*;
import java.util.*;
public class Pharmacy extends Building{

    Set<Medicine> medicine = new HashSet<Medicine>();

    public Pharmacy(String name, String description, String address,
                    int numberOfRooms, int totalArea, int numberOfFloors) {
        super(name, description, address, numberOfRooms, totalArea, numberOfFloors);
    }
}
