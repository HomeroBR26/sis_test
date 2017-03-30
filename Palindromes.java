import java.io.IOException;
import java.nio.file.*;
import java.util.*;

class Palindromes {
    public static void main(String[] args) throws IOException {
            String numbers = new String(Files.readAllBytes(Paths.get("numbers.txt")));
            String[] numbers_arr = numbers.substring(0, 1000).split(", ");
            List<Integer> palindromes5 = new ArrayList<Integer>();
            List<Integer> palindromes4 = new ArrayList<Integer>();
            List<Integer> palindromes3 = new ArrayList<Integer>();
            
            for (String num : numbers_arr) {
                int reversed = Integer.parseInt(new StringBuffer(num).reverse().toString());
                int num_int = Integer.parseInt(num);

                if (num.length() == 5 && (reversed - num_int == 0)) {
                    palindromes5.add(num_int);
                }
                else if (num.length() == 4 && (reversed - num_int == 0)) {
                    palindromes4.add(num_int);
                }
                else if (num.length() == 3 && (reversed - num_int == 0)) {
                    palindromes3.add(num_int);
                }
            }      

            if (palindromes5.size() != 0) System.out.println(palindromes5);
            else if (palindromes4.size() != 0) System.out.println(palindromes4);
            else if (palindromes3.size() != 0) System.out.println(palindromes3);
            
    }
}
