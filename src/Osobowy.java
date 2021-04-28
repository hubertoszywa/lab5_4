public class Osobowy extends Samochod{

    private int moc_silnika;

    public Osobowy(String marka, String rejestracja, int rok_prod, int moc_silnika)
    {
        super(marka, rejestracja, rok_prod);
        this.moc_silnika = moc_silnika;
    }

    public void info(){
        super.info();
        System.out.println("Moc silnika w samochodzie osobowym: " + moc_silnika + "KM");
    }
}
