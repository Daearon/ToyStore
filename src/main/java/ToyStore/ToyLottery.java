package ToyStore;
import java.util.PriorityQueue;

public class ToyLottery {
    PriorityQueue<LotteryItem> items = new PriorityQueue<>();

    public void addToLottery(Toy toy, Integer count) {
        for(int i = 0; i < count; i++) {
            this.items.add(new LotteryItem(toy, count));
        }
    }

    public LotteryItem get(){
        return this.items.poll();
    }
}
