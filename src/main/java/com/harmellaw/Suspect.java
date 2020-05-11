package com.harmellaw;

public class Suspect {
    public final Offence offence;
    public String alternativeChargeAdvice;

    public Suspect(Offence offence) {
        this.offence = offence;
    }

    public void recordAlternativeChargeAdvice(String alternativeChargeAdvice) {
        this.alternativeChargeAdvice = alternativeChargeAdvice;
    }
}
