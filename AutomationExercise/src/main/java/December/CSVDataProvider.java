//package December;
//
//import com.opencsv.CSVReader;
//import org.testng.annotations.DataProvider;
//
//import java.io.FileReader;
//import java.util.List;
//
//public class CSVDataProvider {
//
//    @DataProvider(name = "loginData")
//    public Object[][] getData() throws Exception {
//
//        // Read CSV file
//        CSVReader reader = new CSVReader(new FileReader("src/test/resources/login.csv"));
//
//        // Read all rows
//        List<String[]> csvData = reader.readAll();
//
//        // Remove header row (username,password)
//        csvData.remove(0);
//
//        // Create Object[][] for TestNG
//        Object[][] data = new Object[csvData.size()][csvData.get(0).length];
//
//        // Move CSV rows into Object[][]
//        for (int i = 0; i < csvData.size(); i++) {
//            data[i] = csvData.get(i);
//        }
//
//        reader.close();
//        return data;
//    }
//}
