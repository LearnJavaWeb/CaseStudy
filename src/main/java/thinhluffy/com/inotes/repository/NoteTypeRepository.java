package thinhluffy.com.inotes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thinhluffy.com.inotes.model.NoteType;

@Repository
public interface NoteTypeRepository extends CrudRepository<NoteType, Integer> {
}
