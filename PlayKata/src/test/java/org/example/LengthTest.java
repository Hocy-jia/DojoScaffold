package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Unit.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest
{
    @Test
    public void should_1_inch_equal_to_1_inch() {
        Length inch = new Length(1, Inch);
        assertEquals(inch, (new Length(1, Inch)));
    }
    @Test
    public void should_1_foot_equal_to_12_inches() {
        assertEquals(new Length(1, Foot), (new Length(12, Inch)));
    }
    @Test
    public void should_1_yard_equal_to_3_feet() {
        assertEquals(new Length(1, Yard), (new Length(3, Foot)));
        assertEquals(new Length(2, Yard), (new Length(72, Inch)));
    }
}
