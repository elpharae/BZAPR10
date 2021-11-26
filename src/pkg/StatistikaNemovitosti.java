package pkg;

public class StatistikaNemovitosti {

    private Nemovitost[] nemovitosti;
    private int pocetNemovitosti;

    public StatistikaNemovitosti(Nemovitost[] nemovitosti) {
        this.nemovitosti = nemovitosti;
        this.pocetNemovitosti = this.nemovitosti.length;
    }

    public void pridejNemovitost(Nemovitost nemovitost) {
        Nemovitost[] temp = new Nemovitost[++this.pocetNemovitosti];
        for(int i = 0; i < temp.length - 1; i++) temp[i] = this.nemovitosti[i];
        temp[this.pocetNemovitosti - 1] = nemovitost;
        this.nemovitosti = temp;
    }

    public void vypisNemovitosti() {
        for(Nemovitost nemovitost : this.nemovitosti) System.out.println(nemovitost);
    }

    public double vypocitejPrumernouCenu() {
        double sum = 0;
        for(Nemovitost nemovitost : this.nemovitosti) sum += nemovitost.getCena();
        return sum / this.pocetNemovitosti;
    }

    public void vypisPodprumerneDraheNemovitosti() {
        double prumer = vypocitejPrumernouCenu();
        for(Nemovitost nemovitost : this.nemovitosti) if(nemovitost.getCena() < prumer) System.out.println(nemovitost);
    }

    public Nemovitost najdiNejlevnejsiNemovitost() {
        Nemovitost temp = this.nemovitosti[0];
        for(Nemovitost nemovitost : this.nemovitosti) if(nemovitost.getCena() < temp.getCena()) temp = nemovitost;
        return temp;
    }

    public Nemovitost najdiNejdrazsiNemovitost() {
        Nemovitost temp = this.nemovitosti[0];
        for(Nemovitost nemovitost : this.nemovitosti) if(nemovitost.getCena() > temp.getCena()) temp = nemovitost;
        return temp;
    }

    public Nemovitost nejlepsiPomerRozlohaCena() {
        Nemovitost obj = this.nemovitosti[0];
        double temp = pomerRozlohaCena(obj);
        for(Nemovitost nemovitost : this.nemovitosti) if(pomerRozlohaCena(nemovitost) > temp) {
            obj = nemovitost;
            temp = pomerRozlohaCena(obj);
        }
        return obj;
    }

    private double pomerRozlohaCena(Nemovitost nemovitost) {
        System.out.println((double) nemovitost.getCena() / nemovitost.getRozloha());
        return (double) nemovitost.getRozloha() / nemovitost.getCena();
    }
}
