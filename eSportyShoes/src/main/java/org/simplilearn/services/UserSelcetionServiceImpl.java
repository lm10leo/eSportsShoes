package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.UserSelection;
import org.simplilearn.repositories.UserSelectionRepository;
import org.springframework.stereotype.Service;

@Service
public class UserSelcetionServiceImpl implements UserSelectionService {

    private final UserSelectionRepository userSelectionRepository;

    public UserSelcetionServiceImpl(UserSelectionRepository userSelectionRepository) {
        this.userSelectionRepository = userSelectionRepository;
    }

    @Override
    public UserSelection saveUserSelection(UserSelection userSelection) {
        
        return userSelectionRepository.save(userSelection);
    }

    @Override
    public List<UserSelection> getAllUserSelections() {
       
        return userSelectionRepository.findAll();
    }

	
    
    
}
