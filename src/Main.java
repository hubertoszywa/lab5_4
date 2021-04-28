public class Main {

    public static void main(String[] args){

        Tramwaj t1 = new Tramwaj("Solaris", "KR6969", 2018, 80);
        t1.info();

        Ciezarowy c1 = new Ciezarowy("MAN", "TBU54JK4", 2009, 6.5);
        c1.info();

        Osobowy o1 = new Osobowy("Hyundai", "TK6543F", 2016, 130);
        o1.info();
    }
}
