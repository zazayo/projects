package lutyProgramowanie;

import java.util.Scanner;

public class Choinki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] macierz = new int[8][8];

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < i; j++) {

                    System.out.print("# ");
                }

            System.out.println();
        }
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j > i-i; j++) {

                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }


