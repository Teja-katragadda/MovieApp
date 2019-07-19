package com.practice.marvelcomics;

public class MarvelItemViewModel {

    private String name;
    private String realname;
    private String team;
    private String publisher;

    public MarvelItemViewModel() {

    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
