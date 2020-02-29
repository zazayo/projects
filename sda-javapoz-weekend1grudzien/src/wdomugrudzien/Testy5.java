package wdomugrudzien;

public class Testy5 {
    public static void main(String[] args) {
        boolean flag = true;
        int i =3;
        while(flag) {
            i--;
            System.out.print(i*2);
            if(i==0) flag = false; // najpierw wypisuje, potem sprawdza warunek
        }
    }
}
//420
//