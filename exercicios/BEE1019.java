import java.util.Scanner;

public class BEE1019{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n, horas, minutos, segundos; 

    n = teclado.nextInt();
    
    horas = n / 3600;
    n = n % 3600; 

    minutos = n / 60; 
    segundos = n % 60; 

    System.out.println(horas + ":" + minutos + ":" + segundos);

    teclado.close();

    }
}