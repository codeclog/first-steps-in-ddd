
package com.harmellaw;

import com.harmellaw.investigation.PNCId;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ACriminalCase {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void isCreatedFromCaseFiles() {

        PNCId pncId = new PNCId("DSFERTE");
        PoliceCaseFile aPoliceCaseFile = new PoliceCaseFile(pncId);

        // TODO: BOOM! THIS BLOWS UP THE PREVIOUS IDEA WE HAD OF A CRIMINAL CASE
        CriminalCase myCase = new CriminalCase(aPoliceCaseFile);

        assertEquals(aPoliceCaseFile.pncId, myCase.pncId);
        assertEquals(aPoliceCaseFile.suspects.size(), myCase.defendants.size());
    }

    @Test
    public void shouldDoSomething() {
        // Make assertions
    }
    
    @Test
    public void shouldDoSomething_whenSomethingElseHappens() {
        // Make assertions
    }
}
