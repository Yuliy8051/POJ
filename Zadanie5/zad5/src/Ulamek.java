public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek (int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public void mnozenie(Ulamek ulamek) {
        this.licznik *= ulamek.licznik;
        this.mianownik *= ulamek.mianownik;
    }

    public void dzielenia(Ulamek ulamek) {
        this.licznik *= ulamek.mianownik;
        this.mianownik *= ulamek.licznik;
    }

    public void dodawanie(Ulamek ulamek) {
        this.licznik = this.licznik * ulamek.mianownik + ulamek.licznik * this.mianownik;
        this.mianownik *= ulamek.licznik;
    }

    public void odejmowanie(Ulamek ulamek) {
        this.licznik = this.licznik * ulamek.mianownik - ulamek.licznik * this.mianownik;
        this.mianownik *= ulamek.licznik;
    }

    public void skrocenie() {
        int a = this.licznik;
        int b = this.mianownik;
        int nwd;
        while (a * b != 0) {
            if (a >= b) a %= this.mianownik;
            else b %= this.licznik;
        }
        nwd = a + b;
        this.licznik /= nwd;
        this.mianownik /= nwd;
    }

    public String toString() {
        return this.licznik + "/" + this.mianownik;
    }
}
