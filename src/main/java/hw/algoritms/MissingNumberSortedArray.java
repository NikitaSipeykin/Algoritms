package hw.algoritms;

// Ограничения:
// - Дан отсортированный массив целых неотрицательных чисел.
// - В массиве допускаются дубликаты.
// - Необходимо найти минимальное пропущенное число в последовательности.
// - Возвращаемое значение — первое "разрывное" число.
//
// Примеры:
//
// input:
// [0, 1, 2, 4, 5]
// output:
// 3
//
// input:
// [1, 2, 3, 4]
// output:
// 0
//
// input:
// [0, 0, 1, 1, 2, 2, 4]
// output:
// 3

public class MissingNumberSortedArray {

  public static void main(String[] args) {
    int[] arr1 = {0, 1, 2, 4, 5};
    int[] arr2 = {1, 2, 3, 4};
    int[] arr3 = {0, 0, 1, 1, 2, 3, 5};

    System.out.println(findMissing(arr1));
    System.out.println(findMissing(arr2));
    System.out.println(findMissing(arr3));
  }

  public static int findMissing(int[] arr) {
    int expected = 0;

    for (int number : arr) {
      if (number < expected) continue;
      if (number > expected) return expected;

      expected++;
    }

    return expected;
  }
}

