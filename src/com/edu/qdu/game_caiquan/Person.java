package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Person extends Player{
	String name;
	Scanner input = new Scanner(System.in);
	//����෽����д
		public String inputName(){
			return name;
		}
		public String myFist(){
			System.out.println("���ȭ��1������ 2��ʯͷ 3������������Ӧ���֣���");
			setNum(input.nextInt());
			switch (getNum()) {
			case 1:
				setFist("����");
				break;
			case 2:
				setFist("ʯͷ");
				break;
			case 3:
				setFist("��");
				break;

			default:
				break;
			}
			return getFist();
		}

}
