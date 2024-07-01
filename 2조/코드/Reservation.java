package HotelDance;

import java.util.Random;
import java.util.Scanner;

// 예약 하기  Res()
// 예약 변경  Change()    // 예약변경 반복 메소드 changeFloor(int a)
// 예약 취소  Cancel() 

// 워크인

public class Reservation {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	Body[][] body = new Body[4][20];

////////////★★★★★ 예약하기 메뉴에 들어있는 ★★★★★//////////////////////////////////////////
	
	public void Res1(int roomNum, String cusName, String cusBirth, String cusPhoneNumber) {

		if (roomNum == 414 || roomNum == 404) {
			System.out.println("===============================");
			System.out.println("해당 객실은 없는 객실입니다.\n");

		} else if (roomNum != 414 || roomNum != 404) {
			int z = (roomNum / 100) - 2;
			int y = (roomNum % 100) - 1;

			if (body[z][y].roomState == 0) {

				body[z][y].name = cusName;
				body[z][y].birth = cusBirth;
				body[z][y].phoneNumber = cusPhoneNumber;
				body[z][y].roomState = 1;

				// 예약번호 생성
				int count = 0;
				int resNum = random.nextInt(8999) + 1001;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 20; j++) {
						if (body[(roomNum / 100) - 2][(roomNum % 100) - 1].rv != resNum) {

						} else if (body[i][j].rv == resNum) {
							count++;

						} else {

						}
					}
				}
				if (count > 0) { // 예약 번호가 중복 생성되었을 경우

				} else {
					body[z][y].rv = resNum;
				}

				System.out.println("===============================");
				System.out.println(body[z][y].roomNum + "호 예약이 완료되었습니다.");
				if (z == 2) {
					System.out.println("고객님이 예약하신 객실은 '트윈베드' 입니다.");
				} else {
					if (body[z][y].roomNum % 2 == 0) {
						System.out.println("고객님이 예약하신 객실은 '더블베드' 입니다.");
					} else {
						System.out.println("고객님이 예약하신 객실은 '싱글베드' 입니다.");
					}
				}
				System.out.println(cusName + "님 예약번호는 " + body[z][y].rv + " 입니다.");
				System.out.println("===============================");
			} else if (body[z][y].roomState == 1) {
				System.out.println("해당 객실은 예약중인 객실입니다.\n");
			} else if (body[z][y].roomState == 2) {
				System.out.println("해당 객실은 투숙중인 객실입니다.\n");
			} else if (body[z][y].roomState == 3) {
				System.out.println("해당 객실은 청소중인 객실입니다.\n");
			} else {
				System.out.println("다시 확인해주세요.\n");
			}

		} else {
			System.out.println("다시 확인해주세요.\n");
		}
	}

