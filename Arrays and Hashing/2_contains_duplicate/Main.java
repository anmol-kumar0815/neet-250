import java.util.HashSet;

public class Main {
  // O(n^2) approach
  public static boolean containsDuplicate(int[] nums) {
    for (int i=0; i<nums.length-1; i++) {
      for (int j=i+1; j<nums.length; j++) {
        if (nums[i] == nums[j]) {
          return true;
        }
      }
    }

    return false;
  }

  // O(n): using HashSet.
  // HashSet.add(value) => O(1) | HashSet.contains(value) => O(1) time complexity.
  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> hash = new HashSet<>();

    for (int i=0; i<nums.length; i++) {
      if(hash.contains(nums[i])) return true;

      hash.add(nums[i]);
    }

    return false;
  }

  public static void main(String args[]) {
    System.out.println(containsDuplicate([1,2,3,4,5,6,1]));
  }
}
