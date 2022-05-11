
//link : https://leetcode.com/problems/next-permutation/https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] arr) {
        int k=-1,j=0;
        int n =arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                k=i;
                break;
            }
        }
        if(k==-1){
            reverse(arr,0,n-1);
        }
        else{
        for(int i=n-1;i>k;i--){
            if(arr[i]>arr[k]){
                swap(arr,i,k);
                
                break;
            }
            
        }
        
        j=n-1;
        reverse(arr,k+1,j);
        
        }
          
    }
    public void swap(int []arr,int l,int m){
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
    public void reverse(int []arr,int k,int j){
        while(k<j){
            swap(arr,k,j);
            k++;
            j--;
        }
    }
}
