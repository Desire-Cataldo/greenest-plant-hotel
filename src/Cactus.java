public class Cactus extends Plant implements CalculateLiquidAmount {

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquidAmount() {
        return LiquidType.CACTUS.getLiquidAmount();
    }
}
