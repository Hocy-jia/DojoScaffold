package org.example;

public class Length
{
    private final int amountInInches;

    public Length(int rawAmount, Unit unit)
    {
        this.amountInInches = Unit.getAmountInInches(rawAmount, unit);
    }

    @Override
    public boolean equals(Object obj)
    {
        Length another = (Length) obj;
        return this.amountInInches == another.amountInInches;
    }
}
