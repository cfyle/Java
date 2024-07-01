package HotelDance;

import java.util.Scanner;
// check()  메소드 안에 포함
// 체크 인
// 체크 아웃

public class Check {
	Scanner scanner = new Scanner(System.in);
	Body[][] body;

	public void check() {
		boolean go = true;
		while (go) {
			System.out.println("\n업무를 선택해주세요.");
			System.out.println("1. 체크인");
			System.out.println("2. 체크아웃");
			System.out.println("3. 뒤로가기");

			int choose1 = scanner.nextInt();

			if (choose1 == 1) { // 체크인
				System.out.println("체크인을 진행하겠습니다.");

				boolean go1 = true;
				while (go1) {
					System.out.println("예약 번호를 입력해주세요.");
					int resNum = scanner.nextInt();
					int count = 0;

					for (int i = 0; i < body.length; i++) {
						for (int j = 0; j < body[i].length; j++) {
							if (body[i][j].rv == resNum) {
								if (body[i][j].roomState == 1) {
									System.out.println("\n예약번호가 확인되었습니다.");
									count++;
									System.out.println("예약된 객실 호수를 입력해주세요.");

								} else if (body[i][j].roomState == 2) {
									System.out.println("이미 체크인 된 객실입니다.");
									break;

								} else {
									System.out.println("예약된 객실이 아닙니다.");
									go1 = false;
									break;

								}

								int roomNum = scanner.nextInt();
								if (body[i][j].roomNum == roomNum) {
									System.out.println("\n예약이 확인되었습니다.");
									System.out.println("체크인을 완료하시겠습니까?");
									System.out.println("1. 체크인 | 2. 뒤로가기");

									int check = scanner.nextInt();
									if (check == 1) {
										if (body[i][j].roomState == 1) {
											body[i][j].roomState = 2;
											System.out.println((100 * (i + 2)) + (j + 1) + "호는 체크인이 완료되었습니다.");
											go1 = false;

										} else {
											System.out.println("해당 객실은 예약중인 객실이 아닙니다.");
											go1 = false;
										}

									} else if (check == 2) {
										System.out.println("체크인을 종료합니다.");
										go1 = false;

									} else {
										System.out.println("다시 선택해주세요.\n");
									}

								} else {

									System.out.println("호수를 다시 확인해주세요.");
								}

							} else {

							}
						}
					}

					if (count <= 0) {
						System.out.println("예약번호를 다시 확인해주세요.");
						go1 = false;
						break;
					} else {
					}
				}
				go = false;

			} else if (choose1 == 2) { // 체크아웃

				System.out.println("체크아웃을 진행하겠습니다.");
				System.out.println("체크인된 객실 호수를 입력해주세요.");
				int roomNum = scanner.nextInt();
				int count = 0;

				for (int i = 0; i < body.length; i++) {
					for (int j = 0; j < body[i].length; j++) {
						if (body[i][j].roomState == 2 && body[i][j].roomNum == roomNum) {
							count++;
							System.out.println("\n체크인 객실이 확인되었습니다.");
							System.out.println("체크아웃을 완료하시겠습니까?");
							System.out.println("1. 체크아웃 | 2. 뒤로가기");

							int check = scanner.nextInt();
							if (check == 1) {
								if (body[i][j].roomState == 2) {
									body[i][j].birth = " ";
									body[i][j].name = " ";
									body[i][j].phoneNumber = " ";
									body[i][j].roomState = 3;
									body[i][j].rv = 0;
									System.out.println((100 * (i + 2)) + (j + 1) + "호는 체크아웃이 완료되었습니다.");
									go = false;

								} else {

								}

							} else if (check == 2) {
								System.out.println("체크아웃을 종료합니다.");
								go = false;

							} else {
								System.out.println("다시 선택하세요.\n");
							}
						}
					}
				}
				if (count <= 0) {
					System.out.println("해당 객실은 체크인된 객실이 아닙니다.");
					go = false;
				}
				
			} else {
				go = false;
			}
		}
	}
}