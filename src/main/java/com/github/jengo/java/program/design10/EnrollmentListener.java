package com.github.jengo.java.program.design10;

public interface EnrollmentListener extends java.util.EventListener {
    /** Handle an EnrollemntEvent, to be implemented by a listener */
    public void enrollmentExceeded(EnrollmentEvent e);
}
