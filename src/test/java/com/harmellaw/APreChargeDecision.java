package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class APreChargeDecision {

    PreChargeDecision myPreChargeDecision;

    @BeforeEach
    public void setup() {
        myPreChargeDecision = new PreChargeDecision();
    }

    // TODO: isRequestedByThePolice
    // TODO: collectsAdvice
    // TODO: collectsReminders
    //

    @Test
    public void shouldRecordAlternativeCharge_AdviceAgainstSuspects() {
        // Make assertions

        myPreChargeDecision.recordAlternateChargeAdvice(new Advice(currentCharge, alternateCharge, "This is the alternate charge advice"),
                                                        new Suspect());

        assertThatChargeAdviceWasRecorded
    }
    
    @Test
    public void shoudRecordDisclosureManagementReminders() {
        // Make assertions
    }
}
