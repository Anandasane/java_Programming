import java.util.Scanner;



public class mirror_pyramids {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the mirror pyramid: ");
        int rows = sc.nextInt();


        // logic for inverted pyramid
            for(int i = rows; i>=1 ; i--){
                // print the number of spaces
                for(int j = 1; j<= rows - i; j++){
                    System.out.print(" ");
                }
                // print the stars
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // logic for pyramid
           for(int i = 2 ; i<= rows; i++){
            // print the spaces
            for(int j = 1 ; j<= rows-i; j++){
                System.out.print(" ");

            }
            // print the stars
            for(int k =1 ; k<=(2*i-1);k++){
                
                System.out.print("*");

            }
            System.out.println();

           }

        

    }
    
}
