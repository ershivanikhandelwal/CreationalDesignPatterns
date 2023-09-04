import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void createStudentObject(){
        Student s= new Student.Builder().setName("Shivani").setAddress("Test").setAge(26).setEmail("Test@gmail.com").setPSP(98).CreateBuilder();
        Assert.assertNotNull(s);
    }
}
