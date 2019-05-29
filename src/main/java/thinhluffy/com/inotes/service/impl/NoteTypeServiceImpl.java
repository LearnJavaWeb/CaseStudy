package thinhluffy.com.inotes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thinhluffy.com.inotes.model.NoteType;
import thinhluffy.com.inotes.repository.NoteTypeRepository;
import thinhluffy.com.inotes.service.NoteTypeService;

import java.util.Optional;

@Service("noteTypeService")
public class NoteTypeServiceImpl implements NoteTypeService {

    @Autowired
    private NoteTypeRepository noteTypeRepository;

    @Override
    public Iterable<NoteType> findAll() {
        return noteTypeRepository.findAll();
    }

    @Override
    public void save(NoteType noteType) {
        noteTypeRepository.save(noteType);
    }

    @Override
    public void remove(int id) {
        noteTypeRepository.deleteById(id);
    }

    @Override
    public Optional<NoteType> findById(Integer id) {
        return noteTypeRepository.findById(id);
    }
}