////////////  ★★★★★  예약하기  ★★★★★//////////////////////////////////////////
	
	public void Res() {
		System.out.println("예약을 진행하시겠습니까?");
		System.out.println("1. 예약하기  | 2. 돌아가기");

		boolean go4 = true;
		while (go4) {
			int choose = scanner.nextInt();

			if (choose == 1) {
				boolean go = true;
				boolean go1 = true;
				boolean go2 = true;
				
				System.out.println("===============================");
				System.out.println("예약을 진행하겠습니다.");
				System.out.println("고객님의 성함을 작성해주세요.");
				String cusName = scanner.next();
				System.out.println("===============================");
				System.out.println("고객님의 생년월일을 작성해주세요.");
				String cusBirth = scanner.next();
				System.out.println("===============================");
				System.out.println("고객님의 전화번호를 작성해주세요.");
				String cusPhoneNumber = scanner.next();

				while (go1) {
					System.out.println("===============================");
					System.out.println("4층은 전 객실 트윈베드 입니다.");
					System.out.println("4층 이외 전 층 홀수 호수는 싱글베드, 짝수 호수는 더블베드 입니다.\n");
					System.out.println("예약 가능한 방을 찾기위해 보고싶으신 층을 입력해 주세요.");
					System.out.println("2층 | 3층 | 4층 | 5층");
					
					go2 = true;
					// 변경할 층수 입력
					int changeFloor = scanner.nextInt();
					// 변경할 층수에 빈방 출력
					changeFloor(changeFloor - 2);
					while (go2) {
						System.out.println("===============================");
						System.out.println("1. 다른 층을 보겠습니다.");
						System.out.println("2. 객실을 입력하겠습니다.");

						int user = scanner.nextInt();
						if (user == 1) {
							go2 = false;
							
						} else if (user == 2) {
							go2 = false;
							go1 = false;
							go4 = false;
							
						} else {
							System.out.println("다시 확인해주세요.");
						}
					}
				}

				while (go) {
					System.out.println("===============================");
					System.out.println("예약을 진행할 객실 호수를 입력해주세요.");
					
					int roomNum = scanner.nextInt();
					if (roomNum > 200 && roomNum < 221) {
						Res1(roomNum, cusName, cusBirth, cusPhoneNumber);
						go = false;
					} else if (roomNum > 300 && roomNum < 321) {
						Res1(roomNum, cusName, cusBirth, cusPhoneNumber);
						go = false;
					} else if (roomNum > 400 && roomNum < 421) {
						Res1(roomNum, cusName, cusBirth, cusPhoneNumber);
						go = false;
					} else if (roomNum > 500 && roomNum < 521) {
						Res1(roomNum, cusName, cusBirth, cusPhoneNumber);
						go = false;
					} else if (roomNum == 414 || roomNum == 404) {
						System.out.println("존재하지 않는 객실입니다.\n");
					} else {
						System.out.println("다시 확인해주세요.");
					}
				}
				
			} else if (choose == 2) {
				System.out.println("업무 선택으로 돌아갑니다.");
				go4 = false;

			} else {
				System.out.println("다시 선택해주세요.");
			}
		}
	}

