package abstracT;

import java.util.Scanner;

public class BiharElectionVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jdu = 0, rjd = 0, bjp = 0, inc = 0, cpi = 0;
        System.out.println("===== 🗳️ Bihar Election Voting System =====");
        System.out.print("Enter number of voters: ");
        int voters = sc.nextInt();

        for (int i = 1; i <= voters; i++) {
            System.out.println("\nVoter " + i + ", please cast your vote:");
            System.out.println("1. Janata Dal (United) - 🏹");
            System.out.println("2. Rashtriya Janata Dal - 🏮");
            System.out.println("3. Bharatiya Janata Party - 🌸");
            System.out.println("4. Indian National Congress - ✋");
            System.out.println("5. Communist Party of India (Marxist–Leninist) - 🌾⭐");
            System.out.print("Your choice (1–5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> { jdu++; System.out.println("✅ You voted for Janata Dal (United) 🏹"); }
                case 2 -> { rjd++; System.out.println("✅ You voted for Rashtriya Janata Dal 🏮"); }
                case 3 -> { bjp++; System.out.println("✅ You voted for Bharatiya Janata Party 🌸"); }
                case 4 -> { inc++; System.out.println("✅ You voted for Indian National Congress ✋"); }
                case 5 -> { cpi++; System.out.println("✅ You voted for Communist Party of India (ML) 🌾⭐"); }
                default -> System.out.println("❌ Invalid vote! Skipping this voter.");
            }
        }

        // Display final results
        System.out.println("\n===== 📊 Election Results =====");
        System.out.println("Janata Dal (United) 🏹 : " + jdu + " votes");
        System.out.println("Rashtriya Janata Dal 🏮 : " + rjd + " votes");
        System.out.println("Bharatiya Janata Party 🌸 : " + bjp + " votes");
        System.out.println("Indian National Congress ✋ : " + inc + " votes");
        System.out.println("Communist Party of India (ML) 🌾⭐ : " + cpi + " votes");

        // Find maximum votes
        int maxVotes = Math.max(jdu, Math.max(rjd, Math.max(bjp, Math.max(inc, cpi))));

        System.out.print("\n🏆 Winning Party: ");

        // Check for tie
        boolean tie = false;
        String winners = "";

        if (jdu == maxVotes) winners += "Janata Dal (United) 🏹  ";
        if (rjd == maxVotes) winners += "Rashtriya Janata Dal 🏮  ";
        if (bjp == maxVotes) winners += "Bharatiya Janata Party 🌸  ";
        if (inc == maxVotes) winners += "Indian National Congress ✋  ";
        if (cpi == maxVotes) winners += "Communist Party of India (ML) 🌾⭐  ";

        // Count how many have max votes
        int countMax = 0;
        if (jdu == maxVotes) countMax++;
        if (rjd == maxVotes) countMax++;
        if (bjp == maxVotes) countMax++;
        if (inc == maxVotes) countMax++;
        if (cpi == maxVotes) countMax++;

        if (countMax > 1) {
            System.out.println("🤝 It's a tie between: " + winners);
        } else {
            System.out.println(winners.trim());
        }

        System.out.println("\n🗳️ Thank you! Democracy wins today!");
        sc.close();
    }
}

