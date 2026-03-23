package model;

import java.time.LocalDate;
import java.util.List;

//testee

public class Day {
    private final int id;
    private final LocalDate date;
    private final Humor humor;
    private List<String> comments;
    private final int noteOfTheDay;

    public Day(int id, LocalDate date, Humor humor, int noteOfTheDay){
        this.id = id;
        this.date = date;
        this.humor = humor;
        this.noteOfTheDay = noteOfTheDay;
    }

    public int getId(){
        return id;
    }

    public Humor getHumor() { return humor; }

    public LocalDate getDate() { return date; }

    public int getNoteOfTheDay(){
        return noteOfTheDay;
    }
}
