import java.util.Scanner;

public class BEE1079{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in); 

    int n = teclado.nextInt();
    double media; 
    media = 0; 

    for(int contador = 0; contador < n; contador ++){
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();

        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
        System.out.printf("%.1f\n", media);
    }
    
    teclado.close();
    }
}