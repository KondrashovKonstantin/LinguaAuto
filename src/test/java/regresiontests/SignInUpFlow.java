package regresiontests;

import framework.BaseSignInUp;
import org.testng.annotations.Test;

public class SignInUpFlow extends BaseSignInUp {


    @Test
    public void testLoginPositive()  {
        loginPositiveTest();
    }
    @Test
    public void testSignUpPositive(){
        signUpPositiveTest();
    }
    @Test
    public void testLoginNegativeEmail(){
        loginNegativeEmailTest();
    }
    @Test
    public void testLoginNegativePassword(){
        loginNegativePasswordTest();
    }

}
