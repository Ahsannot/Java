package December;

import org.testng.annotations.Test;

public class loginExcel {

    @Test(dataProvider = "excelData")
    public void loginExcel(String username, String password) {
        System.out.println(username + " : " + password);
    }

}
