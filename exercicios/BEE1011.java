import java.util.Scanner;

public class BEE1011{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int raio;
        double pi, volume;
        raio = teclado.nextInt();
        pi = 3.14159;

        volume = (4.0 / 3) * pi * raio * raio * raio;
        System.out.printf("VOLUME = %.3f\n", volume);

        teclado.close();


    }
}