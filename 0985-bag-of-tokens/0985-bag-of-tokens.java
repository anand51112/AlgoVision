class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int i=0;
        int j=tokens.length-1;
        int score=0;
        int maxscore=0;
        Arrays.sort(tokens);
        while(i<=j){
            if(tokens[i]<=power){
                score++;
                power-=tokens[i];
                i++;
                maxscore=Math.max(score,maxscore);
                
            }
            else if(score>0){
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                break;
            }
        }
        return maxscore;
    }
}