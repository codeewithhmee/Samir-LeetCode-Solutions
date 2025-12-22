
class Solution {
    int valid=0;
    public List<String> generateParenthesis(int n) {
       List<String> ans=new ArrayList<>();
       a("",ans,n);
       System.out.print(valid);
       return ans;
    }
    public  void a(String ns,List<String> ans,int n){
        if(ns.length()==n*2){
            ans.add(ns);
            valid++;
            return;
        }
       if(checkOpen(ns,n)){
        a(ns+"(",ans,n);
       }
        if(checkClose(ns,n)){
        a(ns+")",ans,n);
       }


    }
    public static boolean checkOpen(String ns,int n){
        int p=0;
        for(int i=0;i<ns.length();i++){
            if(ns.charAt(i)=='('){
                p++;
            }
        }
        if(p<n)return true;
        return false;
    }
     public static boolean checkClose(String ns,int n){
        int o=0;
        for(int i=0;i<ns.length();i++){
            if(ns.charAt(i)=='('){
                o++;
            }
        }
        int c=0;
         for(int i=0;i<ns.length();i++){
            if(ns.charAt(i)==')'){
                c++;
            }
        }
        if(c<o)return true;
        return false;
        
    }

    
}
