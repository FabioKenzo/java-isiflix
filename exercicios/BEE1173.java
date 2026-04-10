import java.util.Scanner;

public class BEE1173{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt(); 

        int[] N = new int[10]; 

        int i = 0; 

        N[0] = valor;

        for(i = 1; i < N.length; i++){
            N[i] = N[i - 1] * 2;
        }

        for(i = 0; i < N.length; i++){
            System.out.println("N[" + i + "] = " + N[i]);
        }

        teclado.close();
    }
}