package my.java.base.test.chapter17.no423.classMethod;
public class TestSuite {
  public void testDoTest1() {
    Animal animal = new Animal("キリン");
    System.out.println("キリン".equals(animal.getName()) ? "等しい" : "等しくない");
  }

  public void testDoTest2() {
    Animal animal = new Animal("キリン");
    System.out.println("ゾウ".equals(animal.getName()) ? "等しい" : "等しくない");
  }
}