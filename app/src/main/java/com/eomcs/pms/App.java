package com.eomcs.pms;

public class App {

  public static void main(String[] args) {
    java.io.InputStream keyboard = System.in;
    java.util.Scanner keyScan = new java.util.Scanner(keyboard);

    System.out.println("[회원]");
    System.out.print("번호? ");
    String id = keyScan.nextLine();
    System.out.print("이름? ");
    String name = keyScan.nextLine();
    System.out.print("이메일? ");
    String eMail = keyScan.nextLine();
    System.out.print("암호? ");
    String pw = keyScan.nextLine();
    System.out.print("사진? ");
    String pic = keyScan.nextLine();
    System.out.print("전화? ");
    String phone = keyScan.nextLine();
    System.out.println("-------------------------------------");
    System.out.printf("번호: %s\n", id);
    System.out.printf("이름: %s\n", name);
    System.out.printf("이메일: %s\n", eMail);
    System.out.printf("암호: %s\n", pw);
    System.out.printf("사진: %s\n", pic);
    System.out.printf("전화: %s\n", phone);


  }

}
