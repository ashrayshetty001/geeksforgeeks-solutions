class Solution {
    public void reverseArray(int arr[]) {
        // code here
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
    }
}
