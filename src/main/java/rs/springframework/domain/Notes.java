package rs.springframework.domain;

import lombok.Getter;
import lombok.Setter;


/**
 *  rs.springframework
 */
@Getter
@Setter
public class Notes {

    private String id;
    private Recipe recipe;
    private String recipeNotes;

}
