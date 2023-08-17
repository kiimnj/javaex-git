package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();

    Person p;
    Student s = new Student(); // s: heap
    p = s; // p = (Person)s;과 동일
    p.whoAmI(); // 자동 형변환: 일부 기능만 사용 가능

    Worker w = new Worker();
    p = w;
    p.whoAmI();

//    s = w; 불가
//    String s1; s1 = w;도 불가

    Object o; // Object Person();도 가능
    o = s;
    o = p;
    Person p1 = new Student();
    Person p2 = new Worker();
  }
}
