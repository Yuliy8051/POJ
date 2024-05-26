public class Osoba {
    private String imie;
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) throws Exception {
        sprawdzDaneOsoby(imie, nazwisko, rokUrodzenia);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString() {
        return "Mam na imię " + this.imie + " " + this.nazwisko + " i urodziłem się w " + this.rokUrodzenia + " roku";
    }

    public void sprawdzDaneOsoby(String imie, String nazwisko, int rokUrodzenia) throws Exception{
        if (imie == null) throw new Exception("Podano niewłaściwe imię");
        if (nazwisko == null) throw new Exception("Podano niewłaściwe nazwisko!");
        if (rokUrodzenia < 1900 || rokUrodzenia > 2020) throw new Exception("Podano niewłaściwy rok urodzenia!");
    }
}
