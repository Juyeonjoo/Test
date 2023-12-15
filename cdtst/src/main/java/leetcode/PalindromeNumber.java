package leetcode;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String strX = Integer.toString(x);

        //문자열 뒤집기
        StringBuilder stringBuilder = new StringBuilder(strX).reverse();

        for(int i = 0; i<strX.length(); i++){
            if(stringBuilder.charAt(i)!=strX.charAt(i)){
                return false;
            }
        }//for
        return true;
    }
}//class
