package org.simplilearn.repositories;

import org.simplilearn.entities.UserSelection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSelectionRepository extends JpaRepository<UserSelection, Long> {
	
	

}
