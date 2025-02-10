package com.example.demo.core.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public interface IBreak {
    LocalDate getDate();
    void setDate(LocalDate date);
    LocalTime getStartTime();
    void setStartTime(LocalTime startTime);
    LocalTime getEndTime();
    void setEndTime(LocalTime endTime);
    long calculateBreakMinutes();
    long calculateBreakHours();
}
