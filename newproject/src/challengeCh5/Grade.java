package challengeCh5;

public enum Grade {
  A("Excellent"), B("good"), C("Soso");

  // 필드
  private String grade; // 위 value가 String이므로

  // 생성자
  private Grade(){}

  private Grade(String grade){
    this.grade = grade;
  }

  // getter
  public  String getGrade(){
    return grade;
  }
}
