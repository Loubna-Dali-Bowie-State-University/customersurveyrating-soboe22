import java.util.Scanner;

public class CustomerSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Declare necessary variables (e.g., to hold rating counts, total number of ratings, sum, etc.)
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        int totalRatings = 0;
        int sumRatings = 0;

        // TODO: Declare a flag for detecting if any 5-star rating was entered
        boolean hasFiveStar = false;

        System.out.println("Welcome to Customer Survey! Enter ratings from 1 to 5 (enter -1 to stop):");

        // Sentinel-Controlled Loop to collect customer ratings
        while (true) {
            // TODO: Prompt user to enter a rating
            System.out.print("Enter rating (1-5) or -1 to finish: ");
            int rating = scanner.nextInt();

            // TODO: Read the rating input

            // TODO: Check if the sentinel value (-1) was entered, and break if true
            if (rating == -1) {
                break;
            }

            // TODO: Validate that the rating is between 1 and 5
            if (rating < 1 || rating > 5) {
                System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
                continue; // If invalid, display an error message and continue to the next iteration
            }

            // TODO: Process valid rating:
            totalRatings++;          // Update total number of ratings
            sumRatings += rating;    // Add rating to the total for average calculation

            // - Update counters for each rating
            switch (rating) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    hasFiveStar = true; // - If rating is 5, set the flag to indicate a 5-star rating was received
                    break;
            }
        }

        // Summary Report
        System.out.println("\nSummary Report:");

        // TODO: Display the total number of ratings
        System.out.println("Total number of ratings: " + totalRatings);

        // TODO: Calculate and display the average rating, if any ratings were entered
        if (totalRatings > 0) {
            double averageRating = (double) sumRatings / totalRatings;
            System.out.printf("Average rating: %.2f%n", averageRating);
        } else {
            System.out.println("No ratings were entered.");
        }

        // TODO: Display the count for each rating (1-star to 5-star) without using arrays
        System.out.println("1-star count: " + count1);
        System.out.println("2-star count: " + count2);
        System.out.println("3-star count: " + count3);
        System.out.println("4-star count: " + count4);
        System.out.println("5-star count: " + count5);

        if (hasFiveStar) {
            System.out.println("A 5-star rating was received.");
        } else {
            System.out.println("No 5-star ratings were received.");
        }

        scanner.close(); // Close the scanner
    }
}
