package sumRelated;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheTargetSum {

    public static void main(String[] args) {
        int[] nums={2,3,4};
        int target=6;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result= new int[2];
        if(nums==null){
            return result;
        }

        if(nums.length<2){
            return result;
        }

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                result[0] = map.get(temp); //as the stored number must be of smaller index
                result[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }



        return result;

    }
}
