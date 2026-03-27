import java.util.*;

class Solution {

    int n;
    List<List<Integer>> result = new ArrayList<>();

    void backtrack(List<Integer> temp, HashMap<Integer, Integer> mp){

        if(temp.size() == n){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(Integer num : mp.keySet()){

            int count = mp.get(num);

            if(count == 0)
                continue;

            // do something
            temp.add(num);
            mp.put(num, count - 1);

            // explore
            backtrack(temp, mp);

            // undo
            temp.remove(temp.size()-1);
            mp.put(num, count);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        n = nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        // count frequency
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0) + 1);
        }

        List<Integer> temp = new ArrayList<>();

        backtrack(temp, mp);

        return result;
    }
}