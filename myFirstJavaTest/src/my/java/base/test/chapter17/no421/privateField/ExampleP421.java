package my.java.base.test.chapter17.no421.privateField;
public class ExampleP421 {
  public static void main(String[] args) {
    Animal animal = new Animal("キリン");
    animal.name = "ゾウ"; /* カプセル化されているのでコンパイルエラー */
  }
}