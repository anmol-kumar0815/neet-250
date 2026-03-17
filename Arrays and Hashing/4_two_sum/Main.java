import java.utils.HashMap;

class Main {
  // Brute force O(n^2)
  public static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];

    for(int i=0; i<nums.length-1; i++) {
      for (int j=i+1; j<nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          ans[0] = i;
          ans[1] = j;

          return ans;
        }
      }
    }

    return ans;
  }

  // with HashMap O(n)
  public static int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i<nums.length; i++){
      int required = target - nums[i];

      if(map.containsKey(required)){
        int j = map.get(required);
        ans[0] = Math.min(i, j);
        ans[1] = Math.max(i, j);

        return ans;
      }

      map.put(nums[i], i);
    }

    return ans;
  }

  public static void main(String args[]) {
    int[] ans;

    ans = twoSum([2,7,11,15], 9);
    // ans = twoSum([3,2,4], 6);
    // ans = twoSum([3,3], 6);

    System.out.println(ans[0], ans[1]);
  }
}
