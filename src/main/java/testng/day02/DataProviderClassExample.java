package testng.day02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassExample {
    @DataProvider(name="loginTestData1")
    public Object[][] loginTestData(){
        String[][] login={
                {"Kaz","academy"},
                {"coding","maktab"},
                {"kaz","online"}
        };
        return login;
    }

    @DataProvider(name="loginAgeTestData2")
    public Object[][] loginTestAgeData(){
        Integer[][] age={
                {1,100},
                {2,200},
                {3,300}
        };
        return age;
    }


    @Test(dataProvider ="loginTestData1" )
    public void testLogn(String coulmn1,String column2){
        System.out.println("Value of Column1\t\""+coulmn1+"\"\t Value of Column 2\t\""+column2+"\"");

    }
    @Test(dataProvider ="loginAgeTestData2" )
    public void testAge(Integer coulmn1,Integer column2){
        System.out.println("Value of Column1\t\""+coulmn1+"\"\t Value of Column 2\t\""+column2+"\"");

    }

    @DataProvider(name="loginGenderData")
    public Object[][] singleColumn(){
        String[][] gender={
                {"Male"},
                {"Female"},
                {"None"},
                {"Others"}
        };
        return gender;
    }
    @Test(dataProvider ="loginGenderData" )
    public void testGender(String gender){
        System.out.println("Value of Column1\t\""+gender+"\"");

    }
}
