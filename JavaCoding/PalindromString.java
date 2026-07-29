public class PalindromString {
    public PalindromString() {
    }
    public void palindrom(String str){
        String rev = "";
        int length = str.length();
        for(int i = length-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str = "madam";
        PalindromString ps = new PalindromString();
        ps.palindrom(str);
    } 
}