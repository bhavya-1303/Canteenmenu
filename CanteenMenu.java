import java.util.Scanner;

public class CanteenMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int categoryChoice, itemChoice, quantity;
        double bill = 0;

        System.out.println("===== CANTEEN MENU ======");
        System.out.println("1. Tiffins");
        System.out.println("2. Lunch");
        System.out.println("3. Snacks");
        System.out.println("4. Beverages");
        System.out.println("5. Ice creams");

        System.out.print("Enter Category Choice: ");
        categoryChoice = sc.nextInt();

        switch (categoryChoice) {

            // ================= TIFFINS =================
            case 1:
                System.out.println("===== TIFFINS =====");
                System.out.println("1. Idli - Rs 30");
                System.out.println("2. Dosa - Rs 30");
                System.out.println("3. Vada - Rs 40");
                System.out.println("4. Chapathi - Rs 35");
                System.out.println("5. Puri - Rs 35");
                System.out.println("6. Upma - Rs 25");
                System.out.println("7. Pongal - Rs 40");

                System.out.print("Enter Item Choice: ");
                itemChoice = sc.nextInt();
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (itemChoice) {
                    case 1: bill += quantity * 30; break;
                    case 2: bill += quantity * 30; break;
                    case 3: bill += quantity * 40; break;
                    case 4: bill += quantity * 35; break;
                    case 5: bill += quantity * 35; break;
                    case 6: bill += quantity * 25; break;
                    case 7: bill += quantity * 40; break;
                    default: System.out.println("Invalid Item!");
                }
                break;

            // ================= LUNCH =================
            case 2:
                System.out.println("===== LUNCH =====");
                System.out.println("1. Meals - Rs 60");
                System.out.println("2. Veg Fried Rice - Rs 60");
                System.out.println("3. Egg Fried Rice - Rs 70");
                System.out.println("4. Chicken Fried Rice - Rs 80");
                System.out.println("5. Noodles - Rs 60");
                System.out.println("6. Chicken Noodles - Rs 80");
                System.out.println("7. Paneer Fried Rice - Rs 75");

                System.out.print("Enter Item Choice: ");
                itemChoice = sc.nextInt();
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (itemChoice) {
                    case 1: bill += quantity * 60; break;
                    case 2: bill += quantity * 60; break;
                    case 3: bill += quantity * 70; break;
                    case 4: bill += quantity * 80; break;
                    case 5: bill += quantity * 60; break;
                    case 6: bill += quantity * 80; break;
                    case 7: bill += quantity * 75; break;
                    default: System.out.println("Invalid Item!");
                }
                break;

            // ================= SNACKS =================
            case 3:
                System.out.println("===== SNACKS =====");
                System.out.println("1. Bingo - Rs 10");
                System.out.println("2. Samosa - Rs 30");
                System.out.println("3. Bajji - Rs 30");
                System.out.println("4. Kurkure - Rs 10");
                System.out.println("5. Tede Mede - Rs 10");
                System.out.println("6. Chips - Rs 20");
                System.out.println("7. Sandwich - Rs 40");

                System.out.print("Enter Item Choice: ");
                itemChoice = sc.nextInt();
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (itemChoice) {
                    case 1: bill += quantity * 10; break;
                    case 2: bill += quantity * 30; break;
                    case 3: bill += quantity * 30; break;
                    case 4: bill += quantity * 10; break;
                    case 5: bill += quantity * 10; break;
                    case 6: bill += quantity * 20; break;
                    case 7: bill += quantity * 40; break;
                    default: System.out.println("Invalid Item!");
                }
                break;

            // ================= BEVERAGES =================
            case 4:
                System.out.println("===== BEVERAGES =====");
                System.out.println("1. Thumbs Up - Rs 20");
                System.out.println("2. Sprite - Rs 20");
                System.out.println("3. Fanta - Rs 20");
                System.out.println("4. Pulpy - Rs 25");
                System.out.println("5. Tea - Rs 20");
                System.out.println("6. Coffee - Rs 10");
                System.out.println("7. Badam Milk - Rs 30");

                System.out.print("Enter Item Choice: ");
                itemChoice = sc.nextInt();
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (itemChoice) {
                    case 1: bill += quantity * 20; break;
                    case 2: bill += quantity * 20; break;
                    case 3: bill += quantity * 20; break;
                    case 4: bill += quantity * 25; break;
                    case 5: bill += quantity * 20; break;
                    case 6: bill += quantity * 10; break;
                    case 7: bill += quantity * 30; break;
                    default: System.out.println("Invalid Item!");
                }
                break;

            // ================= ICE CREAMS =================
            case 5:
                System.out.println("===== ICE CREAMS =====");
                System.out.println("1. Double Chocolate - Rs 40");
                System.out.println("2. Vanilla - Rs 25");
                System.out.println("3. Butterscotch - Rs 20");
                System.out.println("4. Black Currant - Rs 50");
                System.out.println("5. Kulfi - Rs 20");
                System.out.println("6. Chocobar - Rs 20");
                System.out.println("7. Strawberry - Rs 30");

                System.out.print("Enter Item Choice: ");
                itemChoice = sc.nextInt();
                System.out.print("Enter Quantity: ");
                quantity = sc.nextInt();

                switch (itemChoice) {
                    case 1: bill += quantity * 40; break;
                    case 2: bill += quantity * 25; break;
                    case 3: bill += quantity * 20; break;
                    case 4: bill += quantity * 50; break;
                    case 5: bill += quantity * 20; break;
                    case 6: bill += quantity * 20; break;
                    case 7: bill += quantity * 30; break;
                    default: System.out.println("Invalid Item!");
                }
                break;

            default:
                System.out.println("Invalid Category!");
        }

        double gst = bill * 0.05;
        double finalAmount = bill + gst;

        System.out.println("\n========= BILL =========");
        System.out.println("Subtotal : Rs " + bill);
        System.out.println("GST (5%) : Rs " + gst);
        System.out.println("Total    : Rs " + finalAmount);
        System.out.println("========================");

        sc.close();
    }
}