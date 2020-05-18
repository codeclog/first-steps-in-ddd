package com.harmellaw;

import com.harmellaw.prosecution.OffenceAdvice;
import com.harmellaw.prosecution.PreChargeDecision;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.investigation.SuspectNotInThisInvestigationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.harmellaw.investigation.CriminalOffence.ARMED_ROBBERY;
import static com.harmellaw.investigation.CriminalOffence.DANGEROUS_DRIVING;
import static org.junit.jupiter.api.Assertions.*;

public class APreChargeDecision {

    private PreChargeDecision myPreChargeDecision;
    private Suspect mySuspect;
    private OffenceAdvice myOffenceAdvice;

    @BeforeEach
    public void setup() {
        mySuspect = new Suspect();
        myPreChargeDecision = new PreChargeDecision(mySuspect);
    }

    @Test
    public void knowsWhoTheSuspectsAre() {
        assertTrue(myPreChargeDecision.includesSuspect(mySuspect));
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {

        myOffenceAdvice = new OffenceAdvice(ARMED_ROBBERY, DANGEROUS_DRIVING, "Far more likely to convict them on this change.");

        myPreChargeDecision.noteAlternativeOffenceAdvice(mySuspect, myOffenceAdvice);

        assertEquals(myOffenceAdvice, myPreChargeDecision.getOffenceAdviceFor(mySuspect));
    }

    @Test
    public void shouldntAllowAdviceToBeAddedAgainstSuspectsNotNamedInTheCase() {
        myOffenceAdvice = new OffenceAdvice(ARMED_ROBBERY, DANGEROUS_DRIVING, "Far more likely to convict them on this change.");

        assertThrows(SuspectNotInThisInvestigationException.class, () -> {
            myPreChargeDecision.noteAlternativeOffenceAdvice(new Suspect(), myOffenceAdvice);
        });
    }

    // TODO: think: is DRY my friend here?
    @Test
    public void refersToASingleCriminalCase() {
        // TODO: PRE-CHARGE-DECISION-REQUEST
    }

    // TODO: remove this as it's a distraction
    @Test
    public void shouldRecordDisclosureManagementReminders() {
        // TODO: Make assertions
    }
}
