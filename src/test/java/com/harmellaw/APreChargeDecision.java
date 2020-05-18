package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        Suspect mySuspect = new Suspect();
        PreChargeDecision myPreChargeDecision = new PreChargeDecision();
        OffenceAdvice myOffenceAdvice = new OffenceAdvice();

        myPreChargeDecision.recordAlternativeOffenceAdvice(mySuspect, myOffenceAdvice);

        assertEquals(myOffenceAdvice, myPreChargeDecision.getOffenceAdviceFor(mySuspect));
    }

}
