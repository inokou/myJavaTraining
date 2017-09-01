package my.java.base.test.chapter17.no413.classForName;
public class ExampleP413 {

	public static void main(String[] args) {
    try {
      Class<Car> carClass = (Class<Car>) Class.forName("Car");
      
      Class<SuperCar> superCarClass = (Class<SuperCar>) Class.forName("SuperCar");
    
    } catch (ClassNotFoundException e) {
      /* クラスが見つからなかったときの処理 */
      System.out.println("クラスが見つかりませんでした");
    }
  }
}