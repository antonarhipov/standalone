package org.jb.inspections;


public class Switch {
  void switchTest(String status) {
    switch (status) {
      case "A":
        System.out.println("A");
        break;
      case "B":
        System.out.println("B");
        break;
      case "C":
        System.out.println("C");
        break;
      case "D":
        System.out.println("A"); //Alt+Enter
        break;
      default:
        System.out.println("blah");
    }
  }

  void switchTest2(String status) {
    switch (status) {
      case "CREATED":
        System.out.println("A");
        break;
      case "RUNNING":
        System.out.println("B");
        break;
      case "DONE":
        System.out.println("C");
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + status);
    }
  }
}
