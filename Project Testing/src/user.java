
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class user {

    public String name;

    public String email;

    public String password;

    public String Gender;

    public int date_birth;

    public String country;

    public int age;

    public user(String name, String password, String email, String gender) {
        Setname(name);
        Setpassword(password);
        setemail(email);
        SetGender(gender);
    }

    private ArrayList<user> user = new ArrayList<user>();
    private ArrayList<user> friendRequests = new ArrayList<user>();
    private ArrayList<user> friendlist = new ArrayList<user>();
    private ArrayList<post> num_post = new ArrayList<post>();
    private ArrayList<group> Groups = new ArrayList<group>();
    private ArrayList<user> premiumuser = new ArrayList<user>();
    private Object sc;

    public void Setname(String name) {
        this.name = name;
    }

    String getname() {
        return name;
    }

    public void setemail(String email) {
        this.email = email;
    }

    String getemail() {
        return email;
    }

    public void Setpassword(String password) {
        this.password = password;
    }

    String getpassword() {
        return password;
    }

    public void SetGender(String Gender) {
        this.Gender = Gender;
    }

    String getGender() {
        return Gender;
    }

    public void Setdate_birth(int datebirth) {
        this.date_birth = datebirth;
    }

    int getdate_birth() {
        return date_birth;
    }

    public void Setcountry(String country) {
        this.country = country;
    }

    String getcountry() {
        return country;
    }

    public void Setage(int age) {
        this.age = age;
    }

    int getage() {
        return age;
    }

    public boolean login_check() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void join_group(group g) {
    }

    public void add_friend(user friend1, user friend2) {

        String content = null;

        if (friend1.friendlist.contains(friend2)) {

            System.out.print("Friend Already Exist in System");

        } else {
            friend1.create_request(name, content); // friend 1 send request to friend 2 
        }

    }

    public void create_request(String type, String content) {
    }

    public boolean request_confirm() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void accept_friend_request(user u) {

    }

    public page like_page(page p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void Check_card(user account) {

        System.out.println("choose 1 if you want to pay by cridit card, 2 for PayPal");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Pay by creadit");

        } else if (choice == 2) {
            System.out.print("Pay by paypal");

        } else {
            System.out.print("Enter Again");

        }

    }

    public void upgrade_premium(user u) {

        u.Check_card(u);
        premiumuser.add(u);
        user.remove(u);
    }

}
