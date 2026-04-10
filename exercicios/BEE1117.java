import java.util.Scanner;

public class BEE1117{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in); 
        double n1, n2, notaValida1, notaValida2, media; 
        notaValida1 = 0;
        notaValida2 = 0;

        do{
            n1 = teclado.nextDouble(); 
            if(n1 < 0.0 || n1 > 10.0){
                System.out.println("nota invalida");
            }
            else{
                notaValida1 = n1;
            }
        }
        while(n1 < 0.0 || n1 > 10.0);


        do{
            n2 = teclado.nextDouble(); 
            if(n2 < 0.0 || n2 > 10.0){
                System.out.println("nota invalida");
            }
            else{
                notaValida2 = n2;
            }
        }
        while(n2 < 0.0 || n2 > 10.0); 

        media = (notaValida1 + notaValida2) / 2; 
        System.out.printf("media = %.2f\n", media);

        teclado.close();

    }
}