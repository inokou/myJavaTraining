package my.java.base.test.chapter17.no434.useAnnotation;
public class ExecuteSample {
  public static void main(String[] args) {
    /* ExecuteLevelアノテーションを指定したメソッドを呼び出す */
    ExecuteSample logSample = new ExecuteSample();
    logSample.method01();
    logSample.method02();
  }

  @ExecuteLevel(level=1)
  public void method01() {
    System.out.println("method01を実行");
  }

  @ExecuteLevel(level=2)
    public void method02() {
    System.out.println("method02を実行");
  }
}