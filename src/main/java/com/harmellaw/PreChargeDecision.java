package com.harmellaw;

import org.apache.commons.collections4.BidiMap;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {
    private Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }

    public void noteAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        offenceAdvice.put(suspect, advice);
    }
}
