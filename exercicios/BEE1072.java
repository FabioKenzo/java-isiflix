import java.util.Scanner;

public class BEE1072{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt(); 
    int  x,dentro, fora;
    dentro = 0; 
    fora = 0;

    for(int contador = 0; contador < n; contador++){
        x = teclado.nextInt();
        if(x >= 10 && x <=20){
            dentro++;
        }
        else{
            fora++;
        }
    }

    System.out.println(dentro + " in"); 
    System.out.println(fora + " out");

    teclado.close();

    }
}