package my.java.base.test.chapter17.no412.batClassInstance;
public class ExampleP412 {
  public static void main(String[] args) {
    /* これは正しい */
    Class<Car> carClass1 = Car.class;
    /* TruckクラスはCarクラスと継承関係がないのでコンパイルエラー */
    //Class<Truck> carClass2 = Car.class;
    Class<Car> carClass2 = Car.class;
  }
}