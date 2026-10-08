package com.boxing.model;

import java.util.List;

public class MatchData {
    private String match_name;
    private String match_code;
    private int bout_num;
    private String ring_name;
    private String session_name;
    private String red_boxer_name;
    private String red_boxer_code;
    private String red_club;
    private String red_coach;
    private String blue_boxer_name;
    private String blue_boxer_code;
    private String blue_club;
    private String blue_coach;
    private String division;
    private String referee_judge_name;
    private String referee_judge_code;
    private int bout_status;
    private String win_reason;
    private int red_score;
    private int blue_score;
    private String winner;

    private List<Round> round_list;

	public String getMatch_name() {
		return match_name;
	}

	public void setMatch_name(String match_name) {
		this.match_name = match_name;
	}

	public String getMatch_code() {
		return match_code;
	}

	public void setMatch_code(String match_code) {
		this.match_code = match_code;
	}

	public int getBout_num() {
		return bout_num;
	}

	public void setBout_num(int bout_num) {
		this.bout_num = bout_num;
	}

	public String getRing_name() {
		return ring_name;
	}

	public void setRing_name(String ring_name) {
		this.ring_name = ring_name;
	}

	public String getSession_name() {
		return session_name;
	}

	public void setSession_name(String session_name) {
		this.session_name = session_name;
	}

	public String getRed_boxer_name() {
		return red_boxer_name;
	}

	public void setRed_boxer_name(String red_boxer_name) {
		this.red_boxer_name = red_boxer_name;
	}

	public String getRed_boxer_code() {
		return red_boxer_code;
	}

	public void setRed_boxer_code(String red_boxer_code) {
		this.red_boxer_code = red_boxer_code;
	}

	public String getRed_club() {
		return red_club;
	}

	public void setRed_club(String red_club) {
		this.red_club = red_club;
	}

	public String getRed_coach() {
		return red_coach;
	}

	public void setRed_coach(String red_coach) {
		this.red_coach = red_coach;
	}

	public String getBlue_boxer_name() {
		return blue_boxer_name;
	}

	public void setBlue_boxer_name(String blue_boxer_name) {
		this.blue_boxer_name = blue_boxer_name;
	}

	public String getBlue_boxer_code() {
		return blue_boxer_code;
	}

	public void setBlue_boxer_code(String blue_boxer_code) {
		this.blue_boxer_code = blue_boxer_code;
	}

	public String getBlue_club() {
		return blue_club;
	}

	public void setBlue_club(String blue_club) {
		this.blue_club = blue_club;
	}

	public String getBlue_coach() {
		return blue_coach;
	}

	public void setBlue_coach(String blue_coach) {
		this.blue_coach = blue_coach;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getReferee_judge_name() {
		return referee_judge_name;
	}

	public void setReferee_judge_name(String referee_judge_name) {
		this.referee_judge_name = referee_judge_name;
	}

	public String getReferee_judge_code() {
		return referee_judge_code;
	}

	public void setReferee_judge_code(String referee_judge_code) {
		this.referee_judge_code = referee_judge_code;
	}

	public int getBout_status() {
		return bout_status;
	}

	public void setBout_status(int bout_status) {
		this.bout_status = bout_status;
	}

	public String getWin_reason() {
		return win_reason;
	}

	public void setWin_reason(String win_reason) {
		this.win_reason = win_reason;
	}

	public int getRed_score() {
		return red_score;
	}

	public void setRed_score(int red_score) {
		this.red_score = red_score;
	}

	public int getBlue_score() {
		return blue_score;
	}

	public void setBlue_score(int blue_score) {
		this.blue_score = blue_score;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public List<Round> getRound_list() {
		return round_list;
	}

	public void setRound_list(List<Round> round_list) {
		this.round_list = round_list;
	}
}