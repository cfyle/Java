import java.util.Random;
import java.util.Scanner;

// 사용자 입력으로
// 영웅을 조작해서
// 몬스터를 잡는 명령형 게임

// 몬스터 만나는데 (체력)
// 공격 / 회복

// 몬스터(체력) 만나는데
// 몬스터도 반격

// 영웅이 죽을때까지, 몇 마리를 사냥할 수 있었는지

public class HeroAndMonster {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		Hero hero = new Hero();
		Monster bee = new Monster();

		hero.hp = 100;
		hero.attack = r.nextInt(7) + 5;
		bee.mHp = 40;
		bee.mAttack = 3;

		boolean go = true;

		System.out.println("손흥민 키우기 시작하시겠습니까?");
		System.out.println("1.출발        2.쫄");

		int start = scanner.nextInt();
		if (start == 1) {
			System.out.println("용사 손흥민 출발합니다");
			System.out.println(" ");
			System.out.println("옛날옛적에 '에스파냐'성에는 진귀한 보물이 숨어있다고 합니다");
			System.out.println("그 곳에는 무서운 괴물이 살고 있어서 괴물을 물리쳐야 보물을 얻을 수 있습니다.");
			System.out.println("성의 입구에 도착했지만 입구가 두곳이 있다 // 옆의 표지판을 읽어보자");
			System.out.println(" ");

			System.out.println("1.꿀벌      2.백조");
			int choice1 = scanner.nextInt();
			if (choice1 == 1) {
				System.out.println("1번 방의 문을 열고 들어갔다");
				System.out.println("멀리 축구공만한 벌이 보인다");
				System.out.println(" ");
				System.out.println("손흥민의 체력: " + hero.hp + "  공격력: 5 ~ 12");
				System.out.println(" ");
				System.out.println("벌(브랜드포트)의 체력: " + bee.getBeeH() + "  공격력: " + bee.getBeeA());
				System.out.println(" ");
				
				System.out.println("1.공격   2.회복");
				
				int attack1 = scanner.nextInt();	
				
				boolean go1 = bee.getBeeH() <= 0 || hero.hp <= 0;
				while (go1) {
					if (attack1 == 1) {
						System.out.println("흥민존 감아차기!");
						System.out.println("벌의 체력이 " + (bee.mHp - hero.attack) + " 남았다");
						System.out.println("이번엔 벌이 날 찌른다");
						System.out.println("흥민이 체력이 " + (hero.hp - bee.mAttack));
					} else if (attack1 == 2) {
						System.out.println(hero.hp - bee.mAttack);
					}

				}

			} else if (choice1 == 2) {

			}

		} else if (start == 2) {
			System.out.println("쫄아서 게임이 끝이납니다");
		} else {
			System.out.println("메뉴도 볼줄 모르는 허접이네요. 발닦고 잠이나 자세요");
		}

	}
}
