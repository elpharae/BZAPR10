package pkg;

public class Nemovitost {

    private int rozloha;
    private int cena;

    public Nemovitost(int rozloha, int cena) {
        this.rozloha = rozloha;
        this.cena = cena;
    }

    public int getRozloha() { return rozloha; }
    public int getCena() { return cena; }
    public void setRozloha(int rozloha) { this.rozloha = rozloha; }
    public void setCena(int cena) { this.cena = cena; }

    @Override
    public String toString() {
        return this.rozloha + " m2, " + this.cena + " czk";
    }
}
