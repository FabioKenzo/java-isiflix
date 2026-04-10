import java.util.Scanner;

public class TesteStatus{
    public static void main(String args[]){

    Scanner teclado = new Scanner(System.in); 

    System.out.println("Digite o status do pedido"); 
    String status; 
    status = teclado.nextLine(); 

    switch(status){
        case "N":
        case "n":
        case "NOVO": 
            System.out.println("Status do pedido 12345: NOVO");
            break;

        case "S":
        case "s":
        case "SEPARA":
            System.out.println("Status do pedido 12345: EM SEPARAÇÃO"); 
            break; 

        case "F": 
        case "f": 
        case "Finalizado": 
            System.out.println("Status do pedido 12345: FINALIZADO"); 
            break;
    }

    teclado.close();

    }
}