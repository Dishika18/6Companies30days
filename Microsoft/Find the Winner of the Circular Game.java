class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> circle = new ArrayList<>();
        for(int i = 1; i <= n; ++i){
            circle.add(i);
        }
        int curInd = 0;

        while(circle.size()>1){
            int next_to_remove = (curInd + k - 1) % circle.size();
            circle.remove(next_to_remove);
            curInd = next_to_remove;
        }
        return circle.get(0);
    }
}