package lutyProgramowanie;



import java.util.Arrays;

public class ChoinkiZInternetu {
    private static java.util.Arrays Arrays;

    public static void main(String[] args)
    {
        trapez('#',4,1,5);
        trapez('*',4,3,4);
        trapez('*',4,5,3);
    }
    private static void trapez(char znak, int height, int width, int margines) //margines, to ilość "pustki" w pierwszym wierszu
    {
        char[] prefix = new char[margines];
        Arrays.fill(prefix,' ');
        char[] line = new char[width];
        Arrays.fill(line,znak);
        String wiersz = new String(line);
        for(int i=0;i<height;i++)
        {
            System.out.println(new String(prefix,0,margines-i) + wiersz);
            wiersz = wiersz + znak + znak;
        }
    }
}


