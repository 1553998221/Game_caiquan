package com.edu.qdu.game_caiquan;

public abstract class Player {

	//��������
	private String playerName;//�������
	private int winningTimes=0;//��ʤ����
	private String fist;
	private int num;
	//���巽��
	public abstract String inputName();//��������
	public abstract String myFist();//��ȭ
	//��װ
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	public String getFist() {
		return fist;
	}
	public void setFist(String fist) {
		this.fist = fist;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
