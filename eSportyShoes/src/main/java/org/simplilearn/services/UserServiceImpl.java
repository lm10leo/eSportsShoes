package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.User;
import org.simplilearn.models.LoginModel;
import org.simplilearn.models.UserModel;
import org.simplilearn.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(UserModel userModel) {
        User user = new User();
        user.setFirst_name(userModel.getFirstName());
        user.setLast_name(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setUsername(userModel.getUsername());
        user.setPassword(userModel.getPassword());
        user.setUserType("CUSTOMER");
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User validateUser(LoginModel loginModel) {
        User user = userRepository.findByUsernameAndPassword(loginModel.getUsername(), loginModel.getPassword());
        return user;
    }

    @Override
    public User validateUser(UserModel userModel) {
        User user = userRepository.findByUsernameAndPassword(userModel.getUsername(), userModel.getPassword());
        return user;
  
    }

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findUserByEmail(String currentUserName) {
		// TODO Auto-generated method stub
		return null;
	}
}
