package com.improving;


    public class RomanNumeralConverter {

        private static String EMPTY_STRING = "";
        private static String ONE = "I";
        private static String FIVE = "V";
        private static String TEN = "X";
//    private static String FIFTY = "L";
//    private static String HUNDRED = "C";
//    private static String FIVE_HUNDRED = "D";
//    private static String THOUSAND = "M"


        public String toRomanNumeral(int numberValue) {
            String romanNumeralString;

            romanNumeralString = appendRomanNumberOnesPlace(numberValue);

            return romanNumeralString;
        }

        private String appendRomanNumberOnesPlace(int numberValue) {
            String onesPlace;

            int tempNumberValue = numberValue;

            if (numberValue < 4) {
                onesPlace = appendOnes(numberValue);
            } else if (numberValue == 4) {
                onesPlace = ONE + FIVE;
            } else if (numberValue == 5) {
                onesPlace = FIVE;
            } else if (numberValue == 9) {
                onesPlace = ONE + TEN;
            } else {
                onesPlace = FIVE;
                tempNumberValue -= 5;
                onesPlace += appendOnes(tempNumberValue);
            }

            return onesPlace;
        }

        private String appendOnes(int numberValue) {
            String oneBuilder = EMPTY_STRING;

            for (int i = 0; i < numberValue; i++) {
                oneBuilder += ONE;
            }

            return oneBuilder;
        }
}
