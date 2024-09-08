package testng.day02;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterExample {

    @Parameters({"logindata","password"})
    @Test(alwaysRun = false)
    public void loginTest( String logindata,@Optional String password){
        System.out.println(logindata);
        System.out.println(password);

    }

    // 1. AC - user 7 character user name
    // verify user text box can only accept 7 character name - mandatory check krna
    // 6 character - negative
    // 8 character - negative
    // test data - automat

}