///////////////////////////////예약 변경/////////////////////////////////////////////////////////////
	
	public void Change() {
		Scanner scanner = new Scanner(System.in);
		boolean go = true;
		// 예약 변경
		System.out.println("===============================");
		System.out.println("예약 변경을 진행하겠습니다.");
		System.out.println("1.예약번호 입력 | 2.예약 변경 취소");
		int userInput = scanner.nextInt();

		// 예약번호 입력
		if (userInput == 1) {
			System.out.println("===============================\n");
			System.out.println("고객님의 예약번호를 입력해 주세요.");
			int inputRn = scanner.nextInt();
			for (int i = 0; i < body.length; i++) {
				if (go == false) {
					break;
				} else {

				}
				for (int j = 0; j < body[i].length; j++) {

					// 입력한 예약번호와 가지고 있는 예약번호가 같을때
					if (body[i][j].rv == inputRn) {
						System.out.println("===============================");
						System.out.println("예약번호가 확인 되었습니다.");
						System.out.println("===============================\n");
						// 입력한 예약번호에 해당하는 방이 예약중이 아닐때
						if (body[i][j].roomState != 1) {
							System.out.println("해당 객실은 현재 투숙중인 객실입니다.");
							go = false;
						} else {

						}

						while (go) {
							System.out.println("===============================");
							System.out.println("원하시는 층수를 입력해주세요.");
							System.out.println("2층 | 3층 | 4층 | 5층");
							// 변경할 층수 입력
							int changeFloor = scanner.nextInt();
							// 변경할 층수에 빈방 출력
							changeFloor(changeFloor - 2);
							System.out.println("===============================");
							System.out.println("1. 다른 층을 보겠습니다.");
							System.out.println("2. 객실을 입력하겠습니다.");

							int user = scanner.nextInt();
							if (user == 1) {
								// 다시 ㄱㄱ111
							} else if (user == 2) {
								// 변경
								while (true) {
									System.out.println("===============================");
									System.out.println("변경할 객실을 입력해주세요.");

									int changeRoom = scanner.nextInt();
									if (changeRoom != 404 || changeRoom != 414) {
										int z = (changeRoom / 100) - 2;
										int y = (changeRoom % 100) - 1;

										if (changeRoom > 200 && changeRoom < 221) {

										} else if (changeRoom > 300 && changeRoom < 321) {

										} else if (changeRoom > 400 && changeRoom < 421) {

										} else if (changeRoom > 500 && changeRoom < 521) {

										} else {
											System.out.println("존재하지 않는 객실입니다.\n");
											break;
										}

										if (body[z][y].roomState == 0) {

											body[z][y].name = body[i][j].name;
											body[z][y].birth = body[i][j].birth;
											body[z][y].phoneNumber = body[i][j].phoneNumber;
											body[z][y].roomState = body[i][j].roomState;
											body[z][y].rv = body[i][j].rv;

											body[i][j].name = "";
											body[i][j].birth = "";
											body[i][j].phoneNumber = "";
											body[i][j].roomState = 0;
											body[i][j].rv = 0;

											System.out.println("=====================");
											System.out.println("고객님의 예약이 변경되었습니다.\n");
											go = false;
											break;

										} else if (body[z][y].roomState == 1) {
											System.out.println("=====================");
											System.out.println("해당 객실은 현재 예약중인 객실입니다.\n");

										} else if (body[z][y].roomState == 2) {
											System.out.println("=====================");
											System.out.println("해당 객실은 현재 투숙중인 객실입니다.\n");
										}

									} else {
										System.out.println("존재하지 않는 객실입니다.\n");
									}
								}
							}
						}
					}
				}
			}

		} else if (userInput == 2) {
			System.out.println("=====================");
			System.out.println("예약 변경이 진행되지 않습니다.\n");

		} else {
			System.out.println("=====================");
			System.out.println("예약번호를 다시 확인해주세요.\n");
		}
	}

	////////////////// 예약 변경//////////////////

	public void changeFloor(int a) {
		// 변경할 층 수 입력
		if (a == 2) {
			System.out.println("===============================");
			System.out.println((a + 2) + "층의 빈 객실은");
			System.out.println("===============================");
			System.out.println("트윈베드");
			for (int b = 0; b < 20; b++) {
				if (b == 3 || b == 13) {
					System.out.println(" ((( 없는 객실 )))  ");
				} else if (b != 3 || b != 13) {

					if (body[a][b].roomState == 0) {

						System.out.print(body[a][b].roomNum + "호 ( 빈 객실  )  ");
					} else if (body[a][b].roomState == 1) {

						System.out.print(body[a][b].roomNum + "호 ( 예약중  )  ");

					} else if (body[a][b].roomState == 2) {

						System.out.print(body[a][b].roomNum + "호 ( 투숙중  )  ");

					} else {

					}

					if ((b + 1) % 2 == 0) {
						System.out.println();
					}
				}
			}
			System.out.println();

		} else if (a == 0 || a == 1 || a == 3) {
			System.out.println("===============================");
			System.out.println((a + 2) + "층의 빈 객실은");
			System.out.println("===============================");
			System.out.println("싱글베드, 더블베드");
			for (int b = 0; b < 20; b++) {

				if (body[a][b].roomState == 0) {
					System.out.print(body[a][b].roomNum + "호 ( 빈 객실  )");

				} else if (body[a][b].roomState == 1) {
					System.out.print(body[a][b].roomNum + "호 ( 예약중  )");

				} else if (body[a][b].roomState == 2) {
					System.out.print(body[a][b].roomNum + "호 ( 투숙중  )");

				} else {
				}
				if ((b + 1) % 2 == 0) {
					System.out.println();
				} else {

				}
			}
			
		} else {
			System.out.println("다시 확인해주세요.");
		}
		System.out.println();
	}

