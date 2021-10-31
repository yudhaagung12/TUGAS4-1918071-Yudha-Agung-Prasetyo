package com.example.tugas4_1918071;

public class Item {
    private String team,leader,negara;
    private int logo;

    public Item(String team, String leader, String negara, int logo) {
        this.team = team;
        this.leader = leader;
        this.negara = negara;
        this.logo = logo;
    }

    public String getNamatim() {
        return team;
    }

    public void setteam(String nama) {
        this.team = team;
    }

    public String getLeader() {return leader;}

    public void setNegara(String negara) { this.negara = negara; }

    public String getNegara(){return negara;}

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}

