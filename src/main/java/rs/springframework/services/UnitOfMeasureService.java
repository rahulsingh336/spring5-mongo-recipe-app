package rs.springframework.services;

import  rs.springframework.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 *  rs.springframework on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
