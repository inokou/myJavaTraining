package my.java.base.test.chapter17.no418.newInstance;
public class Person {
  private String name;
  private int age;

  /* 引数のないコンストラクタ */
  public Person() {
    this.name = "名無しさん";
    this.age = 18;
  }

  /* 引数のあるコンストラクタ */
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getInfo() {
    return this.name + "：" + this.age + "才";
  }
}