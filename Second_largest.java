class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int second=-1,maxnum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxnum){
                second=maxnum;
                maxnum=arr[i];
            }
            if(arr[i]>second && arr[i]<maxnum){
                second=arr[i];
            }
        }
        return second;
    }
}
