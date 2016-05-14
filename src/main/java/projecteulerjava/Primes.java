package projecteulerjava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Primes {
    public static Stream<Long> stream() {
        return Stream.generate(new Supplier<Long>() {
            Long lastPrime = null;
            List<Long> primes = new ArrayList<>();

            @Override
            public Long get() {
                if (lastPrime == null){
                    lastPrime = 2L;
                } else{
                    lastPrime = calculateNextPrime();
                }

                primes.add(lastPrime);
                return lastPrime;
            }

            private Long calculateNextPrime() {
                if (lastPrime == 2L){
                    return 3L;
                }

                return LongStream
                        .iterate(lastPrime + 2, x -> x + 2)
                        .filter(this::isPrime)
                        .findFirst()
                        .getAsLong();
            }

            private boolean isPrime(long l) {
                return !primes.stream()
                        .anyMatch(x -> l % x == 0);
            }
        });
    }
}
