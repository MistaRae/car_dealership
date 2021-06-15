package Car.components;

public enum Gearbox {

    MANUAL(1.00),
    AUTOMATIC(0.8);

    private final double economy;

    Gearbox(double economy) {
        this.economy = economy;
    }

    public double getEconomy() {
        return economy;
    }
}
