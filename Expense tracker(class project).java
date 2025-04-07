import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent an expense
class Expense {
    private String category;
    private double amount;
    private String description;

    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "Category: " + category + ", Amount: " + amount + ", Description: " + description;
    }
}

// Main Class
public class Expensetracker {
    private static List<Expense> expense_list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n** Expense Tracker Menu **");
            System.out.println("---------------------------------------");
            System.out.println("1. Add Expenses");
            System.out.println("2. View All Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Filter Expenses by Category");
            System.out.println("5. Exit");
            System.out.println("Choose Your Option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline character
            switch (choice) {
                case 1:
                    addExpenses();
                    break;
                case 2:
                    viewAllExpenses();
                    break;
                case 3:
                    calculateTotalExpenses();
                    break;
                case 4:
                    filterExpensesByCategory();
                    break;
                case 5:
                    System.out.println("Thanks for using Expense Tracker.....GoodBye!!");
                    break;
                default:
                    System.out.println("Enter a valid option!");
            }
        }
    }
// first case
    private static void addExpenses() {
        System.out.println("Enter Expense Category (e.g., Food or Travel): ");
        String category = sc.nextLine();

        System.out.println("Enter Expense Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline character

        System.out.println("Enter Expense Description: ");
        String description = sc.nextLine();

        expense_list.add(new Expense(category, amount, description));
        System.out.println("Expense added successfully!");
    }
//second case
    private static void viewAllExpenses() {
        if (expense_list.isEmpty()) {
            System.out.println("No expenses recorded!");
        } else {
            System.out.println("\nList of Expenses:");
            for (Expense expense : expense_list) {
                System.out.println(expense);
            }
        }
    }
//third case
    private static void calculateTotalExpenses() {
        double total = 0;
        for (Expense expense : expense_list) {
            total += expense.getAmount();
        }
        System.out.println("Total Expenses: $" + total);
    }
//fourth case
    private static void filterExpensesByCategory() {
        System.out.println("Enter the Expense Category: ");
        String category = sc.nextLine();

        boolean found = false;
        System.out.println("\nExpenses in Category: " + category);
        for (Expense expense : expense_list) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No expenses found in the category!");
        }
    }
}
