import java.util.ArrayList;
import java.util.Arrays;

class prog {
  static ArrayList<ArrayList<Integer>> solution(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    ArrayList<Integer> n1 = new ArrayList<>();
    ArrayList<Integer> n2 = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < nums1.length || j < nums2.length) {
      while (j+1 < nums2.length && nums2[j] == nums2[j + 1]) {
        j++;
      }
      while (i+1 < nums1.length && nums1[i] == nums1[i + 1]) {
        i++;
      }
      if (i < nums1.length && j < nums2.length) {
        if (nums1[i] < nums2[j]) {
          n1.add(nums1[i]);
          i++;
        } else if (nums1[i] > nums2[j]) {
          n2.add(nums2[j]);
          j++;
        } else {
          i++;
          j++;
        }
      } else if (i >= nums1.length) {
        n2.add(nums2[j]);
        j++;
      } else if (j >= nums2.length) {
        n1.add(nums1[i]);
        i++;
      }
    }
    ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
    answer.add(n1);
    answer.add(n2);
    return answer;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3 };
    int[] nums2 = { 2, 4, 6 };
    // int[] nums1 = {1,2,3,3};
    // int[] nums2 = {1,1,2,2};
    System.out.println(solution(nums1, nums2));
  }
}