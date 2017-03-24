/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dto.User;
import java.util.HashMap;

/**
 *
 * @author Anumey
 */
public class LoginService {

    HashMap<String, String> userIdMap = new HashMap<>();

    public LoginService() {
        userIdMap.put("yo", "Anumey");
        userIdMap.put("yo2", "Anumey2");
        userIdMap.put("yo3", "Anumey3");
        userIdMap.put("yo4", "BABAM");
    }

    public boolean authenticate(String userId, String password) {
        if (password == null || "".equals(password.trim())) {
            return false;
        }

        return true;
    }

    public User getUserDetails(String userId) {
        User user = new User(userIdMap.get(userId), userId);

        return user;
    }
}
