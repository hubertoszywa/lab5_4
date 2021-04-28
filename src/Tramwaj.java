public class Tramwaj extends Pojazd{

    private int liczba_pasazerow;

    public Tramwaj(String marka, String rejestracja, int rok_prod, int liczba_pasazerow)
    {
        super(marka, rejestracja, rok_prod);
        this.liczba_pasazerow = liczba_pasazerow;
    }

    public void info(){
        super.info();
        System.out.println("Liczba pasażerów w tramwaju: " + liczba_pasazerow + " osób");
    }
}
