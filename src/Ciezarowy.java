public class Ciezarowy extends Samochod{

    private double ladownosc;

    public Ciezarowy(String marka, String rejestracja, int rok_prod, double ladownosc)
    {
        super(marka, rejestracja, rok_prod);
        this.ladownosc = ladownosc;
    }

    public void info(){
        super.info();
        System.out.println("Ladownosc samochodu ciężarowego: " + ladownosc + " ton");
    }
}
