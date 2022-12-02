import java.util.ArrayList;

public class Elf {
    ArrayList<Integer> calories = new ArrayList<>();

    public Elf() {
    }
    public void addCalories(int a){
        calories.add(a);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "calories=" + calories +
                '}';
    }
}
