import java.util.Scanner;

public class BEE1045{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    double A, B, C, aux;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();

    if (A < B){
        aux = A; 
        A = B; 
        B = aux;
    }
    if(B < C){
        aux = B; 
        B = C; 
        C = aux;
    }
    if(A < B){
        aux = A; 
        A = B; 
        B = aux;
    }

    if(A >=B + C){
        System.out.println("NAO FORMA TRIANGULO");
    }
    else{
        if(A * A == (B * B) + (C * C)){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(A * A > (B* B) + (C * C)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(A * A < (B *B) + (C * C)){
            System.out.println("TRIANGULO ACUTANGULO");

        }

    }

    if(A == B && B == C){
        System.out.println("TRIANGULO EQUILATERO");
    }
    else if(A == B || B == C || A == C){
        System.out.println("TRIANGULO ISOSCELES");
    }

    teclado.close();

    }
}