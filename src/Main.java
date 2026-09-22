public class Main {
    public static void main(String[] args) {
        double springCost = 150.00;
        double summerCost = 300.00;
        double fallCost = 200.00;
        double winterCost = 450.00;

        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);
    }
}