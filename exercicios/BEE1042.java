import java.util.Scanner;

public class BEE1042{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n1, n2, n3, aux, a, b, c; 

    n1 = teclado.nextInt();
    n2 = teclado.nextInt();
    n3 = teclado.nextInt();

    a = n1;
    b = n2; 
    c = n3;

    if(n1 > n2){
        aux = n1; 
        n1 = n2;
        n2 = aux;
    }
    if(n2 > n3){
        aux = n2; 
        n2 = n3; 
        n3 = aux;
    }
    if(n1 > n2){
         aux = n1; 
        n1 = n2;
        n2 = aux;
    }
    
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(""); 

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    teclado.close();

    }
}