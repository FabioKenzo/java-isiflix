import java.util.Scanner;

public class BEE1020{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n, anos, restoAnos, meses, dias; 

    n = teclado.nextInt();

    anos = n / 365;
    n = n % 365;

    meses = n / 30;
    dias = n % 30; 

    System.out.println(anos + " anos(s)");
    System.out.println(meses + " mes(es)");
    System.out.println(dias + " dia(s)");

    teclado.close();

    }
}