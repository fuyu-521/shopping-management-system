import java.util.*;

class User {
    public String username;
    public String password;
    public String phone;
    public String email;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void changePassword() {
        System.out.println("\n请输入新密码：");
        Scanner scanner2=new Scanner(System.in);
        String change=scanner2.nextLine();
        password=change;
        System.out.println("\n密码修改成功！");
    }


}
