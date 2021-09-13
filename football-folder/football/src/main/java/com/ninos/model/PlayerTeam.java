package com.ninos.model;

public class PlayerTeam {

    private Long id;
    private String from;
    private String to;
    private int moneyPlayer;
    private int moneyTeam;

    public PlayerTeam() {
    }

    public PlayerTeam(Long id,String from, String to, int moneyPlayer, int moneyTeam) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.moneyPlayer = moneyPlayer;
        this.moneyTeam = moneyTeam;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getMoneyPlayer() {
        return moneyPlayer;
    }

    public void setMoneyPlayer(int moneyPlayer) {
        this.moneyPlayer = moneyPlayer;
    }

    public int getMoneyTeam() {
        return moneyTeam;
    }

    public void setMoneyTeam(int moneyTeam) {
        this.moneyTeam = moneyTeam;
    }
}
