package com.example.demo.core.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface IWorkEntry {
    LocalDate getDate();
    void setDate(LocalDate date);
    LocalTime getStartTime();
    void setStartTime(LocalTime startTime);
    LocalTime getEndTime();
    void setEndTime(LocalTime endTime);
    boolean addBreak(IBreak newBreak);
    List<IBreak> getBreaks();
    long calculateWorkedMinutes();
    long calculateWorkedHours();
}
