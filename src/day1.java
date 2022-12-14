import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        day4 a = new day4(reader("Cleanup.txt"));
        System.out.println(a.task2());
    }
    public static ArrayList<String> reader(String searchPath){
        ArrayList<String> s = new ArrayList<>();
        try {
            FileReader a = new FileReader("src/"+searchPath);
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
        ArrayList<String> calories = reader("calories.txt");
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
    public static ArrayList<Integer> sortedByHighestCalories(ArrayList<Elf> elves){
        ArrayList<Integer> calorieSum = new ArrayList<>();
        for (Elf elf : elves) {
            int sum = 0;
            for (int j = 0; j < elf.calories.size(); j++) {
                sum += elf.calories.get(j);
            }
            calorieSum.add(sum);
        }
        Collections.sort(calorieSum);
        return calorieSum;
    }
}
