package chapter05;

public class MainArgumentEx {
  public static void main(String[] args) {
//    for (int i = 0; i < int(args[1]); i++) {
//      System.out.println(args[0]);
//    }

    if(args.length == 2) {
      int count = Integer.parseInt(args[1]);
      printArgument(args[0], count);
    }
  }
  static void printArgument(String arg, int count) {
    for (int i = 0; i < count; i++) {
      System.out.println(arg);
    }
  }
}
