public enum Ulga {
    NORMALNY(1.0d), ULGOWY(0.5d);

    private double znizka;
    Ulga (double znizka) {
        this.znizka = znizka;
    }

    public double getZnizka() {
        return znizka;
    }
}
