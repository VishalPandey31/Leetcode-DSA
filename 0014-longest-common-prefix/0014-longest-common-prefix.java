class Solution {

    public String longestCommonPrefix( String [] strs){
        
        String ans="";
         for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);

            boolean match=true;
            for(int j=1;j<strs.length;j++){
                  if(i>=strs[j].length()  || strs[j].charAt(i)!=ch){
                 match=false;
                 break;
                  }
            }
        if(match){
        ans+=ch;
        }else{
            break;
        }
    }
           
 return ans;
    }






    public static void main (String[] args) {
       
      Solution s=new Solution();
      String [] strs={"flower","flow","flight"};
      String res=s. longestCommonPrefix(strs);
     System.out.println(res);
    }
}