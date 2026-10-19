public abstract class Plant {

    // Inkapsling, variablerna är privata så att andra klasser inte kan ändra eller komma åt de direkt.
    // Getters används för att läsa variablernas värden från andra klasser.
    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {return height;}

    public String getName() {return name;}

    @Override
    public String toString() {
        return getName();
    }

}
