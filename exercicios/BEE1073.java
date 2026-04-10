import java.util.Scanner;

public class BEE1073{
    public static void main(String args[]){
        
    Scanner teclado = new Scanner(System.in);

    int limite; 
    
    limite = teclado.nextInt();

    for(int contador = 2; contador <= limite; contador += 2){
        System.out.println(contador + "^2 = " + (contador * contador));
    }

    teclado.close();

    }
}