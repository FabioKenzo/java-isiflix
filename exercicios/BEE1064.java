import java.util.Scanner;

public class BEE1064{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    float valor, media;
    int numPositivos;
    numPositivos = 0;
    media = 0;
    
    for(int contador = 1; contador <= 6; contador++){
        valor = teclado.nextFloat(); 
        if(valor > 0){
            media = media + valor;
            numPositivos++;

        }
    }

    System.out.println(numPositivos + " valores positivos");
    System.out.printf("%.1f\n", (media / numPositivos));

    teclado.close();

    }
}