package hw.algoritms;

// Ограничения:
// - Необходимо вывести числа, которые встречаются только в одном из двух массивов.
// - Повторы внутри массива не должны влиять на результат (важен факт наличия элемента).
// - Результат может быть в любом порядке.
//
// Примеры:
//
// input:
// arr1 = [1, 2, 3, 4]
// arr2 = [3, 4, 5, 6]
// output:
// [1, 2, 5, 6]
//
// input:
// arr1 = [1, 1, 2]
// arr2 = [2, 3, 3]
// output:
// [1, 3]
//
// input:
// arr1 = [7, 8]
// arr2 = [7, 8]
// output:
// []

import java.util.*;

public class SymmetricDifferenceArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {3, 4, 5, 6};

    int[] arr3 = {1, 1, 2};
    int[] arr4 = {2, 3, 3};

    int[] arr5 = {7, 8};
    int[] arr6 = {7, 8};

    System.out.println(findOnlyInOne(arr1, arr2));
    System.out.println(findOnlyInOne(arr3, arr4));
    System.out.println(findOnlyInOne(arr5, arr6));
  }

  public static List<Integer> findOnlyInOne(int[] arr1, int[] arr2) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> result;

    for (Integer i : arr1) {
      set.add(i);
    }
    for (Integer i : arr2) {
      set2.add(i);
    }

    result = new HashSet<>(set);
    result.removeAll(set2);
    set2.removeAll(set);
    result.addAll(set2);

    return new ArrayList<>(result);
  }
}

