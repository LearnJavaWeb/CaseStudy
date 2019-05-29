package thinhluffy.com.inotes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import thinhluffy.com.inotes.model.Note;

@Repository
public interface NoteRepository extends PagingAndSortingRepository<Note, Integer> {
    Page<Note> findAllByTitleContaining(String title, Pageable pageable);

    Page<Note> findAllByTitleContainingAndNoteType_Id(String title, Pageable pageable);
}
