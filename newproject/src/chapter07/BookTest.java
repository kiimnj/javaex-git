package chapter07;

import java.util.Arrays;

public class BookTest {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(20000),
        new Book(25000)
    };
//    for (int i = 0; i < 3; i++) {
//      int(books[i]);
//      Integer.parseInt(books[i]);
//    }
    System.out.println("정렬 전");
    for (Book book : books){
      System.out.printf("Book [price=%d]\n", book);
    }
    Arrays.sort(books);
    System.out.println("정렬 후");
    for (Book book : books){
      System.out.printf("Book [price=%d]\n", book);
    }
  }
}

class Book implements Comparable<Book>{
  int price;
  public Book(int price){
    this.price = price;
  }

  @Override
  public int compareTo(Book book) {
    return this.price - book.price;
  }

  @Override //안해주면 배열값이 아닌 주소값 출력
  public String toString() {
    return "Book [price=" + price +"]";
  }
}