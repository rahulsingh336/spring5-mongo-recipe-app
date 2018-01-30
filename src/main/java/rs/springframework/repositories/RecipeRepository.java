package rs.springframework.repositories;

import  rs.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 *  rs.springframework on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
