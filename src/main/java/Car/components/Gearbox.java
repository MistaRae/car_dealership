package Car.components;

public enum Gearbox {

    MANUAL(1.00),
    AUTOMATIC(2.25);

    private final double economy;

    Gearbox(double economy) {
        this.economy = economy;

    }
}
