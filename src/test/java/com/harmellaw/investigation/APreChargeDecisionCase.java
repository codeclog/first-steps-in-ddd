package com.harmellaw.investigation;

import com.harmellaw.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecisionCase {

    private Suspect suspect;
    private PreChargeDecisionCase preChargeDecisionCase;
    private OffenceAdvice offenceAdvice;
    private Set<Suspect> suspects;

    @BeforeEach
    public void setup() {
        PNCId pncId = new PNCId("ANOTHER_PNC_ID");
        suspect = new Suspect();
        suspects = new HashSet<>();
        suspects.add(suspect);
        preChargeDecisionCase = new PreChargeDecisionCase(pncId, suspects);
        offenceAdvice = new OffenceAdvice();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        preChargeDecisionCase.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, preChargeDecisionCase.getOffenceAdviceFor(suspect));
    }
}
