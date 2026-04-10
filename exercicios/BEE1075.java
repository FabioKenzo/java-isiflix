import java.util.Scanner;

public class BEE1075{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();

    for(int contador = 1; contador <= 10000; contador++){
        if(contador % n == 2){
            System.out.println(contador);
        }
    }

    teclado.close();
    }
}