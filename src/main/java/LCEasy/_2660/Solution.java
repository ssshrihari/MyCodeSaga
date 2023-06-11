package LCEasy._2660;

class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int len = player1.length;
        int sum1 = player1[0];
        int sum2 = player2[0];
        if(len == 1)
            return sum1==sum2?0:sum1>sum2?1:2;

        if(player1[0] == 10)
            sum1+=2*player1[1];
        else
            sum1+=player1[1];
        if(player2[0] == 10)
            sum2+=2*player2[1];
        else
            sum2+=player2[1];

        for(int i = 2; i < len; i++){
            if(player1[i-1] == 10 || player1[i-2] == 10)
                sum1+=2*player1[i];
            else
                sum1+=player1[i];
            if(player2[i-1] == 10 || player2[i-2] == 10)
                sum2+=2*player2[i];
            else
                sum2+=player2[i];
        }

        return sum1==sum2?0:sum1>sum2?1:2;
    }
}