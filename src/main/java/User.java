import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    //省略get个set方法
}