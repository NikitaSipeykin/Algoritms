package hw.algoritms;

// Ограничения:
// - Необходимо найти все начальные индексы подстрок в text, которые являются анаграммами слова word.
// - Анаграмма — это перестановка символов слова.
// - Подстрока должна иметь длину, равную длине word.
// - Результат возвращается как список индексов.
//
// Примеры:
//
// input:
// text = "cbaebabacd", word = "abc"
// output:
// [0, 6]
//
// input:
// text = "abab", word = "ab"
// output:
// [0, 1, 2]
//
// input:
// text = "afdgzyxksldfm", word = "xyz"
// output:
// [4]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramIndicesFinder {

  public static void main(String[] args) {
    String text1 = "cbaebabacd";
    String word1 = "abc";
    String text2 = "abab";
    String word2 = "ab";
    String text3 = "afdgzyxksldfm";
    String word3 = "xyz";

    System.out.println(findAnagrams(text1, word1).toString());
    System.out.println(findAnagrams(text2, word2).toString());
    System.out.println(findAnagrams(text3, word3).toString());
  }

  public static List<Integer> findAnagrams(String text, String word) {
    List<Integer> result = new ArrayList<>();
    Map<Character, Integer> map = new HashMap<>();

    for (Character c : word.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    int left = 0;
    int right = 0;
    int requiredWindow = word.length();

    while (right < text.length()){
      char current = text.charAt(right);

      if (map.containsKey(current)){
        if (map.get(current) > 0){
          requiredWindow--;
        }
        map.put(current, map.get(current) - 1);
      }

      right++;

      if (right - left == word.length()){
        if (requiredWindow == 0){
          result.add(left);
        }

        char leftChar = text.charAt(left);

        if (map.containsKey(leftChar)){
          map.put(leftChar, map.get(leftChar) + 1);

          if (map.get(leftChar) > 0){
            requiredWindow++;
          }
        }
        left++;
      }
    }

    return result;
  }
}
