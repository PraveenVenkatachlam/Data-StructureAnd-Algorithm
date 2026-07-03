//! 40 Combination Sum II
//? TC->O(2ⁿ × n)
//? SC->O(n)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
         Arrays.sort(candidates);
        backtrack(candidates,target,res,0,new ArrayList<>());
        return res;
    }

    private void backtrack(int[] candidates, int target, List<List<Integer>> res, int pos, List<Integer> temp) {
        if (target < 0)
            return;
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = pos; i < candidates.length; i++) {
             if (i > pos && candidates[i] == candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) {
               break;
            }
             temp.add(candidates[i]);
                // System.out.println("Add Elements");
                backtrack(candidates, target - candidates[i], res, i+1,temp);
                temp.remove(temp.size()-1);

        }
    }
}