package chapter05;

public class EnumEx {
  public static void main(String[] args) {
//    int gender = People.MALE;
//    int dir = People.EAST;
//    if (gender == 0) System.out.println("남성입니다.");
//    int gender1 = People1.FEMALE;
//    if (gender1 == 1) System.out.println("여성입니다.");

    People people = new People();
    people.age = 20;
    people.gender = Gender.MALE;
    people.direction = Direction.EAST;

    People anothorPeople = new People();
    people.age = 30;
    people.gender = Gender.FEMALE;
    people.direction = Direction.WEST;

    if (people.gender == Gender.MALE) System.out.println("남성입니다.");
//    if (people.direction == Direction.EAST) System.out.println("동쪽입니다.");
    if (people.direction.compareTo(anothorPeople.direction) == 0) {
      System.out.println("같은 방향입니다.");
    } else {
      System.out.println("다른 방향입니다.");
    }

    System.out.println(people.gender);
    System.out.println(people.direction);

//    System.out.println(Gender.valueOf(people.gender.name())); // MALE
    System.out.println(people.gender.getGender());
    System.out.println(people.gender.name()); // MALE
    System.out.println(people.gender.ordinal()); // 0

  }
}

class People {
  int age; // 별도의 필드도 추가 가능

  Gender gender;
//  static final int MALE = 0;
//  static final int FEMALE = 1;

  Direction direction;
//  static final int EAST = 0;
//  static final int WEST = 1;
//  static final int SOUTH = 3;
//  static final int NORTH = 4;
}

//class People1 {
//  static final int FEMALE = 1;
//  static final int WEST = 1;
//}