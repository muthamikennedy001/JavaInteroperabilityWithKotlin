package com.rsk.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Meeting {
    private String title;
    //@NotNull restricts the title so that it cannot be null
    public void addTitle(@NotNull String title){
        this.title=title;
    }
    /*
    @Nullable avids getting nullPointerException
     when we try to access title from organizer.kt
    */
    public @Nullable String meetingTitle(){
        return title;
    }
    public String titleCanBeNull(){
        return title;
    }
}
