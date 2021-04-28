public class Pojazd {

    private String marka;
    private String rejestracja;
    private int rok_prod;

    public Pojazd(String marka, String rejestracja, int rok_prod){
        this.marka = marka;
        this.rejestracja = rejestracja;
        this.rok_prod = rok_prod;
    }

    public void info(){
        System.out.println("Marka pojazdu: " + marka);
        System.out.println("Rejestracja pojazdu: " + rejestracja);
        System.out.println("Rok produkcji pojazdu: " + rok_prod);
    }

}
