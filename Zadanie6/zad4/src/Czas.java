public enum Czas {
    JEDNIRAZOWY(1.0d), GODZINNY(1.5d), DOBOWY(4.5d);
    private double znizka;
    Czas(double znizka){
        this.znizka = znizka;
    }

    public double getZnizka() {
        return znizka;
    }
}
