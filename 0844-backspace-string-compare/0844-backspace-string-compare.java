class Solution {
    public static String process(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != '#'){
                sb.append(ch);
            }else{
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }
}