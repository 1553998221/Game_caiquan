package com.edu.qdu.game_caiquan;

import java.util.Scanner;

public class Judge {
	Scanner input = new Scanner(System.in);
	//��������
		private int total=0;
		private Person person = new Person();
		private Computer computer = new Computer();
		static String y = "y";
		String yn = null;
		int pingju = 0;
		//���巽��
		//��ʼ��Ϸ
		public void startGame(){
			System.out.println("\t\t*******************");
			System.out.println("\t\t**     ��ȭ��Ϸ              **");
			System.out.println("\t\t*******************");
			System.out.println();
			System.out.println("��Ϸ����1������1��ʯͷ3����");
		}
		//��������
		public void askName(){
			computer.inputName();
			System.out.println("���������������");
			person.setPlayerName(input.next());
			System.out.println(person.getPlayerName()+"  vs "+computer.getPlayerName());
		}
		//������Ϸ
		public void playGame(){
			do{
			person.myFist();
			System.out.println("���ȭ��"+person.getFist());
			computer.myFist();
			System.out.println(computer.getPlayerName()+"��ȭ��"+computer.getFist());
			if((person.getNum()-computer.getNum())==1||(person.getNum()-computer.getNum())==-2){
				System.out.println("�������ϲ�㣡��Ӯ�ˣ�");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else if(person.getNum()==computer.getNum()){
				System.out.println("�����ƽ�֣�");
				pingju++;
			}else{
				System.out.println("����������ˣ�");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			System.out.println("�Ƿ�ʼ��һ�֣�y/n��:");
			yn = input.next();
			total++;
			}while(yn.equals(y));
		}
		//��ʾ���
		public void finalResult(){
			System.out.println(computer.getPlayerName()+" vs "+person.getPlayerName());
			System.out.println("��ս������"+total);
			System.out.println();
			System.out.println("����\t�÷�");
			System.out.println(person.getPlayerName()+"\t"+person.getWinningTimes());
			System.out.println(computer.getPlayerName()+"\t"+computer.getWinningTimes());
		}
		//��װ
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
			System.out.println("Ҫ��ʼ�𣿣�y/n��");
			String yn = input.next();
			if (yn.equals(y)) {
				System.out.println();
			}else{
				System.out.println("��Ϸ������");
			}
			judge.playGame();
			judge.finalResult();
		}
}
