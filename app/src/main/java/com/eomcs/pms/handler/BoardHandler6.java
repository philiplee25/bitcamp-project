package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler6 {

  // 회원 정보를 저장할 메모리의 설계도
  // - 각 항목의 데이터를 저장할 변수를 선언한다.
  // - 이 변수를 "필드(field)"라고 부른다.

  static final int LENGTH = 100;
  static Board[] boards = new Board[LENGTH];  // 레퍼런스 배열 준비  
  static int size = 0;

  public static void add() {
    System.out.println("[회원 등록]");

    // 1) 회원 정보를 담을 메모리를 준비한다.
    Board b = new Board();

    // 2) 사용자가 입력한 값을 Member 인스턴스에 저장한다.
    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("제목? ");
    b.content = Prompt.inputString("내용? ");
    b.name = Prompt.inputString("작성자? ");
    b.registeredDate = new java.sql.Date(System.currentTimeMillis());

    // 3) 사용자의 정보가 저장된 인스턴스 주소를 레퍼런스 배열에 보관한다.
    boards[size++] = b;
    // 위 문장은 컴파일할 때 다음 문장으로 변경된다.
    //    int temp = size;
    //    size++;
    //    members[temp] = m;

  }

  public static void list() {
    System.out.println("[회원 목록]");

    for (int i = 0; i < size; i++) {
      Board m = boards[i];
      // 번호, 제목, 등록일, 작성자, 조회수, 좋아요
      System.out.printf("%d, %s, %s, %s, %d, %d\n", // 출력 형식 지정
          m.no, m.title, m.registeredDate, m.name, m.viewCount, m.like);
    }
  }
}
