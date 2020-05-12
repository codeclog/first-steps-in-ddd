package com.harmellaw;

public class OffenceAdvice {

    private final CriminalOffence currentOffence;
    private final CriminalOffence suggestedOffence;
    private final String adviceText;

    public OffenceAdvice(CriminalOffence currentOffence, CriminalOffence suggestedOffence, String adviceText) {
        this.currentOffence = currentOffence;
        this.suggestedOffence = suggestedOffence;
        this.adviceText = adviceText;
    }
}
