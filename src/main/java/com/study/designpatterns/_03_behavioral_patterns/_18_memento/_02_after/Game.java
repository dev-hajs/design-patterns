package com.study.designpatterns._03_behavioral_patterns._18_memento._02_after;

public class Game {

    private int redTeamScore;
    private int blueTeamScore;

    public int getRedTeamScore() {
        return redTeamScore;
    }

    public void setRedTeamScore(int redTeamScore) {
        this.redTeamScore = redTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public void setBlueTeamScore(int blueTeamScore) {
        this.blueTeamScore = blueTeamScore;
    }

    public GameSave save() {
        return new GameSave(this.blueTeamScore, this.redTeamScore);
    }

    public void restore(GameSave gameSave) {
        this.redTeamScore = gameSave.getRedTeamScore();
        this.blueTeamScore = gameSave.getBlueTeamScore();
    }
}
