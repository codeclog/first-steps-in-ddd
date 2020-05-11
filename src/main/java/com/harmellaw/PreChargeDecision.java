package com.harmellaw;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {

    public Map<Suspect, Advice> alternateChargeAdvice = new HashMap<Suspect, Advice>();

    public void recordAlternateChargeAdvice(Suspect suspect, Advice advice) {
        alternateChargeAdvice.put(suspect, advice);
    }
}
