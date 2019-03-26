package org.jb.inspections;

//@SuppressWarnings("StringBufferReplaceableByString")
public class Sequence {

  final String name = "Mark";
  final String greeting = new StringBuffer()
      .append("Hello ")
      .append(name)
      .append("!")
      .toString(); //Alt+Enter


  String greet(String name) {
    return new StringBuffer()
        .append("Hello ")
        .append(name)
        .append("!")
        .toString(); // Alt+Enter
  }
}
