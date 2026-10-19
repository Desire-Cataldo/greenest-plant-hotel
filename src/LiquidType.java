public enum LiquidType {

    PALM("tap water", 0.5),
    CACTUS("mineral water", 0.02),
    CARNIVOROUSPLANT("protein drink", 0.1);

    private final String liquidType;
    private final double liquidAmount;

    LiquidType(String liquidType, double liquidAmount) {
        this.liquidType =  liquidType;
        this.liquidAmount = liquidAmount;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public double getLiquidAmount() {
        return liquidAmount;
    }
}

