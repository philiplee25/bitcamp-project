package com.eomcs.pms;

public class App3 {

  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    System.out.println("[작업]");
    System.out.print("프로젝트? ");
    String project = keyScan.nextLine();


    System.out.print("번호? ");
    int number = keyScan.nextInt();

    System.out.print("내용? ");
    String content = keyScan.nextLine();

    System.out.print("만든이? ");
    String per = keyScan.nextLine();

    System.out.print("전화? ");
    String member = keyScan.nextLine();

    System.out.println("-------------------------------------");

    System.out.printf("프로젝트: %s\n", project);
    System.out.printf("번호: %d\n", number);
    System.out.printf("이메일: %s\n", content);
    System.out.printf("사진: %s\n", per);
    System.out.printf("전화: %s\n", member);

  }
}
