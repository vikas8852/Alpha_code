package bit;

public class char_conversion {
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch);
            System.out.print((char)(ch|' '));
        }
    }
    
}
