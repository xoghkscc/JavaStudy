package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_3_31Game2 {
	public static void main(String[] args) {
		//31 ������ ����� ������
		// 1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.(1, 2, 3 �ۿ� ������ �� ����)
		// 2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
		//3. ������ �������� ����
		//4. �������� 31 �̻��� ���ڸ� ���� �� �ۿ� ���� �÷��̾ �й�
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int userNum=0, comNum=0;
		int turn;
		int gameNum = 0;
		if(ran.nextBoolean()) {
			System.out.println("�÷��̾� ����");
			turn = 0;
		}else {
			System.out.println("��ǻ�� ����");
			turn = 1;
		}
				
		while(true) {
			System.out.println("\n���� ���ڴ� : "+ gameNum);
			if(turn ==0) {
				while(true) {
					System.out.print("1~3 �� ���ڸ� �����ּ��� :");
					userNum = sc.nextInt();
					if(userNum>= 1 && userNum <=3 ) {
						gameNum += userNum;
						turn = 1;
						break;
					}else {
						System.err.println("���ڴ� 1~3������ �Է��ؾ� �մϴ�.");
					}
				}
			} else {
				if(gameNum % 4 == 0) {
					comNum = 2;
				}else if(gameNum % 4 == 1) {
					comNum = 1;
				}else if(gameNum % 4 == 2) {
					comNum = ran.nextInt(3)+1;
				}else {
					comNum = 3;
				}
				
				System.out.println("��ǻ�Ͱ� ������ ���ڴ� " + comNum + "�Դϴ�");
				gameNum += comNum;
				turn = 0;
			}

			if(gameNum >=31) {
				System.out.println("\n���� ���ڴ� : "+ gameNum);
				if(turn == 1) {
					System.out.println("�÷��̾��� �й�");
				}else if(turn == 0) {
					System.out.println("��ǻ���� �й�");
				}
				break;
			}
		}
		
	}
}