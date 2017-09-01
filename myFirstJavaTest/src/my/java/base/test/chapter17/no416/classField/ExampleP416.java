package my.java.base.test.chapter17.no416.classField;
public class ExampleP416 {
  public static void main(String[] args) {
    Class<Car> carClass = Car.class;
    System.out.println("クラス名：" + carClass.getName());
    System.out.println("親クラス名：" + carClass.getSuperclass().getName());
    System.out.println("フィールド数： " + carClass.getDeclaredFields().length);
    System.out.println("フィールド数： " + carClass.getDeclaredMethods().length);

    Class<SuperCar> superCarClass = SuperCar.class;
    System.out.println("クラス名：" + superCarClass.getName());
    System.out.println("親クラス名：" + superCarClass.getSuperclass().getName());
    System.out.println("フィールド数：" + superCarClass.getDeclaredFields().length);
    System.out.println("フィールド数：" + superCarClass.getDeclaredMethods().length);
  }
}