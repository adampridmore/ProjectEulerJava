package projecteulerjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
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
                    for (long l = lastPrime + 1;true;l++) {
                        if (isPrime(l)) {
                            lastPrime = l;
                            break;
                        }
                    }
                }

                primes.add(lastPrime);
                return lastPrime;
            }

            private boolean isPrime(long l) {
                return !primes.stream()
                        .anyMatch(x -> l % x == 0);
            }
        });
    }
}
