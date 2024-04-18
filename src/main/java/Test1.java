import java.io.IOException;
import java.util.Scanner;


public class Test1 {

  public static void test (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Тестовое задание №1: ");
    System.out.print("Введите первое число: ");
    int a = scanner.nextInt();
    System.out.print("Введите второе число: ");
    int b = scanner.nextInt();

    if(a>b){
      System.out.println(a +" > "+ b);
    } else if (a<b){
      System.out.println(a +" < "+ b);
    } else {
      System.out.println(a +" = "+ b);
    }
  }



}
