import java.util.Scanner;

public class BEE1012{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
       
        double A, B, C, areaTriangulo, areaCirculo, pi, areaTrapezio, areaQuadrado, areaRetangulo;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        areaTriangulo = (A * C) / 2;
        pi = 3.14159;
        areaCirculo = pi * C * C; 
        areaTrapezio = (A + B) * C / 2;
        areaQuadrado =  B * B; 
        areaRetangulo = A * B; 

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio); 
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado); 
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo); 

        teclado.close();

    }
}