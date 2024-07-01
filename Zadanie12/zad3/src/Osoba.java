public class Osoba implements Comparable{
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return this.imie + " " + this.nazwisko;
    }

    @Override
    public int compareTo(Object o) {
        Osoba that = (Osoba)o;
        return that.nazwisko.compareTo(this.nazwisko);
    }
}
