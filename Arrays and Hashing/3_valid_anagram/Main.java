import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

class Main {
  // Using HashMap
  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();

    for(int i=0; i<str1.length(); i++) {
      map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
      map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
    }

    return map1.equals(map2);
  }

  // Using frequency array
  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) return false;

    int[] frequencyArray = new int[26];
    Arrays.fill(frequencyArray, 0);

    for(int i=0; i<str1.length(); i++) {
      frequencyArray[(int)(str1.charAt(i) - 'a')]++;
      frequencyArray[(int)(str2.charAt(i) - 'a')]--;
    }

    for(int i=0; i<26; i++) {
      if(frequencyArray[i] != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    String str1 = scn.nextLine();
    String str2 = scn.nextLine();

    System.out.println(isAnagram(str1, str2));
  }
}
