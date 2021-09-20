package se.lexicon.spring_data_jpa_assignment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import se.lexicon.spring_data_jpa_assignment.model.Ingredient;
import se.lexicon.spring_data_jpa_assignment.model.Recipe;
import se.lexicon.spring_data_jpa_assignment.model.RecipeCategory;
import se.lexicon.spring_data_jpa_assignment.model.RecipeIngredient;

import java.util.Collection;
import java.util.List;

public interface RecipeRepository extends CrudRepository <Recipe, Integer> {

    @Query("select r from Recipe r where r.recipeName like %?1%")
    Collection<Recipe> findRecipesByRecipeNameContains(String recipeName);

    @Query("select r from Recipe r where r.recipeIngredients = ?1")
    Collection<Recipe> findRecipesByRecipeIngredients(List<RecipeIngredient> recipeIngredients);

    @Query("select r from Recipe r where r.categories = ?1")
    Collection<Recipe> findRecipesByCategories(List<RecipeCategory> categories);


    Collection<Recipe> findAllByCategoriesAndRecipeName(List<RecipeCategory> categories,String recipeName)


}
