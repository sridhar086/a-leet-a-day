package com.sridhar.code.library.hard.strings;

public class IntegerToEnglishWords {

    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        return recursive(num).trim();
    }

    public String recursive(int num) {
        if(num >= 1000000000) {
            int quotient = num/1000000000;
            String intermediate = String.format("%s Billion",LessThanTen(quotient).trim());
            int reminder = num%1000000000;
            return String.format( "%s %s",intermediate, recursive(reminder));
        } else if(num >= 1000000) {
            int quotient = num/1000000;
            String intermediate = String.format("%s Million",LessThanThousand(quotient).trim());
            int reminder = num%1000000;
            return String.format( "%s %s",intermediate, recursive(reminder));
        } else if(num >= 1000) {
            int quotient = num/1000;
            String intermediate = String.format("%s Thousand",LessThanThousand(quotient).trim());
            int reminder = num%1000;
            return String.format( "%s %s",intermediate, recursive(reminder));
        } else {
            return LessThanThousand(num);
        }
    }

    private String LessThanThousand(int num) {
        String st = LessThanHundred(num%100).trim();
        return switch (num / 100) {
            case 0 -> String.format("%s", st);
            case 1 -> String.format("One Hundred %s", st);
            case 2 -> String.format("Two Hundred %s", st);
            case 3 -> String.format("Three Hundred %s", st);
            case 4 -> String.format("Four Hundred %s", st);
            case 5 -> String.format("Five Hundred %s", st);
            case 6 -> String.format("Six Hundred %s", st);
            case 7 -> String.format("Seven Hundred %s", st);
            case 8 -> String.format("Eight Hundred %s", st);
            case 9 -> String.format("Nine Hundred %s", st);
            default -> "";
        };
    }

    private String LessThanHundred(int num) {
        String tens = LessThanTen(num%10).trim();
        if(num < 20 && num >= 10) {
            switch(num) {
                case 10: return "Ten";
                case 11: return "Eleven";
                case 12: return "Twelve";
                case 13: return "Thirteen";
                case 14: return "Fourteen";
                case 15: return "Fifteen";
                case 16: return "Sixteen";
                case 17: return "Seventeen";
                case 18: return "Eighteen";
                case 19: return "Nineteen";
            }
        }
        return switch (num / 10) {
            case 0 -> String.format("%s", tens);
            case 2 -> String.format("Twenty %s", tens);
            case 3 -> String.format("Thirty %s", tens);
            case 4 -> String.format("Forty %s", tens);
            case 5 -> String.format("Fifty %s", tens);
            case 6 -> String.format("Sixty %s", tens);
            case 7 -> String.format("Seventy %s", tens);
            case 8 -> String.format("Eighty %s", tens);
            case 9 -> String.format("Ninety %s", tens);
            default -> "";
        };
    }

    private String LessThanTen(int num) {
        return switch (num) {
            case 0 -> "";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }
}
