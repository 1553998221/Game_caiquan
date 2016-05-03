package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Person extends Player{
	String name;
	Scanner input = new Scanner(System.in);
	//玩家类方法重写
		public String inputName(){
			return name;
		}
		public String myFist(){
			System.out.println("请出拳：1、剪刀 2、石头 3、布（输入相应数字）：");
			setNum(input.nextInt());
			switch (getNum()) {
			case 1:
				setFist("剪刀");
				break;
			case 2:
				setFist("石头");
				break;
			case 3:
				setFist("布");
				break;

			default:
				break;
			}
			return getFist();
		}

}
