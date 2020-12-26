package app.utk.ms.service;

import app.utk.ms.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Qualifier(value = "userDao")
    @Autowired
    private UserDao userDao;


}
