import org.junit.Assert;
import org.junit.Test;

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
}
