class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int hash[]=new int[26];
        Arrays.fill(hash,0);
        int l1=a.length();
        int l2=b.length();
        for(int i=0;i<l1;i++){
            char c=a.charAt(i);
            hash[c-'a']+=1;
        }
        for(int i=0;i<l2;i++){
            char c=b.charAt(i);
            hash[c-'a']-=1;
        }
        for(int i=0;i<26;i++){
            if (hash[i]!=0)return false;
        }
        return true;
        // Your code here
        
    }
}
