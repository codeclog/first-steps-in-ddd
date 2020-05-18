package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecision {

    private Suspect mySuspect;
    private PreChargeDecision myPreChargeDecision;
    private OffenceAdvice myOffenceAdvice;

    @BeforeEach
    public void setup() {
        mySuspect = new Suspect();
        myPreChargeDecision = new PreChargeDecision();
        myOffenceAdvice = new OffenceAdvice();
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        myPreChargeDecision.recordAlternativeOffenceAdvice(mySuspect, myOffenceAdvice);

        assertEquals(myOffenceAdvice, myPreChargeDecision.getOffenceAdviceFor(mySuspect));
    }

}
