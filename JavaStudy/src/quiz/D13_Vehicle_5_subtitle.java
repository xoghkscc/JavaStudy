package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

import myobj.MyScanner;

public class D13_Vehicle_5_subtitle {
	String todayWeekend = weekend();
	HashMap<String, int[]> endNumber;

	public D13_Vehicle_5_subtitle(Car mycar) {
		ArrayList<String> exceptType = new ArrayList<String>();
		Collections.addAll(exceptType, "LightCar", "Disabled", "InfantRide");
		if (exceptType.contains(mycar.carType)) {
			System.out.println("����� ������ " + mycar.carType + "�̹Ƿ� ���������Դϴ�. ���� ���� �����մϴ�.");
			return;
		}
		if (checkWeeknd(mycar)) {
			System.out.printf("������ ������ %s�̸� ����� �� ��ȣ�� %s�̹Ƿ� ������ �����մϴ�.", todayWeekend, mycar.number);
		} else {
			System.out.printf("������ ������ %s�̸� ����� �� ��ȣ�� %s�̹Ƿ� ������ �Ұ����մϴ�.", todayWeekend, mycar.number);
		}
	}

	public boolean checkWeeknd(Car mycar) {
		int endNum = mycar.number % 10;
		int[] mon = {1, 6};
		int[] tue = {2, 7};
		int[] wed = {3, 8};
		int[] thu = {4, 9};
		int[] fri = {5, 0};
		endNumber = new HashMap<String, int[]>();
		endNumber.put("MONDAY", mon);
		endNumber.put("TUESDAY", tue);
		endNumber.put("WEDNESDAY", wed);
		endNumber.put("THURSDAY", thu);
		endNumber.put("FRIDAY", fri);

		for (Entry<String, int[]> entry : endNumber.entrySet()) {
			if (todayWeekend.equals(entry.getKey())) {
				for (int i = 0; i < entry.getValue().length; i++) {
					if (endNum == entry.getValue()[i]) {
						return false;
					}
				}
			}
		}
		return true;
	}
	public String weekend() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("���� ��¥�� �������� �߰��� date�� ������ (�׽�Ʈ��, 0�� ���� �� today����>>");
		int plusDay = sc.nextInt();
		LocalDate today = LocalDate.now().plusDays(plusDay);// �׽�Ʈ���̸� �׽�Ʈ �ϱ� ���� �� �ּ�ó��
//		LocalDate today = LocalDate.now();�׽�Ʈ�� ���� �ּ�ó��
		return today.getDayOfWeek().name();
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.testCar(); // �׽�Ʈ���̸� �׽�Ʈ �ϱ� ���� �� �ּ�ó��
		D13_Vehicle_5_subtitle vs = new D13_Vehicle_5_subtitle(myCar);
	}
}

class Car {
	Random ran;
	int number;
	ArrayList<String> vehicleType = new ArrayList<String>();
	String carType;

	public Car() {
		ran = new Random();
		this.number = ran.nextInt(9000) + 1000;// 1000~9999 ������
		Collections.addAll(vehicleType, "LightCar", "Disabled", "InfantRide", "MidsizeCar", "LargeCar", "Sedan",
				"SemiMediumCar");
		// �տ� 3���� ����, ���Ƶ���, ��������̹Ƿ� ���� �ڿ� 4���� ������, ������, ����, ���������� ���� 5������ �ɸ�

		this.carType = vehicleType.get(ran.nextInt(7)); // ������
		System.out.printf("���� ���� ���� :%s ��ȣ :%d\n", carType, number);
	}

	public void testCar() {
		this.number = MyScanner.inputInt("���� ��ȣ�� �Է�>> ");
		switch (MyScanner.inputInt("1�� : ��������, 2�� : �Ϲ� ����>>")) {
		case 1:
			this.carType = vehicleType.get(0);// �׽�Ʈ��
			break;
		case 2:
			this.carType = vehicleType.get(3);// �׽�Ʈ��
			break;
		default:
			break;
		}
	}

}