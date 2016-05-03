package com.edu.qdu.game_caiquan;

public abstract class Player {

	//定义属性
	private String playerName;//玩家姓名
	private int winningTimes=0;//获胜次数
	private String fist;
	private int num;
	//定义方法
	public abstract String inputName();//输入姓名
	public abstract String myFist();//出拳
	//封装
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
