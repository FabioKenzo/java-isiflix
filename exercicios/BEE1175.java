import java.util.Scanner;

public class BEE1175{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int[] N = new int[20]; 
        int i = 0; 

        for(i = 0; i < N.length; i++){
            N[i] = teclado.nextInt(); 
        }

        for(i = 0; i < N.length / 2; i++){
            int troca = N[i]; 
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = troca;
        }

        for(i = 0; i < N.length; i++){
            System.out.println("N[" + i + "] = " + N[i]);
        }

        teclado.close();
    }
}