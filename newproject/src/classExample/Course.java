package classExample;

public class Course {
  // name id num
  private String id;
  private String name = "";
  private int numOfStudents; // int == Integer

  public String getId() { // getter는 다 만들어도 됨: alt+insert
    return id;
  }

  public String getName() {
    return name;
  }

  public int getNumOfStudents() {
    return numOfStudents;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student) {
    numOfStudents += student;
  }
  public void deleteStudent(int student) {
    numOfStudents -= student;
  }
}
