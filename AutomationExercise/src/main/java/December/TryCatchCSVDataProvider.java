//package December;
//
//import com.opencsv.CSVReader;
//import org.testng.annotations.DataProvider;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//
//public class TryCatchCSVDataProvider {
//
//    @DataProvider(name = "loginData")
//    public Object[][] getData() throws Exception {   // using 'throws'
//        CSVReader reader = null;
//
//        try {
//            // TRY → Code that may cause exception
//            reader = new CSVReader(new FileReader("src/test/resources/login.csv"));
//
//            List<String[]> csvData = reader.readAll();
//
//            if (csvData.isEmpty()) {
//                throw new RuntimeException("CSV file is empty!"); // using 'throw'
//            }
//
//            csvData.remove(0); // remove header
//
//            Object[][] data = new Object[csvData.size()][csvData.get(0).length];
//
//            for (int i = 0; i < csvData.size(); i++) {
//                data[i] = csvData.get(i);
//            }
//            return data;     // return from try block
//
//        } catch (FileNotFoundException e) {
//            // CATCH → Handle file not found
//            System.out.println("CSV file not found!");
//            throw e; // rethrowing the exception so TestNG knows test failed
//
//        } catch (IOException e) {
//            System.out.println("Error reading CSV file!");
//            throw e;
//
//        } finally {
//            // FINALLY → Always executed
//            if (reader != null) {
//                reader.close();   // Important cleanup
//                System.out.println("CSV Reader closed.");
//            }
//        }
//    }
//}
