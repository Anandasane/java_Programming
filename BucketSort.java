import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    static void bucketSort(float[] arr){
        int n = arr.length;
        ///Buckets
        List<List<Float>> buckets = new ArrayList<>(n);
        // Create empty buckets 
        for(int i = 0; i < n; i++){
            buckets.add(new ArrayList<Float>());
        }
        // Add elements into our buckets
        for(int i = 0; i< n ;i ++){
            int bucketIndex = (int) (arr[i] * n);
            buckets.get(bucketIndex).add(arr[i]);
        }
        // sort each bucket individually 
        for(int i=0; i< buckets.size() ; i++){
            Collections.sort(buckets.get(i));
        }
        // merge all buckets to get final sorted array 
        int index = 0;
        for(int i=0 ; i< buckets.size() ; i++){
            List<Float> currBucket = buckets.get(i);
            for(float val : currBucket){
                arr[index++] = val;
            }
        }
    }
    public static void main(String[] args){
        float[] arr = {0.5f ,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
}
