package simple;

import database.HibernateSessionFactoryUtil;
import model.User;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class firstTest {

    private Session session;
    private User expectedUser;

    @Before
    public void init(){
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        expectedUser = new User();
        expectedUser.setEnabled(true);
        expectedUser.setId("8a59d9547e5b4d9ca0a30804e8a33a94");
        expectedUser.setUsername("admin");
        expectedUser.setPassword("$2a$10$GZtUdy1Z7Hpk0lYYG92CQeiW1f2c4e3XgA8wunVTDFyQJ2DAmH.x.");
    }

    @Test
    public void test(){
        User resultUser = session.load(User.class, "8a59d9547e5b4d9ca0a30804e8a33a94");
        Assert.assertEquals(expectedUser, resultUser);
    }
}
