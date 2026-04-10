import java.util.Scanner;

public class BEE1172{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int[] nums = new int[10];
        int valoresPermitidos = 1;
        int i = 0;

        for(i = 0; i < nums.length; i++){
            nums[i] = teclado.nextInt(); 

            if(nums[i] < 0 || nums[i] == 0){
                nums[i] = valoresPermitidos;
            }
        }

        for(i = 0; i < nums.length; i++){
            System.out.println("X[" + i + "] = " + nums[i]);
        }

        teclado.close();

    }
}