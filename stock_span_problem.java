class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> span=new ArrayList<>();
        span.add(1);
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int currPrice=arr[i];
            while(!s.isEmpty() && currPrice>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span.add(i+1);
            }else{
                span.add(i-s.peek());
            }
            s.push(i);
        }
        return span;
    }
}
