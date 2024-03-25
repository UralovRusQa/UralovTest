import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;


public class Test{

  public Test() throws IOException{};

  int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int a, b;
  String str1, str2;

  public void test1 (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Тестовое задание №1: ");
    System.out.print("Введите первое число: ");
      if (scanner.hasNextInt()){
        a = scanner.nextInt();
      } else {
        System.out.println("Введено недопустимое значение!");
      }
    System.out.print("Введите второе число: ");
    if (scanner.hasNextInt()){
      b = scanner.nextInt();
    } else {
      System.out.println("Введено недопустимое значение!");
      return;
    }

    if(a>b){
      System.out.println(a +" > "+ b);
    } else if (a<b){
      System.out.println(a +" < "+ b);
    } else {
      System.out.println(a +" = "+ b);
    }
  }


  public void test2 (){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Тестовое задание №2: ");
    System.out.print("Введите первое слово: ");
    str1 = scanner.nextLine();
    System.out.print("Введите второе слово: ");
    str2 = scanner.nextLine();

    if (str1.equals(str2)){
      System.out.println("Строки идентичны");
    } else {
      System.out.println("Строки неидентичны");
    }
  }

  public void test3 (){
    System.out.println("Тестовое задание №3: ");
    for (int e : mas){
      if(e%2 == 0){
        System.out.println(e);
      }
    }
  }

}
