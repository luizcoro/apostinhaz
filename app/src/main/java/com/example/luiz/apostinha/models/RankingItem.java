package com.example.luiz.apostinha.models;

/**
 * Created by luiz on 4/15/16.
 */
public class RankingItem {
    private int position;
    private String name;

    public RankingItem(int position, String name) {
        this.position = position;
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