///////////////////  ★★★★★예약취소  ★★★★★/////////////////////////////

	public void Cancel() {
		System.out.println("===============================");
		System.out.println("예약 취소를 진행하겠습니다.\n");
		boolean go = true;
		while (go) {
			System.out.println("고객님이 예약하신 객실의 호수를 입력해 주세요.");
			int a = scanner.nextInt();
			int z = (a / 100) - 2;
			int y = ((a % 100) - 1);

			if (a > 200 && a < 221) {
			} else if (a > 300 && a < 321) {
			} else if (a > 400 && a < 421) {
			} else if (a > 500 && a < 521) {
			} else {
				System.out.println("존재하지 않는 객실입니다.\n");
				break;
			}

			if (body[z][y].roomState == 1) {
				if (body[z][y].roomNum == a) {
					System.out.println("===============================");
					System.out.println(body[z][y].roomNum + "호 입니다.");
					System.out.println("해당 호실의 예약번호를 입력하세요.");
					int user3 = scanner.nextInt();
					if (body[z][y].rv == user3) {
						System.out.println("===============================");
						System.out.println("예약번호가 확인되었습니다.");
						System.out.println("고객님의 객실은  :" + body[z][y].roomNum + "호 입니다.");
						if (body[z][y].roomNum % 2 == 0) {
							System.out.println("고객님의 객실은 더블베드 입니다.");
						} else {
							System.out.println("고객님의 객실은 싱글베드 입니다.");
						}
						System.out.println("고객님의 성함은  :" + body[z][y].name + " (님) 입니다.");
						System.out.println("고객님의 예약번호는  :" + body[z][y].rv + " 입니다.");
						System.out.println("===============================");
						System.out.println("1. 예약 취소  | 2. 뒤로가기\n");

						int user2 = scanner.nextInt();
						System.out.println("===============================\n");
						if (user2 == 1) {
							System.out.println("고객님의 예약이 취소 되었습니다.");
							body[z][y].birth = " ";
							body[z][y].name = " ";
							body[z][y].phoneNumber = " ";
							body[z][y].roomState = 0;
							body[z][y].rv = 0;
							break;

						} else if (user2 == 2) {
							System.out.println("예약취소가 진행되지 않았습니다.\n");
							break;
						}

					} else {
						System.out.println("예약번호를 다시 확인해주세요.\n");
						break;
					}
				} else {
					System.out.println("호수를 다시 확인해주세요.\n");
					break;
				}

			} else if (body[z][y].roomState == 2) {
				System.out.println("해당 객실은 투숙중인 객실입니다.\n");
				break;

			} else {
				System.out.println("호수를 다시 확인해주세요.\n");
				break;
			}
		}
	}

