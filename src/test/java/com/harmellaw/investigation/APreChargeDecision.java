package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecision {

    private Suspect suspect;
    private PreChargeDecision preChargeDecision;
    private OffenceAdvice offenceAdvice;
    private Set<Suspect> suspects;

    @BeforeEach
    public void setup() {
        PNCId pncId = new PNCId("ANOTHER_PNC_ID");
        suspect = new Suspect();
        suspects = new HashSet<>();
        suspects.add(suspect);
        preChargeDecision = new PreChargeDecision(pncId, suspects);
        offenceAdvice = new OffenceAdvice();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        preChargeDecision.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, preChargeDecision.getOffenceAdviceFor(suspect));
    }
}
