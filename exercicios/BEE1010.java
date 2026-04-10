import java.util.Scanner;

public class BEE1010{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int codigoPeca1, quantidade1, codigoPeca2, quantidade2;
        double valorUnit1,valorUnit2, valorTot; 

        codigoPeca1 = teclado.nextInt();
        quantidade1 = teclado.nextInt();
        valorUnit1 = teclado.nextDouble(); 

        codigoPeca2 = teclado.nextInt();
        quantidade2 = teclado.nextInt();
        valorUnit2 = teclado.nextDouble();

        valorTot = quantidade1 * valorUnit1 + quantidade2 * valorUnit2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTot);

        teclado.close();


    }
}