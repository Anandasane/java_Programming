import java.util.*;
/*
You are given three integers
p,q. and r.
Your task is to perform operations to make all three numbers equal. In one operaticn
you can:
Add 1 to any two of the numbers.
Subtract 1 from the third number.
You need to determine and print the minimum number of required to
make
p. q,and r equaL
If it is not possible to make all three numbers equal. print -1.
*/

public class Nqt1 {
    public static int minOperations(int p , int q , int r) {
                    if(p==q && q==r) return 0; // Already equal
                    List<Integer> arr = new ArrayList<>(Arrays.asList(p,q,r));
                    Collections.sort(arr);
                    int steps = 0;
                    while(true){
                        arr.set(0, arr.get(0)+1);
                        arr.set(1, arr.get(1)+1);
                        arr.set(2, arr.get(2)-1);
                        steps++;
                        if(arr.get(0)==arr.get(1) && arr.get(1)==arr.get(2)) return steps;
                        Collections.sort(arr);
                        if((arr.get(0).equals(arr.get(1)) && arr.get(1)  + 1 == arr.get(2)) 
                        || (arr.get(1).equals(arr.get(2)) && arr.get(0) + 1 == arr.get(1)))
                        return -1;
                }

                }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            int ans = minOperations(p, q, r);
            System.out.println(ans + " ");

        }
        sc.close();
    }

}
