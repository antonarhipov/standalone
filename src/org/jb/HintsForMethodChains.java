package org.jb;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HintsForMethodChains {

  public static void main(String[] args) {
    List<String> collect = Stream.of(1, 2, 3, 4, 5)
        .map(i -> i * 2)
        .filter(i -> i % 2 == 0)
        .collect(Collectors.toList())
        .subList(2, 3)
        .stream().skip(1)
        .map(Objects::toString)
        .collect(Collectors.toList());

    System.out.println(collect);

  }

}
