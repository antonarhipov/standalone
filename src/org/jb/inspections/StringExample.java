package org.jb.inspections;

public class StringExample {


  //JDK 11
  static String get(String className, int dim) {
    if (dim < 0) {
      throw new IllegalStateException();
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < dim; i++) { //Alt+Enter
      sb.append('[');
    }
    sb.append('L');
    sb.append(className);
    sb.append(';');
    return sb.toString();
  }

  static String get2(String className, int dim) {
    if (dim < 0) {
      throw new IllegalStateException();
    }

    StringBuilder sb = new StringBuilder();
//    sb.append("[".repeat(dim));
    sb.append('L');
    sb.append(className);
    sb.append(';');
    return sb.toString();
  }
}
