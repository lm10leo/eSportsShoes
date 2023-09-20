package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.UserSelection;

public interface UserSelectionService {
    UserSelection saveUserSelection(UserSelection userSelection);

    List<UserSelection> getAllUserSelections();

   

    

    
}

