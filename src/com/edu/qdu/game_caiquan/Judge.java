package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Judge {
	Scanner input = new Scanner(System.in);
	//定义属性
		private int total=0;
		private Person person = new Person();
		private Computer computer = new Computer();
		static String y = "y";
		String yn = null;
		int pingju = 0;
		//定义方法
		//开始游戏
		public void startGame(){
			System.out.println("\t\t*******************");
			System.out.println("\t\t**     猜拳游戏              **");
			System.out.println("\t\t*******************");
			System.out.println();
			System.out.println("游戏规则：1、剪刀1、石头3、布");
		}
		//输入姓名
		public void askName(){
			computer.inputName();
			System.out.println("请输入你的姓名：");
			person.setPlayerName(input.next());
			System.out.println(person.getPlayerName()+"  vs "+computer.getPlayerName());
		}
		//进行游戏
		public void playGame(){
			do{
			person.myFist();
			System.out.println("你出拳："+person.getFist());
			computer.myFist();
			System.out.println(computer.getPlayerName()+"出拳："+computer.getFist());
			if((person.getNum()-computer.getNum())==1||(person.getNum()-computer.getNum())==-2){
				System.out.println("结果：恭喜你！你赢了！");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else if(person.getNum()==computer.getNum()){
				System.out.println("结果：平局！");
				pingju++;
			}else{
				System.out.println("结果：你输了！");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			System.out.println("是否开始下一轮（y/n）:");
			yn = input.next();
			total++;
			}while(yn.equals(y));
		}
		//显示结果
		public void finalResult(){
			System.out.println(computer.getPlayerName()+" vs "+person.getPlayerName());
			System.out.println("对战次数："+total);
			System.out.println();
			System.out.println("姓名\t得分");
			System.out.println(person.getPlayerName()+"\t"+person.getWinningTimes());
			System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes());
		}
		//封装
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		public Computer getComputer() {
			return computer;
		}
		public void setComputer(Computer computer) {
			this.computer = computer;
		}
		
		public static void main(String[] args) {
			Judge judge = new Judge();
			Scanner input = new Scanner(System.in);
			judge.startGame();
			judge.askName();
			System.out.println("要开始吗？（y/n）");
			String yn = input.next();
			if (yn.equals(y)) {
				System.out.println();
			}else{
				System.out.println("游戏结束！");
			}
			judge.playGame();
			judge.finalResult();
		}
}
