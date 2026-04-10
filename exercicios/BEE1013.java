import java.util.Scanner;

public class BEE1013{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    int a, b, c, maiorParcial, maiorFinal; 

    a = teclado.nextInt();
    b = teclado.nextInt();
    c = teclado.nextInt();

    maiorParcial = (a + b + Math.abs(a - b)) / 2;
    maiorFinal = (maiorParcial + c + Math.abs(maiorParcial - c)) / 2;

    System.out.println(maiorFinal + " eh o maior");
    
    teclado.close();

    }
}