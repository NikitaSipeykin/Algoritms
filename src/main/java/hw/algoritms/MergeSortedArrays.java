package hw.algoritms;

// Ограничения:
// - Даны два отсортированных массива.
// - Необходимо объединить их в один отсортированный массив.
// - Результат должен сохранять порядок возрастания.
// - Использовать дополнительный массив для результата допустимо.
//
// Примеры:
//
// input:
// arr1 = [1, 3, 5]
// arr2 = [2, 4, 6]
// output:
// [1, 2, 3, 4, 5, 6]
//
// input:
// arr1 = [1, 2, 2]
// arr2 = [2, 3, 4]
// output:
// [1, 2, 2, 2, 3, 4]
//
// input:
// arr1 = [5, 10, 15]
// arr2 = [1, 2, 20]
// output:
// [1, 2, 5, 10, 15, 20]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 5};
    int[] arr2 = {2, 4, 6};

    int[] arr3 = {1, 2, 2};
    int[] arr4 = {2, 3, 4};

    int[] arr5 = {5, 10, 15};
    int[] arr6 = {1, 2, 20};

    System.out.println(Arrays.toString(merge(arr1, arr2)));
    System.out.println(Arrays.toString(merge(arr3, arr4)));
    System.out.println(Arrays.toString(merge(arr5, arr6)));
  }

  public static int[] merge(int[] arr1, int[] arr2) {
    int pointer = 0;
    int first = 0;
    int second = 0;
    int[] result = new int[arr1.length + arr2.length];

    while (first < arr1.length && second < arr2.length){
      if (arr1[first] <= arr2[second]){
        result[pointer] = arr1[first];
        first++;
      } else {
        result[pointer] = arr2[second];
        second++;
      }

      pointer++;
    }

    while (first < arr1.length){
      result[pointer] = arr1[first];
      first++;
      pointer++;
    }

    while (second < arr2.length){
      result[pointer] = arr2[second];
      second++;
      pointer++;
    }

    return result;
  }
}

