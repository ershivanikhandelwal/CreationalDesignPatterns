import java.util.HashMap;
import java.util.Map;

public class UserRegistery {
    Map<String,User> reg= new HashMap<>();
    public void register(String key, User u){
        reg.put(key,u);
    }

    public User getRegistery(String key){
        return reg.get(key);
    }

    public void deleteRegistery(String key){
        reg.remove(key);
    }
}
