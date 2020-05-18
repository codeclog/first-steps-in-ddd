package com.harmellaw;

import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.Defendant;
import com.harmellaw.preparation.PoliceCaseFile;
import com.harmellaw.preparation.TrialPreparationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheTrialPreparationService {

    private TrialPreparationService theTrialPreparationService;
    private PNCId pncId;
    private Defendant defendant;
    private PoliceCaseFile policeCaseFile;

    @BeforeEach
    public void setup() {
        theTrialPreparationService = new TrialPreparationService();
        pncId = new PNCId("AN-ID");
        defendant = new Defendant();
    }

    @Test
    public void shouldCreateACriminalCaseWhenAPoliceCaseFileIsAccepted() {
        policeCaseFile = new PoliceCaseFile(pncId, defendant);

        CriminalCase criminalCase = theTrialPreparationService.acceptCaseFile(policeCaseFile);

        assertEquals(pncId, criminalCase.pncId);
        assertEquals(policeCaseFile.defendants, criminalCase.defendants);
    }

}
