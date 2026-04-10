import java.util.Scanner;

public class BEE1021{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n, nota100, nota50, nota20, nota10, nota5, nota2, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001; 
    double entrada;

    entrada = teclado.nextDouble();
    n = (int) (entrada * 100 + 0.5);

    nota100 = n / 10000; 
    n = n % 10000; 

    nota50 = n / 5000; 
    n = n % 5000; 

    nota20 = n / 2000; 
    n = n % 2000; 

    nota10 = n / 1000; 
    n = n % 1000; 

    nota5 = n / 500; 
    n = n % 500; 

    nota2 = n / 200; 
    n = n % 200; 
 
    moeda1 = n / 100; 
    n = n % 100; 

    moeda050 = n / 50; 
    n = n % 50; 

    moeda025 = n / 25; 
    n = n % 25; 

    moeda010 = n / 10; 
    n = n % 10; 

    moeda005 = n / 5; 
    n = n % 5; 

    moeda001 = n; 

    System.out.println("NOTAS:");
    System.out.println(nota100 + " nota(s) de R$ 100.00");
    System.out.println(nota50 + " nota(s) de R$ 50.00");
    System.out.println(nota20 + " nota(s) de R$ 20.00");
    System.out.println(nota10 + " nota(s) de R$ 10.00");
    System.out.println(nota5 + " nota(s) de R$ 5.00");
    System.out.println(nota2 + " nota(s) de R$ 2.00");
    System.out.println("MOEDAS:");
    System.out.println(moeda1 + " moeda(s) de R$ 1.00");
    System.out.println(moeda050 + " moeda(s) de R$ 0.50");
    System.out.println(moeda025 + " moeda(s) de R$ 0.25");
    System.out.println(moeda010 + " moeda(s) de R$ 0.10");
    System.out.println(moeda005 + " moeda(s) de R$ 0.05");
    System.out.println(moeda001 + " moeda(s) de R$ 0.01");

    teclado.close();

    }
}