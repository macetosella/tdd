package math.fraction;

// Clase Obsoleta
//public class TestMathFraction {
//    @Test
//    public void zeroPlusZeroReturnZero(){
//        Fraction sum = new Fraction(0).
//                plus(new Fraction(0));
//        assertEquals(0,sum.intValue());
//    }
//
//    @Test
//    public void integerPlusZeroReturnInterger(){
//        Fraction sum = new Fraction(3).
//                plus(new Fraction(0));
//
//        assertEquals(3,sum.intValue());
//    }
//    @Test
//    public void zeroPlusIntegerReturnInteger(){
//        Fraction sum = new Fraction(0).
//                plus(new Fraction(3));
//        assertEquals(3,sum.intValue());
//    }
//
//    @Test
//    public void integerPlusIntegerReturnInteger(){
//        Fraction sum = new Fraction(3).
//                plus(new Fraction(4));
//        assertEquals(7,sum.intValue());
//    }
//
//    @Test
//    public void negativeIntegerPlusInteger(){
//        Fraction sum = new Fraction(-3).
//                plus(new Fraction(-2));
//        assertEquals(-5,sum.intValue());
//    }
//
//    @Test
//    public void sumNumeratorGivenSameDenominator(){
//        Fraction sum = new Fraction(1,5).
//                plus(new Fraction(2,5));
//        assertEquals(3,sum.getNumerator());
//        assertEquals(5,sum.getDenominator());
////        assertEquals(new Fraction(3,5),sum);
//    }
//
//    @Test
//    public void sumNumeratorGivenDifferentMultipleDenominator(){
//        Fraction sum = new Fraction(3,2).
//                plus(new Fraction(6,4));
//        assertEquals(12,sum.getNumerator());
//        assertEquals(4,sum.getDenominator());
//    }
//    @Test
//    public void sumNumeratorGivenDifferentNonMultipleDenominator(){
//        Fraction sum = new Fraction(-3,5).
//                plus(new Fraction(7,3));
//        assertEquals(26,sum.getNumerator());
//        assertEquals(15,sum.getDenominator());
//    }
//    // ya no necesito llamar a los metodos, luego de
//    // sobreescribir con equals
//    @Test
//    public void wholeNumberEqualSameFraction() {
//        assertEquals(new Fraction(5,1),
//                new Fraction(5));
//    }
//    @Test
//    public void wholeNumberNotEqualToDifferentwholeNumber(){
//        Fraction num = new Fraction(6);
////        System.out.println(num); //  6/1
//        assertNotEquals(new Fraction(6),
//                new Fraction(5));
//    }
//
//    // Agrego ultimo cambio, ahora sum, me trae el resultado
//    // antes debia llamar a una fc de ese obj, ahora con los Override
//    // obtengo 3/5 (en String)
//    @Test
//    public void REFACTORsumNumeratorGivenSameDenominator(){
//        Fraction sum = new Fraction(1,5).
//                plus(new Fraction(2,5));
//        assertEquals(3,sum.getNumerator());
//        assertEquals(5,sum.getDenominator());
//        System.out.println(sum);
//        assertEquals(new Fraction(3,5),sum);
//    }
//
//    // *********
//    // *** Refactor con metodos
//    public void checkAddsFractionsAsIntegers(int addend, int augend, int expected){
////        assertEquals(expected,new Fraction(addend).plus(new Fraction(augend)).intValue()); // comparo numeradores 5 y 5
//        assertEquals(new Fraction(expected),new Fraction(addend).plus(new Fraction(augend))); // comparo string 5/1 y 5/1
//    }
//
//    @Test
//    public void REFACTORzeroPlusZeroReturnZero(){
//        checkAddsFractionsAsIntegers(0,0,0);
//    }
//
//    @Test
//    public void REFACTORintegerPlusZeroReturnInteger(){
////        Fraction sum = new Fraction(3).
////                plus(new Fraction(0));
////        assertEquals(3,sum.intValue());
//        checkAddsFractionsAsIntegers(3,0,3);
//    }
//    @Test
//    public void REFACTORzeroPlusIntegerReturnInteger(){
////        Fraction sum = new Fraction(0).
////                plus(new Fraction(3));
////        assertEquals(3,sum.intValue());
//        checkAddsFractionsAsIntegers(0,3,3);
//
//    }
//
//
//}
