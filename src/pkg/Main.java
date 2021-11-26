package pkg;

public class Main {

    private static final Nemovitost[] NEMOVITOSTI = {
        new Nemovitost(3000, 600000),
        new Nemovitost(5000, 4000000),
        new Nemovitost(7000, 20000000),
        new Nemovitost(9000, 100000000),
    };

    private Main() {
        StatistikaNemovitosti statistika = new StatistikaNemovitosti(Main.NEMOVITOSTI);

        System.out.println("Průměrná cena: " + statistika.vypocitejPrumernouCenu());
        System.out.println("Nejdražší nemovitost: " + statistika.najdiNejdrazsiNemovitost());
        System.out.println("Nejlevnější nemovitost: " + statistika.najdiNejlevnejsiNemovitost());
        System.out.println("Nejlepší poměr cena/rozloha: " + statistika.nejlepsiPomerRozlohaCena());
        System.out.println("Podprůměrně drahé nemovitosti:");
        statistika.vypisPodprumerneDraheNemovitosti();

        System.out.println("-------");
        statistika.pridejNemovitost(new Nemovitost(1000, 80000));
        System.out.println("Průměrná cena: " + statistika.vypocitejPrumernouCenu());
        System.out.println("Nejdražší nemovitost: " + statistika.najdiNejdrazsiNemovitost());
        System.out.println("Nejlevnější nemovitost: " + statistika.najdiNejlevnejsiNemovitost());
        System.out.println("Nejlepší poměr cena/rozloha: " + statistika.nejlepsiPomerRozlohaCena());
        System.out.println("Podprůměrně drahé nemovitosti:");
        statistika.vypisPodprumerneDraheNemovitosti();
    }

    public static void main(String[] args) {
        new Main();
    }
}
