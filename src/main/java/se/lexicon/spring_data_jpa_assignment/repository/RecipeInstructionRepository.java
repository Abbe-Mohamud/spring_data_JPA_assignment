package se.lexicon.spring_data_jpa_assignment.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.spring_data_jpa_assignment.model.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository <RecipeInstruction,String> {
}
