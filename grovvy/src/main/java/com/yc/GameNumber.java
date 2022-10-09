package com.yc;

import static java.lang.String.valueOf;

public class GameNumber {
    private int rawNumber;
    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedto(3) && isRelatedto(5)) {
            return "FizzBuzz";
        }

        if (isRelatedto(3)) {
            return "Fizz";
        }

        if (isRelatedto(5)) {
            return "Buzz";
        }
        return valueOf(rawNumber);
    }

    private boolean isRelatedto(int number) {

        return rawNumber % number == 0 ||
                valueOf(rawNumber).contains(valueOf(number));
    }

}

