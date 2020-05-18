package com.harmellaw.preparation;

import com.harmellaw.preparation.CriminalCase;
import com.harmellaw.preparation.PoliceCaseFile;

public class TrialPreparationService {
    public CriminalCase acceptCaseFile(PoliceCaseFile policeCaseFile) {
        return new CriminalCase(policeCaseFile.pncId, policeCaseFile.defendants);
    }
}
