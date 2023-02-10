package com.jawad.mynotes1.listeners;

import com.jawad.mynotes1.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
