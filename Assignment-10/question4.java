public class question4 {
    public static void main(String[] args) {
        // Check for Anagram ;0
        String s1 = "anagram";
        String s2 = "nagaram";
        Boolean contains=false;
        for(int i = 0; i < s1.length(); i++) {
            char ch=s1.charAt(i);
            int j=0;
            Boolean isTrue=false;
            while(j<s2.length()){
                char ch1=s1.charAt(j);
                if(ch1==ch){
                    s2=s2.substring(0,j)+"-"+s2.substring(j+1);
                    isTrue=false;
                    break;
                }
                j++;
        }
        contains=isTrue;
        if(isTrue){
            continue;
        }else{
            break;
        }
    }
    System.out.println("Checking for Anagram:"+contains);
    }
}
