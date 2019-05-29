package thinhluffy.com.inotes.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thinhluffy.com.inotes.model.Note;

import java.util.Optional;

public interface NoteService {
    Page<Note> findAll(Pageable pageable);

    Page<Note> findAllByTitleContaining(String title, Pageable pageable);

    Page<Note> findAllByTitleContainingAndNoteType_Id(String title, Integer noteTypeId, Pageable pageable);

    void save(Note note);

    void remove(Integer id);

    Optional<Note> findById(Integer id);
}
