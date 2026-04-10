import java.util.Scanner;

public class BEE1046{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int horaInicial, horaFinal, duracao; 

    horaInicial = teclado.nextInt();
    horaFinal = teclado.nextInt();

    duracao = horaFinal - horaInicial; 

    if(duracao <= 0){
        duracao = duracao + 24;
    }
    
    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    teclado.close();

    }
}