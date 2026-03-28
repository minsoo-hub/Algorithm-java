class Solution {
    public String solution(String[] seoul) {
        int loc = 0;
        for(String s: seoul) {
           if(s.equals("Kim")){
               break;
           } else {
               loc++;
           }
        }
        
        String answer = "김서방은 " + loc + "에 있다";
        return answer;
    }
}