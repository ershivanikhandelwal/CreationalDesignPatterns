import java.util.concurrent.locks.Lock;

public class DbConnection {
    private static DbConnection conn=null; //use static initializer to check if connection is already created or not
    //private static DbConnection conn=new DbConnection();// This is early initialization because it creates instance when the application loads the class.
    //early initialization creates issue when we have dynamic values. we can not pass those values when the classes cre created.
    private DbConnection()
    {
        //make the constructor private so no-one can create instance from other classes.
    }

    public static DbConnection CreateConncetion()
    {
        //This is lazy initialization because it creates instance when the method calls
        if(conn==null) {
            synchronized(DbConnection.class)
            {
                if(conn==null)
                {
                    conn= new DbConnection();
                }
            }
        }
        return conn;
    }
}
