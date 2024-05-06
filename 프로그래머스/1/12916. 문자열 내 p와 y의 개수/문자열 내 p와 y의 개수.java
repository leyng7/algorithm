class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;
        for (char c : s.toCharArray()) {
            char lowerCase = Character.toLowerCase(c);
            if (lowerCase == 'p'){
                p++;
            }
            if (lowerCase == 'y'){
                y++;
            }
        }
        
        answer = (p == y);

        return answer;
    }
}