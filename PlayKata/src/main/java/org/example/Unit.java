package org.example;

public class Unit
{
    public static Unit Inch = new Unit(1);
    public static Unit Foot = new Unit(12);
    public static Unit Yard = new Unit(36);
    private final int transitionRateToInches;

    private Unit(int transitionRateToInches)
    {
        this.transitionRateToInches = transitionRateToInches;
    }

    static int getAmountInInches(int rawAmount, Unit unit)
    {
        return rawAmount * unit.transitionRateToInches;
    }
}
