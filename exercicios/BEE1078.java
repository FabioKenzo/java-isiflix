import java.util.Scanner;

public class BEE1078{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();
    int tabuada; 

    for(int contador = 1; contador <= 10; contador++){
        tabuada = n * contador; 
        System.out.println(contador + " x " + n + " = " + tabuada);
    }

    teclado.close();

    }
}