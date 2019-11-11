package manhtk.controller.Dao;

import manhtk.model.Login;
import manhtk.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAccount("htt");
        u1.setPassword("123456");
        u1.setName("HTT");
        u1.setEmail("htt@gmail.com");
        u1.setAge(20);

        User u2 = new User();
        u2.setAccount("thy");
        u2.setPassword("123456");
        u2.setName("THY");
        u2.setEmail("thy@gmail.com");
        u2.setAge(26);

        User u3 = new User();
        u3.setAccount("manhtk");
        u3.setPassword("123456");
        u3.setName("Manh");
        u3.setEmail("manh@gmail.com");
        u3.setAge(28);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