/////////////////// ★★★★★ 워크인 ★★★★★  /////////////////////////////

	public void walkIn() {
		System.out.println("워크인을 진행하시겠습니까?");
		System.out.println("1. 워크인  | 2. 돌아가기");

		boolean go5 = true;
		while (go5) {
			int choose = scanner.nextInt();

			if (choose == 1) {
				System.out.println("워크인을 진행합니다.");
				System.out.println("고객님의 성함을 작성해주세요.");
				String userName = scanner.next();
				System.out.println("고객님의 생년월일을 작성해주세요.");
				String userBirth = scanner.next();
				System.out.println("고객님의 전화번호를 작성해주세요.");
				String userPhoneNumber = scanner.next();

				boolean go3 = true;
				while (go3) {
					System.out.println("===============================");
					System.out.println("4층은 전 객실 트윈베드 입니다.");
					System.out.println("4층 이외 전 층 홀수 호수는 싱글베드, 짝수 호수는 더블베드 입니다.\n");
					System.out.println("예약 가능한 방을 찾기위해 보고싶으신 층을 입력해 주세요.");
					System.out.println("2층 | 3층 | 4층 | 5층");

					boolean go4 = true;
					// 변경할 층수 입력
					int changeFloor = scanner.nextInt();
					// 변경할 층수에 빈방 출력
					changeFloor(changeFloor - 2);
					while (go4) {
						System.out.println("===============================");
						System.out.println("1. 다른 층을 보겠습니다.");
						System.out.println("2. 객실을 입력하겠습니다.");

						int user = scanner.nextInt();
						if (user == 1) {
							go4 = false;
						} else if (user == 2) {
							go4 = false;
							go3 = false;
						} else {
							System.out.println("다시 확인해주세요.");
						}
					}
				}

				System.out.println("체크인하실 객실 호수를 입력해주세요.");
				int roomNum = scanner.nextInt();

				int z = (roomNum / 100) - 2;
				int y = (roomNum % 100) - 1;

				if (roomNum > 200 && roomNum < 221) {
					if (body[z][y].roomState == 0) {
						WalkIn1(roomNum, userName, userBirth, userPhoneNumber);
					} else {
						System.out.println("해당 객실은 예약중 또는 투숙중인 객실입니다.\n");
					}
				} else if (roomNum > 300 && roomNum < 321) {
					if (body[z][y].roomState == 0) {
						WalkIn1(roomNum, userName, userBirth, userPhoneNumber);
					} else {
						System.out.println("해당 객실은 예약중 또는 투숙중인 객실입니다.\n");
					}
				} else if (roomNum > 400 && roomNum < 421) {
					if (body[z][y].roomState == 0) {
						WalkIn1(roomNum, userName, userBirth, userPhoneNumber);
					} else {
						System.out.println("해당 객실은 예약중 또는 투숙중인 객실입니다.\n");
					}
				} else if (roomNum > 500 && roomNum < 521) {
					if (body[z][y].roomState == 0) {
						WalkIn1(roomNum, userName, userBirth, userPhoneNumber);
					} else {
						System.out.println("해당 객실은 예약중 또는 투숙중인 객실입니다.\n");
					}
				} else {
					System.out.println("존재하지 않는 객실입니다.\n");
				}
				go5 = false;

			} else if (choose == 2) {
				System.out.println("업무 선택으로 돌아갑니다.");
				go5 = false;

			} else {
				System.out.println("다시 선택해주세요.");
			}
		}
	}

	public void WalkIn1(int roomNum, String userName, String userBirth, String userPhoneNumber) {

		if (roomNum == 414 || roomNum == 404) {
			System.out.println("===============================");
			System.out.println("입력하신 객실은 없는 객실입니다.\n");
		} else if (roomNum != 414 || roomNum != 404) {
			int z = (roomNum / 100) - 2;
			int y = (roomNum % 100) - 1;

			if (body[z][y].roomState == 0) {

				body[z][y].name = userName;
				body[z][y].birth = userBirth;
				body[z][y].phoneNumber = userPhoneNumber;
				body[z][y].roomState = 2;

				int count = 0;
				int resNum = random.nextInt(8999) + 1001;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 20; j++) {
						if (body[(roomNum / 100) - 2][(roomNum % 100) - 1].rv != resNum) {
						} else if (body[i][j].rv == resNum) {
							// 예약 번호(투숙 번호)가 중복 생성되었을 경우
							count++;
						}
					}
				}
				if (count > 0) { // 예약 번호(투숙 번호)가 중복 생성되었을 경우
				} else {
					body[z][y].rv = resNum;
				}

				System.out.println("===============================");
				System.out.println(body[z][y].roomNum + "호 체크인이 완료되었습니다.");
				if (z == 2) {
					System.out.println("고객님이 체크인하신 객실은 '트윈베드' 입니다.");

				} else {
					if (body[z][y].roomNum % 2 == 0) {
						System.out.println("고객님이 체크인하신 객실은 '더블베드' 입니다.");
					} else {
						System.out.println("고객님이 체크인하신 객실은 '싱글베드' 입니다.");
					}
				}
				System.out.println(userName + "님 예약번호는 " + body[z][y].rv + " 입니다.");
				System.out.println("===============================");
			}
		} else {
			System.out.println("다시 확인해주세요.\n");
		}
	}
}