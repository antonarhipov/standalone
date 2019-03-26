package org.jb;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public interface Reader {
  void consume() throws IOException;

  List<String> getStrings(BufferedReader reader) throws IOException;
}
