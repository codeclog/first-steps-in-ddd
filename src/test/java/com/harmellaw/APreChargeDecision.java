package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.harmellaw.CriminalOffence.ARMED_ROBBERY;
import static com.harmellaw.CriminalOffence.DANGEROUS_DRIVING;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        Suspect mySuspect = new Suspect();
        PreChargeDecision myPreChargeDecision = new PreChargeDecision();
        OffenceAdvice myOffenceAdvice = new OffenceAdvice(ARMED_ROBBERY, DANGEROUS_DRIVING, "Far more likely to convict them on this change.");

        myPreChargeDecision.noteAlternativeOffenceAdvice(mySuspect, myOffenceAdvice);

        assertEquals(myOffenceAdvice, myPreChargeDecision.getOffenceAdviceFor(mySuspect));
    }

    @Test
    public void shouldRecordDisclosureManagementReminders() {
        // TODO: Make assertions
    }
}
