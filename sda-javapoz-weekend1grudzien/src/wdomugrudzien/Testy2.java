package wdomugrudzien;

public class Testy2 {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 10, 100, -100};
        int a = tab[2] + tab[3]; // 100 +(-100) = 0 --> index 0
        System.out.print(tab[a]); // odczytujemy 0 index z tablicy czyli 1
        System.out.println("A" + tab[tab[a] + 1]);
        //tab[a] to było 1, plus 1 daje 2.
        // index 2 z tablicy to 100

//1A100



    }
}


