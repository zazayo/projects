package lutyProgramowanie;

public class antyEcho {
    public static void main(String[] args) {
        // Napisz program, który odwraca wprowadzony tekst (AntyEcho)

        String slowo = "agnieszka";
        for (int i = 0; i < slowo.length(); i++) {

            int kod = slowo.charAt(i);

            System.out.println(kod);


        }
    }
}
