package com.katoch;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
	int myMinValue = -2_147_483_648;
	int myMaxValue = 2_147_483_647;
	int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
	byte myByteValue = -128;
	byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewValue = " + myNewByteValue);

        // short has a width of 16
	short myShortValue = 32767;
	short myNewShortValue = (short) (myShortValue/2);

	// long has a width of 64
	long myLongValue = -9_223_372_036_854_775_807L;

	long myNewLong = 50000L + 10*(myNewByteValue + myNewShortValue + myTotal);
		System.out.println("The long value is = " + myNewLong);

    }
}
