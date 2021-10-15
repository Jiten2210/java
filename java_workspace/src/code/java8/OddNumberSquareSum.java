package code.java8;

public class OddNumberSquareSum {
    public static void main(String[] args) {
       /* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum);*/
        System.out.println(solution("BBABAA"));
    }

    public static int solution(String S) {
        // write your code in Java SE 8
        int length = S.length();
        int[][] ans = new int[length + 1][2];
        for( int current = length -1; current >=0; current--)
        {
            if(S.charAt(current) == 'b')
            {
                ans[current][0] = Math.min(1+ ans[current +1] [0] , ans[current+1][1]) ;
            }
            else{
                ans[current][0] = ans[current+1][0];
            }

            if(S.charAt(current) == 'a')
            {
                ans[current][1] = 1+ ans[current +1][1];
            }
            else{
                ans[current][1] = ans[current+1][1];
            }
        }
        return ans[0][0];
    }
}

