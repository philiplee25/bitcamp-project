package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    System.out.println("[프로젝트]");
    System.out.print("번호? ");
    int id = keyScan.nextInt();
    keyScan.nextLine();

    System.out.print("프로젝트명? ");
    String title = keyScan.nextLine();

    System.out.print("내용? ");
    String content = keyScan.nextLine();

    System.out.print("만든이? ");
    String per = keyScan.nextLine();

    System.out.print("전화? ");
    String member = keyScan.nextLine();

    System.out.println("-------------------------------------");

    System.out.printf("번호: %d\n", id);
    System.out.printf("프로젝트명: %s\n", title);
    System.out.printf("내용: %s\n", content);
    System.out.printf("만든이: %s\n", per);
    System.out.printf("전화: %s\n", member);


  }
}
