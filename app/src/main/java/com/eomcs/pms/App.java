package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {
  static Scanner keyboardScan = new Scanner(System.in);

<<<<<<< HEAD


  public static void main(String[] args) {
    loop:
      while (true) {
        String command = Prompt.String("명령> ");

        switch (command) {
          case "/member/add":
            MemberHandler.add();
            break;
          case "/member/list":
            MemberHandler.list();
            break;
          case "/project/add":
            ProjectHandler.add();
            break;
          case "/project/list":
            ProjectHandler.list();
            break;
          case "/task/add":
            TaskHandler.add();
            break;
          case "/task/list":
            TaskHandler.list();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }
    Prompt.close();
  }
}








=======
  static final int LENGTH = 100;
  static int[] no = new int[LENGTH];
  static String[] name = new String[LENGTH];
  static String[] email = new String[LENGTH];
  static String[] password = new String[LENGTH];
  static String[] photo = new String[LENGTH];
  static String[] tel = new String[LENGTH];
  static Date[] registeredDate = new Date[LENGTH];

  static int size = 0;

  static void addMember() {
    System.out.println("[회원 등록]");

    System.out.print("번호? ");
    no[size] = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("이름? ");
    name[size] = keyboardScan.nextLine();

    System.out.print("이메일? ");
    email[size] = keyboardScan.nextLine();

    System.out.print("암호? ");
    password[size] = keyboardScan.nextLine();

    System.out.print("사진? ");
    photo[size] = keyboardScan.nextLine();

    System.out.print("전화? ");
    tel[size] = keyboardScan.nextLine();

    registeredDate[size] = new java.sql.Date(System.currentTimeMillis());

    size++;
  }
  
  static void listMember() {
    System.out.println("[회원 목록]");
    
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i],
          registeredDate[i]);
    }
  }
  
  static final int PLENGTH = 100;
  static int[] pno = new int[PLENGTH];
  static String[] ptitle = new String[PLENGTH];
  static String[] pcontent = new String[PLENGTH];
  static Date[] pstartDate = new Date[PLENGTH];
  static Date[] pendDate = new Date[PLENGTH];
  static String[] powner = new String[PLENGTH];
  static String[] pmembers = new String[PLENGTH];

  static int psize = 0;
  
  static void addProject() {
    System.out.println("[프로젝트 등록]");

    System.out.print("번호? ");
    pno[psize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("프로젝트명? ");
    ptitle[psize] = keyboardScan.nextLine();

    System.out.print("내용? ");
    pcontent[psize] = keyboardScan.nextLine();

    System.out.print("시작일? ");
    pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("종료일? ");
    pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("만든이? ");
    powner[psize] = keyboardScan.nextLine();

    System.out.print("팀원? ");
    pmembers[psize] = keyboardScan.nextLine();

    psize++;
  }
  
  static void listProject() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", pno[i], ptitle[i], pstartDate[i], pendDate[i],
          powner[i]);
    }
  }

  static final int TLENGTH = 100;

  static int[] tno = new int[TLENGTH];
  static String[] tcontent = new String[TLENGTH];
  static Date[] tdeadline = new Date[TLENGTH];
  static String[] towner = new String[TLENGTH];
  static int[] tstatus = new int[TLENGTH];

  static int tsize = 0;
  
  static void addTask() {
    System.out.println("[작업 등록]");

    System.out.print("번호? ");
    tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("내용? ");
    tcontent[tsize] = keyboardScan.nextLine();

    System.out.print("마감일? ");
    tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("담당자? ");
    towner[tsize] = keyboardScan.nextLine();

    tsize++;
  }
  
  static void listTask() {
    System.out.println("[작업 목록]");
    for (int i = 0; i < tsize; i++) {
      String stateLabel = null;
      switch (tstatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }

      System.out.printf("%d, %s, %s, %s, %s\n", tno[i], tcontent[i], tdeadline[i], stateLabel,
          towner[i]);
    }
  }
  
  public static void main(String[] args) {


    loop: while (true) {
      System.out.print("명령> ");
      String command = keyboardScan.nextLine();

      switch (command) {
        
        case "/member/add":
          addMember();
          
          break;
          
        case "/member/list":
          listMember();

          break;
          
        case "/project/add":
          addProject();
          
          break;
          
        case "/project/list":
          listProject();
          
          break;
          
        case "/task/add":
          addTask();
          
          break;
          
        case "/task/list":
          listTask();
          
          break;
          
        case "quit":
          
        case "exit":
          
          System.out.println("안녕!");
          break loop;
        
        default:
          System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    keyboardScan.close();
  }
}
>>>>>>> 1aefaf7ac9c6d792af5c498be53065051d1f4d7d
