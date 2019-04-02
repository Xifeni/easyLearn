package simple;

import core.Starter;
import core.model.User;
import core.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class firstTest {

    @Autowired
    private UserService userService;

    private User expectedUser;

    @Before
    public void init() {
        expectedUser = new User();
        expectedUser.setEnabled(true);
        expectedUser.setId("8a59d9547e5b4d9ca0a30804e8a33a94");
        expectedUser.setUsername("admin");
        expectedUser.setPassword("$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.");
    }

    @Test
    public void test() {
        User resultUser = userService.getUserById("8a59d9547e5b4d9ca0a30804e8a33a94");
        Assert.assertEquals(expectedUser, resultUser);
    }
}
