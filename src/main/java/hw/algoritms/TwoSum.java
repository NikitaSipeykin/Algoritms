package hw.algoritms;

// Ограничения:
// - Необходимо найти индексы двух элементов массива, сумма которых равна target.
// - Гарантируется, что решение существует и оно единственное.
// - Один элемент нельзя использовать дважды.
//
// Примеры:
//
// input:
// nums = [2, 7, 11, 15], target = 9
// output:
// [0, 1]
//
// input:
// nums = [3, 2, 4], target = 6
// output:
// [1, 2]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr1 = {2, 7, 11, 15};
    int[] arr2 = {3, 2, 4};
    int target1 = 9;
    int target2 = 6;

    System.out.println(Arrays.toString(twoSum(arr1, target1)));
    System.out.println(Arrays.toString(twoSum(arr2, target2)));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int number = target - nums[i];
      if (map.containsKey(number)) {
        return new int[]{map.get(number), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}

