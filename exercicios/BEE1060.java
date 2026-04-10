import java.util.Scanner;

public class BEE1060{
    public static void main(String args[]){

    int positivos;
    float num;
    positivos = 0;

    Scanner teclado = new Scanner(System.in);

    for(int contador = 0; contador < 6; contador++){
        num = teclado.nextFloat();
        if(num > 0){
            positivos++;
        }
    }
    System.out.println(positivos + " valores positivos");

    teclado.close();

    }
}