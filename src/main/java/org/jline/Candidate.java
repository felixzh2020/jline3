package org.jline;

import static org.jline.utils.Preconditions.checkNotNull;

public class Candidate implements Comparable<Candidate> {

    private final String value;
    private final String displ;
    private final String group;
    private final String descr;
    private final boolean complete;

    public Candidate(String value) {
        this(value, value, null, null, true);
    }

    public Candidate(String value, String displ, String group, String descr, boolean complete) {
        checkNotNull(value);
        this.value = value;
        this.displ = displ;
        this.group = group;
        this.descr = descr;
        this.complete = complete;
    }

    public String value() {
        return value;
    }

    public String displ() {
        return displ;
    }

    public String group() {
        return group;
    }

    public String descr() {
        return descr;
    }

    public boolean complete() {
        return complete;
    }

    @Override
    public int compareTo(Candidate o) {
        return value.compareTo(o.value);
    }
}
