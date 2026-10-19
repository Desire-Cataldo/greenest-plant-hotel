// Arv, klassen ärver från Plants och använder Plants egenskaper som tex namn och höjd.
public class Palm extends Plant implements CalculateLiquidAmount {

    public Palm(String name, double height) {
        super(name, height);
    }

    // Interface, alla växtklasser implementerar samma interface som innehåller metoden calculateLiquidAmount.
    @Override
    public double calculateLiquidAmount() {
        return LiquidType.PALM.getLiquidAmount() * getHeight();

    }
}
