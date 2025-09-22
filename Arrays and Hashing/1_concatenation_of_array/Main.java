public class Main {
  public static int[] getConcatenation(int[] nums) {
    int numsLength = nums.length;
    int[] ans = new int[2 * numsLength];

    for (int i=0; i<numsLength; i++) {
        ans[i] = nums[i];
        ans[i + numsLength] = nums[i];
    }

    return ans;
  }

  public static void printArray(int[] ary) {
    for (int i=0; i<ary.length; i++) {
      System.out.print(ary[i] + " ");
    }

    System.out.println();
  }

  public static void main(String args[]) {
    printArray(getConcatenation(new int[]{1, 4, 1, 2})); // [1,4,1,2,1,4,1,2]
    printArray(getConcatenation(new int[]{22, 21, 20, 1})); // [22,21,20,1,22,21,20,1]
  }
}
