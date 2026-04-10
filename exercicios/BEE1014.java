import java.util.Scanner;

public class BEE1014{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    double consumo, distanciaTotal, combustivelGasto; 

    distanciaTotal = teclado.nextDouble();
    combustivelGasto = teclado.nextDouble();

    consumo = distanciaTotal / combustivelGasto;
    System.out.printf("%.3f km/l\n", consumo);
    
    teclado.close();    

    }
}