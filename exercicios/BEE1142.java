import java.util.Scanner;

public class BEE1142{
    public static void main(String args[]){
    
    Scanner teclado = new Scanner(System.in);

    int linhas, num;

 
    linhas = teclado.nextInt(); 
    num = 1; 

    for(int contador = 1; contador <= linhas; contador ++){
        System.out.println(num + " " + (num + 1) + " " + (num + 2) + " PUM");
        num += 4;
    }

    teclado.close();

    }
}