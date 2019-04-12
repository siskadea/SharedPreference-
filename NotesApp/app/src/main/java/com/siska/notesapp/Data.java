package com.siska.notesapp;

import com.siska.notesapp.models.Note;
import com.siska.notesapp.models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {
    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("adi", "rahasia"));
        users.add(new User("budi", "rahasia"));
        users.add(new User("candra", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Android 1", new Date(), "Saya belajar Shared Preference"));
        notes.add(new Note("Android 2", new Date(), "Saya belajar Shared Preference"));
        notes.add(new Note("Android 3", new Date(), "Saya belajar Shared Preference"));
        notes.add(new Note("Android 4", new Date(), "Saya belajar Shared Preference"));
    }
    public static List<User> getUsers(){
        return users;
    }
    public static List<Note> getNotes(){
        return notes;
    }
}
