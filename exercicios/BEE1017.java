import java.util.Scanner;

public class BEE1017{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    int tempo, velocidadeMedia; 
    double distancia, litros;

    tempo = teclado.nextInt();
    velocidadeMedia = teclado.nextInt();

    distancia = tempo * velocidadeMedia; 
    litros = distancia / 12 ;

    System.out.printf("%.3f\n", litros);
    
    teclado.close();

    }
}