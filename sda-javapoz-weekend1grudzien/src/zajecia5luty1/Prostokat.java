package zajecia5luty1;
//Utwórz klasę ProstokatProgram, w której utworzysz 3 prostokąty i obliczysz ich pola i obwody.
//Wymiary prostokątów powinny pochodzić od użytkownika (z klawiatury)

public class Prostokat {
    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int obliczPole() {
        return bokA * bokB;
    }

    public int obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }

    //getter i setter - dla pola bokA

    //metoda gettera
    public int getBokA() {
        return this.bokA;

    }

    public void setBokA(int bokA) {
        if (bokA > 0) {
            this.bokA = bokA;
        } else {
            throw new IllegalArgumentException("Bok nie może być ujemny");
        }
    }

    public int getBokB() {
        return this.bokA;

    }

    public void setBokB(int bokB) {
        if (bokA > 0) {
            this.bokB = bokB;
        } else throw new IllegalArgumentException("Bok nie może być ujemny");

    }
}