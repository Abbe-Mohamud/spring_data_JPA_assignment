package se.lexicon.spring_data_jpa_assignment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.lexicon.spring_data_jpa_assignment.model.Ingredient;

import java.util.Collection;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {


    @Query("select i from Ingredient i where i.ingredientName = ?1")
    Collection<Ingredient> findByIngredientName(String ingredientName);

    @Query("select i from Ingredient i where i.ingredientName like %?1%")
    Collection<Ingredient> findIngredientByIngredientNameContaining (String ingredientName);



}
