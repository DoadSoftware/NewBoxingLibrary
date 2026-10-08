package com.boxing.model;

public class Score {
    private String judge_name;
    private int judge_num;
    private String judge_code;
    private int red_round_score;
    private int blue_round_score;
	public String getJudge_name() {
		return judge_name;
	}
	public void setJudge_name(String judge_name) {
		this.judge_name = judge_name;
	}
	public int getJudge_num() {
		return judge_num;
	}
	public void setJudge_num(int judge_num) {
		this.judge_num = judge_num;
	}
	public String getJudge_code() {
		return judge_code;
	}
	public void setJudge_code(String judge_code) {
		this.judge_code = judge_code;
	}
	public int getRed_round_score() {
		return red_round_score;
	}
	public void setRed_round_score(int red_round_score) {
		this.red_round_score = red_round_score;
	}
	public int getBlue_round_score() {
		return blue_round_score;
	}
	public void setBlue_round_score(int blue_round_score) {
		this.blue_round_score = blue_round_score;
	}
}