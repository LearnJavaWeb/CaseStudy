package thinhluffy.com.inotes.formatter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import thinhluffy.com.inotes.model.Note;
import thinhluffy.com.inotes.service.NoteService;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class NoteFormatter implements Formatter<Optional<Note>> {

    private NoteService noteService;

    @Autowired
    public NoteFormatter(NoteService noteService) {
        this.noteService = noteService;
    }


    @Override
    public Optional<Note> parse(String text, Locale locale) throws ParseException {
        return noteService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Optional<Note> object, Locale locale) {
        return "["+object.get()+"]";
    }
}
