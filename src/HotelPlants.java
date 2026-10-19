import java.util.ArrayList;

public class HotelPlants {

    private ArrayList<Plant> allPlants = new ArrayList<>();

    // Polymorfism, listan har typen Plants men kan innehålla objekt av subklasserna Palm, Cactus och CarnivorousPlant.
    public HotelPlants() {
        allPlants.add(new Palm("Laura", 5));
        allPlants.add(new Palm("Olof", 1));
        allPlants.add(new Cactus("Igge", 0.2));
        allPlants.add(new CarnivorousPlant("Meatloaf", 0.7));
    }

    public Plant findPlantByName(String name) {
        for (Plant plant : allPlants) {
            if (plant.getName().equalsIgnoreCase(name)) {
                return plant;
            }
        }
        return null;
    }

    public ArrayList<Plant> getAllPlants() {
        return new ArrayList<>(allPlants);
    }
}
