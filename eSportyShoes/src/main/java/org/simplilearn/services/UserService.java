package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.User;
import org.simplilearn.models.LoginModel;
import org.simplilearn.models.UserModel;

public interface UserService {

    List<User> getAllUsers();

    User registerUser(UserModel userModel);

    User validateUser(LoginModel loginModel);

    User validateUser(UserModel userModel);

    User findUserByEmail(String currentUserName);
}
