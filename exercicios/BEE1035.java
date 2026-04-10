/*
A seguir,
(1) se B for maior do que C  e
(2) se D for maior do que A, e
(3) a soma de C com D for maior que a soma de A e B e
(4) se C e D, ambos, forem positivos e
(5) se a variável A for par
*/

import java.util.Scanner;

public class BEE1035{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);
    
    int a, b, c, d; 

    //entrada 
    a = teclado.nextInt();
    b = teclado.nextInt();
    c = teclado.nextInt();
    d = teclado.nextInt();

    if(b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0){
        System.out.println("Valores aceitos");
    }
    else{
        System.out.println("Valores nao aceitos");
    }
    
    
    teclado.close(); 


    }
}