import java.math.BigInteger;
class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        BigInteger x = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= balls - share; i++) {
            x = x.multiply(BigInteger.valueOf(i));
        }

        BigInteger answer = n.divide(x.multiply(m));
        return answer;
    }
}