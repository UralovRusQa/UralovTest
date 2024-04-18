public class Test3 {
  private final static int[] MAS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

  public static void test (){
    System.out.println("Тестовое задание №3: ");
    for (int e : MAS){
      if(e%2 == 0){
        System.out.println(e);
      }
    }
  }
}
