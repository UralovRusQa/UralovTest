import java.util.Scanner;

public class Test2 {

  public static void test (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Тестовое задание №2: ");
    System.out.print("Введите первое слово: ");
    String str1 = scanner.nextLine();
    System.out.print("Введите второе слово: ");
    String str2 = scanner.nextLine();

    if (str1.equals(str2)){
      System.out.println("Строки идентичны");
    } else {
      System.out.println("Строки неидентичны");
    }
    scanner.close();
  }
}
