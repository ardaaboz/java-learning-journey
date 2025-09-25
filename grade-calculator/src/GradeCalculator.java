public class GradeCalculator {
    public static void main(String[] args) {
        // Declaring variables
        double scoreMath = 72.5;
        double scoreScience = 89;
        double scoreHistory = 95.8;
        char letterGrade;

        // Average calculation
        double averageScore = (scoreMath + scoreScience + scoreHistory) / 3;

        // Determining the letter grade
        if (averageScore >= 90) {
            letterGrade = 'A';
        } else if (averageScore >= 80) {
            letterGrade = 'B';
        } else if (averageScore >= 70) {
            letterGrade = 'C';
        } else if (averageScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Printing out results and calculating how much points are needed for next level
        double pointsNeeded = 0;
        if (letterGrade == 'A') {
            System.out.println("You have the highest grade available, A!");
        } else if (letterGrade == 'B') {
            while (averageScore < 90) {
                averageScore += 0.1;
                pointsNeeded += 0.1;
            }
            System.out.println("Your current grade is B, you need " + pointsNeeded + " more points for next level.");
        } else if (letterGrade == 'C') {
            while (averageScore < 80) {
                averageScore += 0.1;
                pointsNeeded += 0.1;
            }
            System.out.println("Your current grade is C, you need " + pointsNeeded + " more points for next level.");
        } else if (letterGrade == 'D') {
            while (averageScore < 70) {
                averageScore += 0.1;
                pointsNeeded += 0.1;
            }
            System.out.println("Your current grade is D, you need " + pointsNeeded + " more points for next level.");
        } else {
            while (averageScore < 60) {
                averageScore += 0.1;
                pointsNeeded += 0.1;
            }
            System.out.println("Your current grade is F, you need " + pointsNeeded + " more points for next level.");
        }
    }
}
