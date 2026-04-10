import java.util.Scanner;

public class BEE1176{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        long[] N = new long[61];

        long T = teclado.nextLong(); 

        long[] fib = new long[61];

        int posicao = 0; 

        fib[0] = 0; 
        fib[1] = 1; 

        for(int i = 2; i <= 60; i++){
            fib[i] = fib[i -1] + fib[i - 2];
        }

        for(int i = 0; i < T; i++){
            posicao = teclado.nextInt();
            System.out.println("Fib(" + posicao + ") = " + fib[posicao]);
        }

    

        teclado.close();

    }
}