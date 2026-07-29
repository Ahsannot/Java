public class FabonachiSeries{

    public FabonachiSeries(){

    }

    public void printFabonachiSeries(int n){
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    public static void main(String[] args) {
        FabonachiSeries series = new FabonachiSeries();
        series.printFabonachiSeries(5);
    }
}