package hw.algoritms;

// Ограничения:
// - Необходимо найти первый символ, который встречается в строке только один раз.
// - Регистр символов имеет значение (A ≠ a).
// - Если уникального символа нет — вернуть null.
//
// Примеры:
//
// input:
// "programming"
// output:
// 'p'
//
// input:
// "aabbcc"
// output:
// null
//
// input:
// "swiss"
// output:
// 'w'

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstUniqueCharacter {

  public static void main(String[] args) {
    String input1 = "programming";
    String input2 = "aabbcc";
    String input3 = "swiss";

    System.out.println(findFirstUnique(input1));
    System.out.println(findFirstUnique(input2));
    System.out.println(findFirstUnique(input3));
  }

  public static Character findFirstUnique(String text) {
    Map<Character, Integer> map = new HashMap<>();
    char[] charArray = text.toCharArray();
    for (Character c : charArray) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }


    return map.entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
  }
}

