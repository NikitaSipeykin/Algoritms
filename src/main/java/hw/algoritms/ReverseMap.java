package hw.algoritms;

// Ограничения:
// - Необходимо создать новый Map, где ключи и значения поменяны местами.
// - Исходный Map не должен изменяться.
// - Предполагается, что значения в исходном Map уникальны.
//
// Примеры:
//
// input:
// {1="one", 2="two", 3="three"}
// output:
// {"one"=1, "two"=2, "three"=3}
//
// input:
// {"a"=100, "b"=200}
// output:
// {100="a", 200="b"}
//
// input:
// {"java"="backend", "sql"="database"}
// output:
// {"backend"="java", "database"="sql"}

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

  public static void main(String[] args) {

    Map<Integer, String> map1 = Map.of(1, "one", 2, "two", 3, "three");
    Map<String, Integer> map2 = Map.of("a", 100, "b", 200);
    Map<String, String> map3 = Map.of("java", "backend", "sql", "database");

    System.out.println(reverse(map1).toString());
    System.out.println(reverse(map2).toString());
    System.out.println(reverse(map3).toString());
  }

  public static <K, V> Map<V, K> reverse(Map<K, V> source) {
    Map<V, K> result = new HashMap<>();

    source.forEach((k, v) -> {
      result.put(v, k);
    });

    return result;
  }
}

