package com.rakovets.course.java.core.practice.looping_statements;
class Task05 {
    public static void main(String[] args) {

        int numberRows = 13;
        boolean isEnableHeaderRow = false;

        String numbersColumn = generateNumbersColumn(numberRows, isEnableHeaderRow);
        System.out.printf("Result:\n%s", numbersColumn);
    }
    static String generateNumbersColumn(int numberRows, boolean isEnableHeaderRow) {
        String numbersColumn = "";
        if (!isEnableHeaderRow) {
            for (int firstRowTable = 1; firstRowTable < numberRows ; firstRowTable++) {
                numbersColumn += firstRowTable + "\n";
            }
            numbersColumn += numberRows;
        } else {
            for (int firstRowTable = 1; firstRowTable < numberRows ; firstRowTable++) {
                numbersColumn += "\n" + firstRowTable;
            }
        }
        return numbersColumn;
    }
}
