public class CarnivorousPlant extends Plant implements CalculateLiquidAmount {

    public static final double LITERS_PER_METER = 0.2;

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquidAmount() {
        return LiquidType.CARNIVOROUSPLANT.getLiquidAmount() + LITERS_PER_METER * getHeight();
    }
}
