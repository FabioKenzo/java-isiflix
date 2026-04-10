import java.util.Scanner;

public class BEE1134{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        
        
        do{
            opcao = teclado.nextInt();

            switch(opcao){
                case 1:
                    alcool++;
                    break; 

                case 2:
                    gasolina++;
                    break;

                case 3: 
                    diesel++;
                    break;
                    
                case 4: 
                    break;
            }

        }
        while(opcao != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool); 
        System.out.println("Gasolina: " + gasolina); 
        System.out.println("Diesel: " + diesel);
        
        teclado.close();
    }
}