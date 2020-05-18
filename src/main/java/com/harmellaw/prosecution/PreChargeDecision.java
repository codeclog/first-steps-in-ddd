package com.harmellaw.prosecution;

import com.harmellaw.investigation.Suspect;
import com.harmellaw.investigation.SuspectNotInThisInvestigationException;
import com.harmellaw.prosecution.OffenceAdvice;

import java.util.HashMap;
import java.util.Map;

public class PreChargeDecision {
    private Map<Suspect, OffenceAdvice> offenceAdvice = new HashMap<>();

    public PreChargeDecision(Suspect suspect) {
        offenceAdvice.put(suspect, null);
    }

    public OffenceAdvice getOffenceAdviceFor(Suspect suspect) {
        return offenceAdvice.get(suspect);
    }

    public void noteAlternativeOffenceAdvice(Suspect suspect, OffenceAdvice advice) {
        if (offenceAdvice.containsKey(suspect)) {
            offenceAdvice.put(suspect, advice);
        } else {
            throw new SuspectNotInThisInvestigationException();
        }
    }

    public boolean includesSuspect(Suspect suspect) {
        return offenceAdvice.containsKey(suspect);
    }
}
