package andersen.test.task;

import java.util.Scanner;

  public class NameAlg {

   void sendName() {
    String name = "Вячеслав";
    Scanner scan = new Scanner(System.in);

    System.out.println("Введите Имя: ");
    if(scan.hasNext(name)){
        System.out.println("Привет,"+name);
    } else {
        System.out.println ("Нет такого имени");
    }
}
}
