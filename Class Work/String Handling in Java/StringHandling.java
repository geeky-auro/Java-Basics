// package String Handling in Java;

public class StringHandling {
    /*
     * String Objects can be constructed in various ways ;)
     * String Objects are immutable becoz whenever a string is modified old string is thrown and a new string object is created and modified valued is palced:-
     * When we create a 
     * 
     */
     public static void main(String[] args) {
        char charSeq[]={'a','b','c','d','e'};
        String s=new String(charSeq,2,3);
        String s1=new String("abc");
        // + is left associative ;)
        System.out.println(4+4+"Four");
        System.out.println(new StringHandling());
        System.out.println(s);
     }
}
