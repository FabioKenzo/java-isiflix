import java.util.Scanner;

public class BEE1113{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int x, y, maior, menor;
        x = 0; 
        y = 0;

        x = teclado.nextInt();
        y = teclado.nextInt();


        while(x != y){
            
            if(x < y){
                System.out.println("Crescente");
            }else if(x > y){
                System.out.println("Decrescente");
            }
            else if(x == y || y == x){
                break;
            }
            x = teclado.nextInt();
            y = teclado.nextInt();
        }


        teclado.close();
    }
}