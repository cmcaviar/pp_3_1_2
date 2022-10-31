package com.cmcaviar.pp_3_1_2.dao;



import com.cmcaviar.pp_3_1_2.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User show(int id);
    void save(User user);
    void delete(int id);
    void update(int id, User updatedUser);

}