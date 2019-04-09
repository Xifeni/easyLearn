package simple;

import core.Starter;
import core.dao.UserRepository;
import core.model.User;
import core.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class firstTest {

    @Autowired
    private UserService userService;

    private UserRepository repository;

    private User expectedUser1;
    private User expectedUser2;

    @Before
    public void init() {
        expectedUser1 = new User(UUID.fromString("8a59d954-7e5b-4d9c-a0a3-0804e8a33a94"),
                "admin",
                "$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.",
                true);

        expectedUser2 = new User(UUID.fromString("38a2b1b9-d50b-44e9-bfc5-25b73b8dfa30"),
                "not-admin",
                "$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.",
                true);

        repository = userService.getUserRepository();
    }

    @Test
    public void testGetUser() {
        User resultUser = repository.getUserById(UUID.fromString("8a59d954-7e5b-4d9c-a0a3-0804e8a33a94"));
        Assert.assertEquals(expectedUser1, resultUser);
    }

    @Test
    public void testFindAll() {
        List<User> users = new ArrayList<>();
        users.add(expectedUser1);
        users.add(expectedUser2);
        Assert.assertEquals(users, repository.findAll());
    }

    @Test
    public void testGetOne(){
        Assert.assertEquals(expectedUser2, repository.getOne(UUID.fromString("38a2b1b9-d50b-44e9-bfc5-25b73b8dfa30")));
    }
}
