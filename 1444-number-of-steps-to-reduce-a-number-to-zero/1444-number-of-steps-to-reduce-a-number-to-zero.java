class Solution {
    public int numberOfSteps(int num) {
        int Steps=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
                Steps++;
            }
            else{
                num=num-1;
                Steps++;
            }
        }
        return Steps;
    }
}