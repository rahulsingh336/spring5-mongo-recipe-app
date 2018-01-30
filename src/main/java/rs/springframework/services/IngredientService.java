package  rs.springframework.services;

import  rs.springframework.commands.IngredientCommand;

/**
 *  rs.springframework on 6/27/17.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String recipeId, String idToDelete);
}
