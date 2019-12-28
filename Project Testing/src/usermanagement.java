
import java.util.ArrayList;

public class usermanagement {

    public ArrayList<user> users = new ArrayList<user>();

   /*
     public void login(String email, String password) {

     for (int i = 0; i < database.size(); i++) {
            
     if (database.get(i).getemail() != email && database.get(i).getpassword() != password) {
     System.out.print("Invalid information");

     }
     }
        

     }
    */
    
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
