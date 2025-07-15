import java.util.*;
class Item {
    int weight;
    int profit;
    double ratio;
    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit / weight;
    }
}
public class Knapsack {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] profits = {60, 100, 120};
        int capacity = 50;
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            items.add(new Item(weights[i], profits[i]));
        }
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));
        double totalProfit = 0.0;
        for (Item item : items) {
            if (capacity == 0) break;
            if (item.weight <= capacity) {
                totalProfit += item.profit;
                capacity -= item.weight;
            } else {
                totalProfit += item.ratio * capacity;
                capacity = 0;
            }
        }

        System.out.println("Maximum profit: " + totalProfit);
    }
}