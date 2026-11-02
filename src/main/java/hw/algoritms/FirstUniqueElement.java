package hw.algoritms;

// Ограничения:
// - Необходимо найти первый элемент, который встречается только один раз.
// - Порядок элементов должен сохраняться.
// - Если уникальный элемент отсутствует — вернуть null.
//
// Примеры:
//
// input:
// [4, 5, 1, 2, 0, 4, 1, 2]
// output:
// 5
//
// input:
// [7, 7, 3, 3, 9]
// output:
// 9
//
// input:
// [1, 1, 2, 2, 3, 3]
// output:
// null

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueElement {

  public static void main(String[] args) {
    List<Integer> input1 = List.of(4, 5, 1, 2, 0, 4, 1, 2);
    List<Integer> input2 = List.of(7, 7, 3, 3, 9);
    List<Integer> input3 = List.of(1, 1, 2, 2, 3, 3);

    System.out.println(findFirstUnique(input1));
    System.out.println(findFirstUnique(input2));
    System.out.println(findFirstUnique(input3));
  }

  public static Integer findFirstUnique(List<Integer> numbers) {
    Map<Integer, Integer> map = new HashMap<>();

    for (Integer number : numbers) {
      map.put(number, map.getOrDefault(number, 0) + 1);
    }

    return map.entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
  }
}

