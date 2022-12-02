import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Elf> elves = elfCreator();
        System.out.println(highestCalories(elves));
    }
    public static ArrayList<String> reader(){
        ArrayList<String> s = new ArrayList<>();
        try {
            FileReader a = new FileReader("src/calories.txt");
            Scanner myReader = new Scanner(a);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                s.add(data);
            }
            myReader.close();
        }catch (Exception e){
            System.out.println("error reading");
        }
    return s;
    }
    public static ArrayList<Elf> elfCreator(){
        ArrayList<Elf> elves = new ArrayList<>();
        ArrayList<String> calories = reader();
        elves.add(new Elf());
        for (String calory : calories) {
            if (calory.isEmpty()) {
                elves.add(new Elf());
            } else {
                elves.get(elves.size() - 1).addCalories(Integer.parseInt(calory));
            }
        }
        return elves;
    }
    public static int highestCalories(ArrayList<Elf> elves){
        int highest=0;
        for (Elf elf : elves) {
            int sum = 0;
            for (int j = 0; j < elf.calories.size(); j++) {
                sum += elf.calories.get(j);
            }
            if (sum > highest)
                highest = sum;
        }
        return highest;
    }
}
