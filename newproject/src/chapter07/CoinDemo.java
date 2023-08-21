package chapter07;

public class CoinDemo {
  public static void main(String[] args) {
    System.out.println("Dime은" + Coin.PENNY + "센트입니다");
  }
}

interface Coin {
  int PENNY = 1;
}