package com.harmellaw;

import com.harmellaw.investigation.PoliceInvestigation;
import com.harmellaw.investigation.PreChargeDecisionCase;
import com.harmellaw.investigation.Suspect;
import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThePublicProsecutionService {

    private PublicProsecutionService thePps;
    private PNCId pncId;
    private Suspect suspect;
    private PoliceInvestigation policeInvestigation;

    @BeforeEach
    public void setup() {
        thePps = new PublicProsecutionService();
        pncId = new PNCId("AN-ID");
        suspect = new Suspect();
        policeInvestigation = new PoliceInvestigation(pncId, suspect);
    }

    @Test
    public void shouldCreateAPreChargeDecisionCaseWhenReceivingAPcdRequest() {
        PreChargeDecisionCase pcdCase = thePps.receiveRequestForPreChargeDecision(policeInvestigation);

        assertEquals(pncId, pcdCase.pncId);
        assertEquals(policeInvestigation.suspects, pcdCase.getSuspects());
    }

    @Test
    public void shouldCreateACriminalCaseWhenAPoliceCaseFileIsAccepted() {
        Defendant defendant = new Defendant();
        PoliceCaseFile policeCaseFile = new PoliceCaseFile(pncId, defendant);

        CriminalCase criminalCase = thePps.acceptCaseFile(policeCaseFile);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeCaseFile.defendants, criminalCase.defendants);
    }

}
