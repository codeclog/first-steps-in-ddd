package com.harmellaw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeCharge_AdviceAgainstSuspects() {
        // Make assertions - make all these TODOs

        Suspect mySuspect = new Suspect(Offence.INTERFERING_WITH_A_BADGER);

        mySuspect.recordAlternativeChargeAdvice("advice goes here");

        assertNotNull(mySuspect.alternativeChargeAdvice);
    }

    // TODO: should collate all the advice against the Investigation <<<<<< WHAT IS THIS COLLATED AGAINST? (PCD Case?)
    // TODO: should be completed and sent back to the police as a "PreChargeDecision" <<<<< this could be a route into the next steps

    @Test
    public void should

    @Test
    public void shouldRecordDisclosureManagementReminders() {
        // Make assertions
    }
}
