
import java.util.ArrayList;

public class systemmanagement {

    private ArrayList<user> users = new ArrayList<user>();

    public ArrayList<user> Getusers() {
        return users;

    }

    public String signup(user u) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getemail().equals(u.getemail())) {
                return "Email Already Exist";
            }
            if (u.getname().isEmpty() || u.getemail().isEmpty() || u.getpassword().isEmpty() || u.getGender().isEmpty()) {

                return "please fill fields";

            }
        }
        users.add(u);
        return "Account Created";
    }

}
