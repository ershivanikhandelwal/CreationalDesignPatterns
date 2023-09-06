import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class User implements IClonable{
    private String name;
    private String email;
    private int age;
    private ArrayList<String> Subjects;
    public User(){

    }
    public User(String n, String e, int a){
        this.name=n;
        this.email=e;
        this.age=a;
        Subjects = new ArrayList<String>();
        this.getSubject();
    }

    void getSubject(){
        Subjects.add("DSA");
        Subjects.add("LLD");
        Subjects.add("HLD");
        Subjects.add("Computer Networks");
    }
    @Override
    public User Clone() {
        User u= new User();
        u.name=this.name;
        u.email=this.email;
        u.age=this.age;
        u.Subjects= this.Subjects;
        return u;
    }
}
