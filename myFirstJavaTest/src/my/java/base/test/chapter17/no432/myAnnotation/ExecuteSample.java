package my.java.base.test.chapter17.no432.myAnnotation;
import java.lang.reflect.Method;

public class ExecuteSample {
  public static void main(String[] args) {
    ExecuteSample logSample = new ExecuteSample();
    Class<ExecuteSample> clazz = ExecuteSample.class;

    /* ①の処理を置き換えた */
    // logSample.method01();
    try {
      Method method01 = clazz.getDeclaredMethod("method01");
      /* メソッドに指定された独自アノテーションを取得する */
      ExecuteLevel executeLevel01 = method01.getAnnotation(ExecuteLevel.class);
      /* アノテーションが条件に合うときだけ、method01を呼び出す*/
      if(executeLevel01 != null && executeLevel01.level() > 1) {
        method01.invoke(logSample);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    /* ②の処理を置き換えた */
    // logSample.method02();
    try {
      Method method02 = clazz.getDeclaredMethod("method02");
      /* メソッドに指定された独自アノテーションを取得する */
      ExecuteLevel executeLevel02 = method02.getAnnotation(ExecuteLevel.class);
      /* アノテーションが条件に合うときだけ、method02を呼び出す*/
      if(executeLevel02 != null && executeLevel02.level() > 1) {
        method02.invoke(logSample);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
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