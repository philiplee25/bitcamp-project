package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {

  static Scanner keyboardScan = new Scanner(System.in);

  static String String(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }


  static int Int(String title) {
    return Integer.parseInt(String(title));
  }


  static Date Date(String title) {
    return Date.valueOf(String(title));
  }

  static void close() {
    keyboardScan.close();
  }
}


