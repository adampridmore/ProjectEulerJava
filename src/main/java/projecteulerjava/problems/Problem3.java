package projecteulerjava.problems;

import projecteulerjava.Primes;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static projecteulerjava.TakeWhile.takeWhile;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//        What is the largest prime factor of the number 600851475143 ?
public class Problem3 {
    public static void main(String[] args) {
        Long ans = solver(600851475143L);
        System.out.println(MessageFormat.format("Ans: {0}", ans));
    }

    public static long solver(Long value) {
        final Long[] remainder = {value};
        List<Long> factors = new ArrayList<>();

        takeWhile(Primes.stream(), x -> x <= remainder[0]).forEach(p -> {
            if (isFactor(remainder[0], p)) {
                remainder[0] = remainder[0] / p;
                factors.add(p);
            }
        });

        return factors.stream()
                .mapToLong(x -> x)
                .max()
                .getAsLong();
    }

    private static boolean isFactor(Long remainder, Long p) {
        return remainder % p == 0;
    }
}
