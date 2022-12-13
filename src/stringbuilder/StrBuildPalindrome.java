package stringbuilder;

public class StrBuildPalindrome {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Madam".toLowerCase());
        sb.append("Level".toLowerCase());
        sb.append("Radar".toLowerCase());
        sb.append("58185");


       // System.out.printf("Ivestas tekstas \"%s\" yra %s", str, sb.isPalindrome(str) ? "polindromas" : "nepolindromas");


    }
private boolean isPalindrome(String str){
        str = str.replaceAll(" ", "");
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                return  false;

            }
        }
        return true;
}
}
