import java.util.Scanner;

public class BEE1047{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int horaInicial, minutoInicial, horaFinal, minutoFinal, inicioMinutos, fimMinutos, duracaoMinutos; 

    horaInicial = teclado.nextInt();
    minutoInicial = teclado.nextInt();
    horaFinal = teclado.nextInt();
    minutoFinal = teclado.nextInt();

    inicioMinutos = (horaInicial * 60) + minutoInicial; 
    fimMinutos = (horaFinal * 60) + minutoFinal; 
    duracaoMinutos = fimMinutos - inicioMinutos; 

    if(duracaoMinutos <= 0 ){
        duracaoMinutos = duracaoMinutos + (24 * 60);
    }

    horaFinal = duracaoMinutos / 60; 
    minutoFinal = duracaoMinutos % 60; 

    System.out.println("O JOGO DUROU " + horaFinal + " HORA(S) E " + minutoFinal + " MINUTO(S)");

    teclado.close();

    }
}