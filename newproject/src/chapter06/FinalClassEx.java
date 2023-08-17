package chapter06;

public class FinalClassEx {
  public static void main(String[] args) {
    new Good();
    new Better();
    new Best();
  }
}

class Good {

}

class Better extends Good {

}

final class Best extends Better {

}

// class Excellent extends Best {} 불가