package com.agixis.idees.services;

import com.agixis.idees.entities.Idea;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface IdeaService {

    /**
     * @return la liste de toutes les idées
     */
    List<Idea> getAllIdea();


    /**
     * Permet de créer une nouvelle idée
     *
     * @param ideaToCreate l'idée à créer
     * @return la nouvelle idée qui a été créée
     */
    Idea create(Idea ideaToCreate);


    /**
     * Permet de mettre à jour une idée
     *
     * @param ideaToUpdate l'idée à mettre à jour
     * @return idée qui a été modifiée
     */
    Idea update(Idea ideaToUpdate);


    /**
     * Permet de supprimer une idée
     *
     * @param ideaToDelete l'idée à supprimer
     */
    void delete(@NotNull Idea ideaToDelete);


    /**
     * Permet de d'incrémenter le conteur de like de idea passée en parametre
     *
     * @param ideaToLike l'idée à "liker"
     * @return le nombre le like total de @param ideaToLike
     */
    Integer like(Idea ideaToLike);


    /**
     * <p>
     *  Permet de décrémenter le conteur de like de idea passée en parametre
     * </p>
     *
     * @param ideaToDislike l'idée à "liker"
     * @return le nombre le like total de @param ideaToDislike
     */
    Integer disLike(Idea ideaToDislike);


}
