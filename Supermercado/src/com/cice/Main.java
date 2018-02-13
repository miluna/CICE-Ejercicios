package com.cice;

public class Main {

    public static void main(String[] args) {
	String num = "9211";

        System.out.println(num.chars().map(Character::getNumericValue).sum());
    }
}
