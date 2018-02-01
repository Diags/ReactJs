package com.agixis.idees.services;

import com.agixis.idees.entities.Idea;
import com.agixis.idees.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class IdeaServiceImp implements IdeaService {

    @Autowired
    IdeaRepository ideaRepository;

    @Override
    public List<Idea> getAllIdea() {
        return ideaRepository.findAll();
    }

    @Override
    public Idea create(Idea ideaToCreate) {
        return ideaRepository.save(ideaToCreate);
    }

    @Override
    public Idea update(Idea ideaToUpdate) {
        return ideaRepository.save(ideaToUpdate);
    }

    @Override
    public void delete(@NotNull Idea ideaToDelete) {
         ideaRepository.delete(ideaToDelete);
    }

    @Override
    public Integer like(Idea ideaToLike) {
        return null;
    }

    @Override
    public Integer disLike(Idea ideaToDislike) {
        return null;
    }
}
