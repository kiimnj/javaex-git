package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//    Student s = (Student) new Person(); // 컴파일 에러는 안나지만 ClassCastException 런타임 에러
//    s.whoAmI();
//    s.work();

    Student s = new Student();
    Person p = new Person();
    Worker w = new Worker();

    // 자식 instanceof 부모 : 연산자
    System.out.println("(s instanceof Student) " + (s instanceof Student)); //t
    System.out.println("(s instanceof Person) " + (s instanceof Person)); //t
    System.out.println("(p instanceof Student) " + (p instanceof Student)); //f
    System.out.println("(p instanceof Object) " + (p instanceof Object)); //t
// System.out.println(s instanceof String); - 상속관계가 아니므로 에러

    downcast(p); // Person타입만 입력 가능 - new Person(), .. 가능
    downcast(s); // 자동 형변환 되어 함수 실행
    downcast(w);
  }

  static void downcast(Person p){
    p.whoAmI(); // .work()는 불가
    if (p instanceof Student){ // 작은범위(자식)부터
      Student s = (Student) p;
      s.work();
      s.whoAmI();
    } else if (p instanceof Student){
      Worker w = (Worker) p;
      w.work();
      w.whoAmI();
    }
  }
//  static  void  downcast(Student s){ 위에서 한번에 가능
//
//  }
//  static  void  downcast(Worker w){
//
//  }
}
