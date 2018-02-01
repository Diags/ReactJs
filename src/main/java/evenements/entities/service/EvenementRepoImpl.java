package evenements.entities.service;

import evenements.entities.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenementRepoImpl   {
    @Autowired
    private EvenementRepository evenementRepository;

}
