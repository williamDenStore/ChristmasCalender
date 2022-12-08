import java.util.ArrayList;

public class day3 {
    ArrayList<String> rucksack;
    public day3(ArrayList<String> rucksack) {
        this.rucksack = rucksack;
    }
    public int task1(){
        int sum=0;
        for (int i = 0; i < rucksack.size(); i++) {
            sum += getCharacterValue(sum, i);
        }
        return sum;
    }

    private int getCharacterValue(int sum, int i) {
        String firstHalf = rucksack.get(i).substring(0,rucksack.get(i).length()/2);
        String secondHalf = rucksack.get(i).substring(rucksack.get(i).length()/2);
        for (int j = 0; j < firstHalf.length(); j++) {
            for (int k = 0; k < secondHalf.length(); k++) {
                if (firstHalf.charAt(j)== secondHalf.charAt(k)){
                    if (firstHalf.charAt(j)>=65 && firstHalf.charAt(j)<=90)
                        return firstHalf.charAt(j) - 38;
                        return firstHalf.charAt(j) - 96;
                }
            }
        }
        return sum;
    }
    public int task2 (){
        int sum=0;
        for (int i = 1; i < rucksack.size()+1; i++) {
            if (i%3==0) {
                sum+=everyThird(i);
            }
        }
        return sum;
    }

    private int everyThird(int i) {
        for (int j = 0; j < rucksack.get(i -3).length(); j++) {
            for (int k = 0; k < rucksack.get(i -2).length(); k++) {
                for (int l = 0; l < rucksack.get(i -1).length(); l++) {
                    if (rucksack.get(i -3).charAt(j)==rucksack.get(i -2).charAt(k)&& rucksack.get(i -2).charAt(k)==rucksack.get(i -1).charAt(l)){
                        if (rucksack.get(i-2).charAt(k)>=65 && rucksack.get(i-2).charAt(k)<=90)
                            return rucksack.get(i-2).charAt(k) - 38;
                        return rucksack.get(i-2).charAt(k) - 96;
                    }
                }
            }
        }
        return 0;
    }
}
