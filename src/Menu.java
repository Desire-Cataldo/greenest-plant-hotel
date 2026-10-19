import java.util.Locale;
import java.util.Scanner;

public class Menu {

    static HotelPlants plantsAtHotel = new HotelPlants();

    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\u001B[34m \n- Greenest Plant Hotel - \u001B[0m");
            System.out.println("\nPlants at the hotel: ");
            for (Plant plantName : plantsAtHotel.getAllPlants()) {
                System.out.println(plantName);
            }
            System.out.println("\nWhich plant would you like to water?");
            System.out.println("Type exit to quit ");
            System.out.print("Choose: ");


            String plantName = scanner.nextLine();
            String name = plantName.toLowerCase(Locale.ROOT);


            switch (name) {
                case "laura", "olof" -> {
                    Palm palm = (Palm) plantsAtHotel.findPlantByName(name);
                    System.out.println(palm.getName() + " needs " + palm.calculateLiquidAmount() + "L " + LiquidType.PALM.getLiquidType() + " per day");
                }
                case "igge" -> {
                    Cactus cactus = (Cactus) plantsAtHotel.findPlantByName(name);
                    System.out.println(cactus.getName() + " needs " + cactus.calculateLiquidAmount() + "L " + LiquidType.CACTUS.getLiquidType() + " per day");
                }
                case "meatloaf" -> {
                    CarnivorousPlant carnivorousPlant = (CarnivorousPlant) plantsAtHotel.findPlantByName(name);
                    System.out.println(carnivorousPlant.getName() + " needs " + carnivorousPlant.calculateLiquidAmount() + "L " + LiquidType.CARNIVOROUSPLANT.getLiquidType() + " per day");
                }
                case "exit" -> {
                    System.out.println("The program is closing");
                    running = false;
                }
                default -> {
                    System.out.println("Enter a valid plant name at the hotel or type exit");
                }
            }
        }
        scanner.close();
    }
}
