import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DbConnectionTest {
    @Test
    public void testDbConnection()
    {
        DbConnection conn= DbConnection.CreateConncetion();
        Assert.assertNotNull("if the constructor called, a not null connection object should be created",conn);
    }

    @Test
    public void testSameConnectionInstance()
    {
        DbConnection conn1= DbConnection.CreateConncetion();
        DbConnection conn2= DbConnection.CreateConncetion();
        Assert.assertEquals(conn1,conn2);
    }
}
