package com.rakovets.course.java.core.practice.looping_statements;
class Task04 {
    public static void main(String[] args) {
        int healthPoints = 1000;
        double regenerationPercentFromCurrentHealth = 10.0;
        int averageDamagePerHour = 200;

        double raidTime = calculateRaidTime(healthPoints, regenerationPercentFromCurrentHealth, averageDamagePerHour);
        System.out.printf("Result: %f", raidTime);
    }
    static int calculateRaidTime(int healthPoints, double regenerationPercentPerHour, int averageDamagePerHour) {
        int raidTime = 0;
        while (healthPoints > 0 && raidTime <= 24) {
            double healthPointsWithRegeneration = healthPoints + healthPoints * regenerationPercentPerHour / 100;
            healthPoints = (int) healthPointsWithRegeneration - averageDamagePerHour;
            raidTime++;
        }
        return 24 < raidTime ? -1 : raidTime;
    }
}
