package com.harmellaw.preparation;

import com.harmellaw.PNCId;
import com.harmellaw.preparation.Defendant;

import java.util.HashSet;
import java.util.Set;

public class PoliceCaseFile {

    public PNCId pncId;
    public Set<Defendant> defendants = new HashSet<>();

    public PoliceCaseFile(PNCId pncId, Defendant defendant) {
        this.pncId = pncId;
        this.defendants.add(defendant);
    }
}
