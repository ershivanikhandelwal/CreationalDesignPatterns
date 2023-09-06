import org.junit.Assert;
import org.junit.Test;

import java.rmi.registry.Registry;

public class PrototypeTest {
    @Test
    public void cloneTest(){
        User u1= new User("Test1","Test@gmail",26);
        User u2=u1.Clone();
        u2.setName("Test2");
        Assert.assertNotEquals(u1.getName(),u2.getName());
    }

    @Test
    public void cloneTestObjectReference(){
        User u1= new User("Test1","Test@gmail",26);
        User u2=u1.Clone();
        u2.setName("Test2");
        Assert.assertNotEquals(u1,u2);
    }

    @Test
    public void cloneDifferentRegiery(){
        UserRegistery reg= new UserRegistery();
        User u1= new User("SuperUser","Test@gmail",26);
        reg.register("SuperUser",u1);
        User u2= new User("CustomerUser","Test@gmail",28);
        reg.register("CustomerUser",u2);

        User p1= u1.Clone();
        User p2= u2.Clone();
        Assert.assertNotEquals(p1.getName(),p2.getName());
    }
}
