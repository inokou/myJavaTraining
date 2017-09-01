package my.java.base.test.chapter17.no422.privateField2;
import java.lang.reflect.Field;

public class ExampleP422 {
  public static void main(String[] args) {
    Animal animal = new Animal("キリン");

    /* animal.name = "ゾウ"と同じ処理 */
    Class<Animal> animalClass = Animal.class;
    try {
      Field nameField = animalClass.getDeclaredField("name");
      nameField.setAccessible(true);
      nameField.set(animal, "ゾウ"); /* 正常に処理される */
      System.out.println(animal.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}