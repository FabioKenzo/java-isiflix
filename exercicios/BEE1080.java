import java.util.Scanner;

public class BEE1080{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in); 

    int maior, posicao; 
    maior = 0;
    posicao = 0;
    
    for(int contador = 0; contador < 100; contador++){
        int valores = teclado.nextInt();

        if(valores > maior){
            maior = valores;
            posicao = contador + 1;
        } 
    }

    System.out.println(maior); 
    System.out.println(posicao);

    teclado.close(); 

    }
}