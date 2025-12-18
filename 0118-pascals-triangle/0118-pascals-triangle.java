class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> tempRow = new ArrayList<>();
            tempRow.add(1); // first element

            for (int j = 1; j < i; j++) {
                int val = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
                tempRow.add(val);
            }

            tempRow.add(1); // last element
            ans.add(tempRow);
        }

        return ans;
    }
}
