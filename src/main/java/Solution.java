public class Solution {
    public int countVowelPermutation(int n) {
        int modulo = 1_000_000_007;
        int[][] memo = new int[n + 1][120];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        return dfs(vowels, n, '0', memo);
    }
    private int dfs(char[] vowels, int n, char previous, int[][] memo){
        if(n == 0){
            return 1;
        }
        if(memo[n][previous] != 0){
            return memo[n][previous];
        }
        int result = 0;
        int modulo = 1_000_000_007;
        for (int i = 0; i < vowels.length; i++) {
            if(previous == 'a' && vowels[i] == 'e' ||
                    previous == 'e' && (vowels[i] == 'a' || vowels[i] == 'i') ||
                    previous == 'i' && vowels[i] != 'i' ||
                    previous == 'o' && (vowels[i] == 'i' || vowels[i] == 'u') ||
                    previous == 'u' && vowels[i] == 'a' ||
                    previous == '0'){
                result = (result + dfs(vowels, n - 1, vowels[i], memo)) % modulo;
            }

        }
        memo[n][previous] = result % modulo;
        return result;
    }
}
