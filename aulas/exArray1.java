import java.util.Scanner;

public class exArray1{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 

        String[] frutas = new String[4];

        for(int posicao = 0; posicao < 4; posicao++){
            System.out.println("Digite a fruta " + (posicao + 1) + ": ");
            frutas[posicao] = teclado.next();

        }
        System.out.println("A fruta na terceira posicao é: " + frutas[2]);


        teclado.close();

    }
}