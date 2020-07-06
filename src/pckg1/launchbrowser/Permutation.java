package pckg1.launchbrowser;

public class Permutation {
	static void printPermutn(String str, String ans) 
    { 
  
        // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String substring = str.substring(0, i);
            String substring2 = str.substring(i + 1);
            String ros = substring + substring2;
  
            // Recurvise call 
            printPermutn(ros, ans + ch); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        printPermutn("abcd", ""); 
    } 

}
