public class Palindrome_Number {
    public static void main(String[] args){

    }
    public static boolean isPalindrome(int x) {
        if( x < 0){
            return false;
        }else{
            String str = String.valueOf(x);
            Integer[] numArray = new Integer[str.length()];
            for(int i = 0 ; i < numArray.length; i++){
                numArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            int splitIndex = numArray.length / 2;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.reverse();
            int count = 0;
            if( x < 10){
                return true;
            }
            for(int j = 0 ; j <splitIndex; j++){
                if(str.charAt(j) == sb.charAt(j)){
                    count++;
                }
                if( count == splitIndex){
                    return true;
                }
            }
            return  false;
        }
    }
}
