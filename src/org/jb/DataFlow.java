package org.jb;

//Used for demoing the following inspections:
//Analyze Data Flow to Here
//Analyze Data Flow from Here
public class DataFlow {

  private String id;

  public DataFlow(String id) {
    this.id = id;
  }

  public void flow() {
    doSomethingWithTheId(this.id);
  }

  private void doSomethingWithTheId(String id) {
    logId(id);
    registerId(id);
  }

  private void logId(String id) {
    System.out.println("id = [" + id + "]");
    logId(id);
  }

  private void registerId(String id) {
    sendIdToDB();
    sendIdToQueue(id);
  }

  private void sendIdToQueue(String id) {
    JMS.send(id);
  }

  private void sendIdToDB() {

  }

  private static class JMS {
    public static void send(String id) {
      ack();
      System.out.println("id = " + id);
    }

    private static void ack() {

    }
  }

  public static void main(String[] args) {
    new DataFlow(args[0]).flow();
  }
}
