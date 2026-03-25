import java.util.Arraylist;
import java.util.Collections;


public class BucketSort {
    static void bucketSort(float[] arr){
        int n = arr.length;
        ///Buckets
        ArrayList<float>[] buckets = new ArrayList[n];
        // Create empty buckets 
        for(int i = 0; i<n ; i++ ){
            buckets[i] = new ArrayList<float>();
        }
        // Add elements into our buckets
        for(int i = 0; i< n ;i ++){
            int bucketIndex = ( int ) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);

        }
        // sort each bucket individually 
        for(int i=0; i< Bucket.length ; i++){
            collections.sort(bucket[i]);
        
        }
        // merge all buckets to get final sorted array 
        int index = 0;
        for(int i=0 ; i< buckets.length ; i++){
            ArrayList<float> currBucket = buckets[i];
            for(int j = 0; j< currBucket.size(); j++){
                arr[index++] = currBucket.get(j);
            
            }
        }
    }
    public static void main(string[] args ){
        float[] arr = {0.5f ,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for(float val : arr){
            System.out.print(val + " " );
            
        }
    }

}
    
