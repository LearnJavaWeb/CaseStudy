package thinhluffy.com.inotes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thinhluffy.com.inotes.model.Note;
import thinhluffy.com.inotes.repository.NoteRepository;
import thinhluffy.com.inotes.service.NoteService;

import java.util.Optional;

@Service("noteService")
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteRepository noteRepository;
    @Override
    public Page<Note> findAll(Pageable pageable) {
        return noteRepository.findAll(pageable);
    }

    @Override
    public Page<Note> findAllByTitleContaining(String title, Pageable pageable) {
        return noteRepository.findAllByTitleContaining(title, pageable);
    }

    @Override
    public Page<Note> findAllByTitleContainingAndNoteType_Id(String title, Integer noteTypeId, Pageable pageable) {
        return noteRepository.findAllByTitleContainingAndNoteType_Id(title, pageable);
    }

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void remove(Integer id) {
        noteRepository.deleteById(id);
    }

    @Override
    public Optional<Note> findById(Integer id) {
        return noteRepository.findById(id);
    }
}
