package simple;

import database.HibernateSessionFactoryUtil;
import model.User;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;

public class firstTest {

    private Session session;

    @Before
    public void init(){
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    @Test
    public void test(){
        User user = (User) session.load(User.class, "8a59d9547e5b4d9ca0a30804e8a33a94");
        System.out.print(user);
    }
}
