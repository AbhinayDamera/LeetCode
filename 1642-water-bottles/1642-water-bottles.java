class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int exchanged=numBottles/numExchange;
            int leftover=numBottles%numExchange;
            total+=exchanged;
            numBottles = exchanged + leftover;         // update current bottles

        }
        return total;
    }
}