package rs.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  rs.springframework.
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private String id;
    private String description;
}
