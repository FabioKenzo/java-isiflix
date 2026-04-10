import java.util.Scanner;


public class BEE1009{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo, totalVendas, totalReceber; 

        nomeVendedor = teclado.nextLine();
        salarioFixo = teclado.nextDouble();
        totalVendas = teclado.nextDouble();

        totalReceber = salarioFixo + totalVendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f\n", totalReceber);

        teclado.close();

    }
}