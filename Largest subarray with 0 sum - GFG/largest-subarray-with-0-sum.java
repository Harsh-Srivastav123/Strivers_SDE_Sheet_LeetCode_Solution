//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // // Your code here
        // HashMap<Long,Integer> hashMap=new HashMap<>();
        // long sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // if(sum==0)
        // {
        //     return arr.length;
        // }
        // else{
        //     sum=0;
        // }
      
        // int maxLength=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //     if(hashMap.containsKey(sum)){
        //         maxLength=Math.max(maxLength,i-hashMap.get(sum));
        //     }
        //     else {
        //         hashMap.put(sum,i );
        //     }
        // }
        // return maxLength;
        
          // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result
 
        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];
 
            if (sum == 0)
                max_len = i + 1;
 
            // Look this sum in hash table
            Integer prev_i = hM.get(sum);
 
            // If this sum is seen before, then update
            // max_len if required
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else // Else put this sum in hash table
                hM.put(sum, i);
        }
 
        return max_len;
    }
}