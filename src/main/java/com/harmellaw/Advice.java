package com.harmellaw;

public class Advice {
    private final CriminalOffence currentOffence;
    private final CriminalOffence alternateOffence;
    private final String adviceText;

    public Advice(CriminalOffence currentOffence, CriminalOffence alternateOffence, String adviceText) {
        this.currentOffence = currentOffence;
        this.alternateOffence = alternateOffence;
        this.adviceText = adviceText;
    }
}
