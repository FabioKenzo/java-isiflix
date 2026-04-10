import java.util.Scanner;

public class BEE1131{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

       int novaInfo, interVence, gremioVence, empates, totalGrenais; 
       novaInfo = 1;
       interVence = 0;
       gremioVence = 0;
       empates = 0;
       totalGrenais = 0;

       do{
            int golsInter = teclado.nextInt(); 
            int golsGremio = teclado.nextInt(); 

            if(golsInter > golsGremio){
                interVence++;
                totalGrenais++;
            }
            else if(golsGremio > golsInter){
                gremioVence++;
                totalGrenais++;
            }
            else{
                empates++;
                totalGrenais++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)"); 
            novaInfo = teclado.nextInt(); 
       }
       while(novaInfo != 2);
       System.out.println(totalGrenais + " grenais"); 
       System.out.println("Inter:" + interVence); 
       System.out.println("Gremio:" + gremioVence); 
       System.out.println("Empates:" + empates);

       if(interVence > gremioVence){
        System.out.println("Inter venceu mais");
       }
       else if(gremioVence > interVence){
        System.out.println("Gremio venceu mais");
       }
       else{
        System.out.println("Nao houve vencedor");
       }

        teclado.close();
    }
}