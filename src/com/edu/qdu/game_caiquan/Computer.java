package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Computer extends Player{
	String name;
	Scanner input = new Scanner(System.in);
	//电脑类方法重写
	public String inputName(){
		System.out.println("请选择对方角色（1、刘备   2、孙权   3、曹操）：");
		int sel = input.nextInt();
		switch (sel) {
		case 1:
			setPlayerName("刘备");
			break;
		case 2:
			setPlayerName("孙权");
			break;
		case 3:
			setPlayerName("曹操");
			break;

		default:
			break;
		}
		return getPlayerName();
	}
	public String myFist(){
		setNum((int)(Math.random()*3+1)); 
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

