package my.java.base.test.chapter17.no418.newInstance;
public class ExampleP419 {
  public static void main(String[] args) {
    /* Person person = new Person()と同等の処理 */
    Class<Person> personClass = Person.class;

    Person person;
    try {
      person = personClass.newInstance();
      System.out.println(person.getInfo());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}