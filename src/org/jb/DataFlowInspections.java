package org.jb;

import java.util.ArrayList;
import java.util.Optional;

// Demo for 2*Ctrl+Shift+P
public class DataFlowInspections {

  //region instanceOf
  void showDataFlowWithInstanceOf(Object object) {
    if (object instanceof String || object instanceof Number) {
      System.out.println("String or Number");
    } else {
      //uncomment, 2x Ctrl+Shift+P
//      object
    }
  }
  //endregion

  //region optional
  void showDataFlowWithOptional() {
    Optional<String> optional = getOptional();
    if (optional.isPresent()) {
      //uncomment
//     optional
    }
  }
  //endregion

  //region numeric
  void showDataFlowWithNumeric(int value){
    if (value > 100) {
      return;
    } else if (value >= 52) {
      System.out.println("value is 53");
    } else if (value == 13) {
      throw new IllegalArgumentException("should not be 13");
    } else if (value < -10) {
      throw new IllegalArgumentException("should not be less than -10");
    }
    //uncomment, and 2x Ctrl+Shift+P
//    value

  }
  //endregion

  //region arrayOutOfBounds
  void arrayListOutOfBounds() {
    ArrayList<String> strings = new ArrayList<>();

    strings.get(1);
  }
  //endregion

  //region constants
  void constantEvaluation(){
    String foo = "foo";
    String bar = "bar";

    boolean startsWith = foo.startsWith(bar);
    boolean contains = foo.contains(bar);

    int four = 4;
    boolean sqrt = Math.sqrt(4) == 1;
  }
  //endregion
















  private Optional<String> getOptional() {
    return Optional.of("some string");
  }
}
