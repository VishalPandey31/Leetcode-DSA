class Solution {
    public boolean isPalindrome(int x) {
        String pal= String.valueOf(x);
     String res = "";
      
        for(int i=pal.length()-1;i>=0;i--){
            res=res+pal.charAt(i);
        }
     
      return pal.equals(res);
    }

    public static void main (String [] args){
         Solution s1=new  Solution();
          System.out.println(s1.isPalindrome(121));
    }
}