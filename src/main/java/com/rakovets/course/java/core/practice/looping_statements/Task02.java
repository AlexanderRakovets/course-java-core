package com.rakovets.course.java.core.practice.looping_statements;

import com.rakovets.course.java.core.util.NumberUtil;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Разработать программу для банка.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        double depositAmount = 1500.0;
        double annualDepositPercent = 7.0;
        int depositTerm = 5;

        double totalDepositAmount = getTotalDepositAmount(depositAmount, annualDepositPercent, depositTerm);
        System.out.printf("Result: %f", totalDepositAmount);
    }

    /**
     * Рассчитывает прибыль, которую получит клиент по вкладу с ежегодным перерасчетом (сложный процент).
     *
     * @param depositAmount        сумма вклада
     * @param annualDepositPercent ежегодный процент вклада
     * @param depositTerm          продолжительность вклада (в годах)
     * @return прибыль (с точностью до 2 знаков после десятичного разделителя)
     */
    static double getTotalDepositAmount(double depositAmount, double annualDepositPercent, int depositTerm) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double totalDepositAmount = depositAmount;
        double profitDeposit = 0;
        for (int i = 0; i < depositTerm; i++) {
            profitDeposit = totalDepositAmount * (annualDepositPercent / 100);
            totalDepositAmount += profitDeposit;
        }
        return NumberUtil.roundValueToTwoDigitsForMantissa(totalDepositAmount);
    }
}
