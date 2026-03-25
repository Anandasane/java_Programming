import java.util.*;


public class Square_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        for(int i =0; i<rows;i++){ //  Nos of lines
            for(int j =0 ; j<cols;j++){ // Nos of columns
                    System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}