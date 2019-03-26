package org.jb;

//region Productive typing
//psvm
//type completion by first letters
//variable name completion, Ctrl+Space
//basic completion, Ctrl+Space (Tab vs Enter)
//smart completion, Ctrl+Shift+Space
//chained completion, 2x Ctrl+Shift+Space
//F2 - navigate to problem
//Alt+Enter All The Things!!!
//Extract variable, Cmd+Option+V
//  - Shift+Tab - change type
//  - mnemonics, Option+<key>
// Cmd+Shift+Enter - statement completion
// "first letter - dot - first letter" completion
// de-duplicating exceptions in method signature
// surround with live template, Cmd+Option+T
// completion for boolean condition with !
// toar live template
// inspection/quick fix: surround with try-with-resources
// inspection/quick fix: replace argument empty array
// static method completion: 2x Ctrl+Space
// iter live template
// sout/soutm/soutv/soutp
// Alt+Enter: replace while() with forEach
// Alt+Enter: add static import for sort
// suffix completion
// optimize imports, Cmd+Option+L
// code folding with custom regions
// HippieCompletion, Option+/
//endregion


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public void consume() throws IOException {
    List<String> strings;
    try (BufferedReader reader = new BufferedReader(new FileReader(new File("file.txt")))) {
      strings = getStrings(reader);
    }

    String[] array = strings.toArray(new String[0]);

    Arrays.sort(array);

    Arrays.stream(array).forEach(System.out::println);
  }

  public List<String> getStrings(BufferedReader reader) {
    return reader.lines().filter(line -> !line.isEmpty()).collect(Collectors.toList());
  }


}









