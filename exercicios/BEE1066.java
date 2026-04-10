import java.util.Scanner;

public class BEE1066{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int num,pares, impares, positivos, negativos;
    pares = 0; 
    impares = 0;
    positivos = 0;
    negativos = 0;

    for(int contador = 0; contador < 5; contador++){
        num = teclado.nextInt();

        if(num % 2 == 0){
            pares++;
        }
        if(num % 2 != 0){
            impares++;
        }
        if(num > 0){
            positivos++;
        }
        if(num < 0){
            negativos++;
        }
    }

    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");

    teclado.close();
    }
}