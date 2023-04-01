public class question3 {
    public static void main(String[] args) {
        String st=changeCase("AuRRoooo");
        System.out.println(st);
        String st1=reverseString("Hello");
        System.out.println("Reverse String: " + st1);
        Boolean st2=compareString("Hello","Hello");
        System.out.println("Equality of Strings : " + st2);
        System.out.println("Inserted Strings : " + insertString("Hello Welcome", 4, "Auro"));
        int checkOccours=countOccourence("HeoATXllo", "o");
        System.out.println("No. of Occurrences : " + checkOccours);


    }

    static int countOccourence(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch==s2.charAt(0)){
                Boolean isTrue=true;
                for(int j=0;j<s2.length() && j<s1.length();j++){
                    if(s1.charAt(i++)==s2.charAt(j)){
                        isTrue=true;
                    }else{
                        isTrue=false;
                        break;
                    }
                }
                if(isTrue){
                count++;
                }
        }
        
    }
    
    return count;
}

    static String insertString(String str, int index, String str1) {
        System.out.println("Entered String: " + str);
        System.out.println("Entered String1: " + str1);
        if(index<str.length()) {
            str=str.substring(0,index)+str1+str.substring(index);
        }
        return str;
    }

    static Boolean compareString(String s,String s1) {
        System.out.println("Entered String: " + s);
        System.out.println("Entered String1: " + s1);
        if(s.length()==s1.length()) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)!=s1.charAt(i)) return false;
            }
            return true;
        }
        else return false;
    }

    static String reverseString(String s) {
        System.out.println("Entered Sting is " + s);
        String temp="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            temp=ch+temp;
        }
        return temp;
    }


     static String changeCase(String s) {
        System.out.println("Entered String is :"+s);
        String temp="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                temp+=Character.toLowerCase(ch);
            }else{
                temp+=Character.toUpperCase(ch);
            }
        }
        return temp;
    }
}
