
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class systemmanagementNGTest {

    systemmanagement system = new systemmanagement();

    user u = new user("Ahmed", "ahmed@gmailcom", "111111", "male");

    @Test
    public void signup() {

        Assert.assertEquals(system.signup(u), "Account Created");

    }

    @Test
    public void sendRequestTest() {

        Assert.assertEquals(u.sendRequest("B", system), "OPPs User Not Found");

    }

    @Test
    public void AcceptTEST() {

        Assert.assertEquals(u.Accept("C", system), "OPPs User Not Found");

    }

}
