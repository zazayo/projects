package lutyProgramowanie;

public class listaPracownikowAga {
    private final static int DOMYSLNA_LICZBA_PRACOWNIKOW = 100;

    private String imie;
    private String nazwisko;
    private char plec;
    private int nr_dzialu;
    private float placa;
    private int wiek;
    private boolean stan_cywilny;


    public String wszystkieDane() {
        final StringBuffer sb = new StringBuffer("listaPracownikow{");
        sb.append("imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append(", plec=").append(plec);
        sb.append(", nr_dzialu=").append(nr_dzialu);
        sb.append(", placa=").append(placa);
        sb.append(", wiek=").append(wiek);
        sb.append(", stan_cywilny=").append(stan_cywilny);
        sb.append('}');
        return sb.toString();
    }


    public String imieNazwiskoPlaca() {
        final StringBuffer sb = new StringBuffer("listaPracownikow{");
        sb.append("imie='").append(imie).append('\'');
        sb.append(", nazwisko='").append(nazwisko).append('\'');
        sb.append(", placa=").append(placa);
        sb.append('}');
        return sb.toString();
    }

    public listaPracownikowAga(String imie, String nazwisko, char plec, int nr_dzialu, float placa, int wiek, boolean stan_cywilny) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nr_dzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.stan_cywilny = stan_cywilny;




    }
}
