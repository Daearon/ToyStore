package ToyStore;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("В магазине была проведена лотерея игрушек");
        ToyLottery lottery = new ToyLottery();
        lottery.addToLottery(new Toy(1, "Кукла"), 6);
        lottery.addToLottery(new Toy(2, "Мягкая игрушка"), 3);
        lottery.addToLottery(new Toy(3, "Конструктор"), 1);
        recordingOfResults(lottery);
    }

    public static void recordingOfResults (ToyLottery lottery) throws IOException{
        BufferedWriter outputWriter;
        outputWriter = new BufferedWriter(new FileWriter("lottery.txt"));
        LotteryItem result = lottery.get();
        while(result != null){
            outputWriter.write(result.toString());
            outputWriter.newLine();
            result = lottery.get();
        }
        outputWriter.flush();
        outputWriter.close();
    }
}
