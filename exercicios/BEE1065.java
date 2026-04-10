import java.util.Scanner;

public class BEE1065{
    public static void main(String args[]){

    int num,pares;
    pares = 0;

    Scanner teclado = new Scanner(System.in);

    for(int contador = 0; contador < 5; contador++){
        num = teclado.nextInt(); 

        if(num % 2 == 0){
            pares++;
        }
    }
    System.out.println(pares + " valores pares");

    teclado.close();
    }
}