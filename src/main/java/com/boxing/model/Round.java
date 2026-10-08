package com.boxing.model;

import java.util.List;

public class Round {
    private int round_num;
    private int tie_status;
    private int red_kd;
    private int blue_kd;
    private int red_warn;
    private int blue_warn;
    private int round_status;

    private List<Score> score_list;

	public int getRound_num() {
		return round_num;
	}

	public void setRound_num(int round_num) {
		this.round_num = round_num;
	}

	public int getTie_status() {
		return tie_status;
	}

	public void setTie_status(int tie_status) {
		this.tie_status = tie_status;
	}

	public int getRed_kd() {
		return red_kd;
	}

	public void setRed_kd(int red_kd) {
		this.red_kd = red_kd;
	}

	public int getBlue_kd() {
		return blue_kd;
	}

	public void setBlue_kd(int blue_kd) {
		this.blue_kd = blue_kd;
	}

	public int getRed_warn() {
		return red_warn;
	}

	public void setRed_warn(int red_warn) {
		this.red_warn = red_warn;
	}

	public int getBlue_warn() {
		return blue_warn;
	}

	public void setBlue_warn(int blue_warn) {
		this.blue_warn = blue_warn;
	}

	public int getRound_status() {
		return round_status;
	}

	public void setRound_status(int round_status) {
		this.round_status = round_status;
	}

	public List<Score> getScore_list() {
		return score_list;
	}

	public void setScore_list(List<Score> score_list) {
		this.score_list = score_list;
	}

    
}