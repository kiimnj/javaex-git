package challangeCH6;

public class StudentTest {
  public static void main(String[] args) {

  }
}

class Person{
  String name;
  int age;
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
//  public void setName(){
//    this.name = name;
//  }
//  public void setAge(){
//    this.age = age;
//  }
  void show(){
//    for (p : Person person){
//      System.out.println();
//    }
  }
}

class Student extends Person{
  int studentNum;
  public Student(String name, int age, int studentNum){
    super(name, age);
    this.studentNum = studentNum;
  }
  public int getStudentNum(){ return studentNum; }
  public void setStudentNum(int studentNum){ this.studentNum = studentNum; }
  void show(){
//    for (p : Student student){
//      System.out.println();
//    }
  }
}

class ForeignStudent extends Person{
  String nation;
  public ForeignStudent(String name, int age, String nation){
    super(name, age);
    this.nation = nation;
  }
  public String getStudentNum(){ return nation; }
  public void setStudentNum(int studentNum){ this.nation = nation; }
  void show(){
//    for (p : Student student){
//      System.out.println();
//    }
  }
}