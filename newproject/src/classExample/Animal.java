package classExample;

class Animal {
  private String name="Amimal"; // 자식에 상속 ㄴ
  void 숨쉰다() {
  }
  void 먹는다() {
  }
  void 움직인다() {
    System.out.println("움직인다");
  }

  @Override // 컨+O
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }
}

class Bird extends Animal{
  private String name="Bird";
  @Override
  void 움직인다() {
//    super.움직인다(); // this: 나, super: 부모
    System.out.println("날아간다");
  }

  @Override // 안하면 name = Animal로 정의되어있음
  public String toString() {
    return "제 이름은 " + name + "입니다.";
  }
}

class Tiger extends Animal{
  private String name="Tiger";
  @Override
  void 움직인다() {
//    super.움직인다();
    System.out.println("달린다");
  }
}

// Fish 헤엄친다