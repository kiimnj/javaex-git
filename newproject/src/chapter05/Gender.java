package chapter05;

public enum Gender { // 싱글톤으로 만들어짐 - new로 만들지 않음
  MALE("남성"), FEMALE("여성"); // name(value)

  // 필드
  private String gender;

  // 생성자
  private Gender(){}
  private Gender(String gender) {
    this.gender = gender;
  }

  // getter
  public  String getGender(){
    return gender;
  }

}
