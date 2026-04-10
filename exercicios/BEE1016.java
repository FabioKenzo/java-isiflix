import java.util.Scanner;

public class BEE1016{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    int kms, tempo; 

    kms = teclado.nextInt();
    tempo = kms * 2;
    System.out.println(tempo + " minutos");

    teclado.close();

    }
}