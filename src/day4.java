import java.util.ArrayList;

public class day4 {
    ArrayList<String> cleaningChores;
    public day4(ArrayList<String> cleaningChores) {
        this.cleaningChores = cleaningChores;
    }
    public int task1(){
        int sum=0;
        String[] splitEachElf;
        String[][] splitRange = new String[2][2];
        for (String cleaningChore : cleaningChores) {
            splitEachElf = cleaningChore.split(",");
            splitRange[0] = splitEachElf[0].split("-");
            splitRange[1] = splitEachElf[1].split("-");
            if (((Integer.parseInt(splitRange[0][0]) <= Integer.parseInt(splitRange[1][0])) && (Integer.parseInt(splitRange[0][1]) >= Integer.parseInt(splitRange[1][1])))
                    || (Integer.parseInt(splitRange[1][0]) <= Integer.parseInt(splitRange[0][0])) && (Integer.parseInt(splitRange[1][1]) >= Integer.parseInt(splitRange[0][1])))
                sum++;


        }
        return sum;
    }
    public int task2(){
        int sum=0;
        String[] splitEachElf;
        String[][] splitRange = new String[2][2];
        for (String cleaningChore : cleaningChores) {
            splitEachElf = cleaningChore.split(",");
            splitRange[0] = splitEachElf[0].split("-");
            splitRange[1] = splitEachElf[1].split("-");
            if (((Integer.parseInt(splitRange[0][0]) <= Integer.parseInt(splitRange[1][0])) && (Integer.parseInt(splitRange[0][1]) >= Integer.parseInt(splitRange[1][0])))
                    || (Integer.parseInt(splitRange[1][0]) <= Integer.parseInt(splitRange[0][0])) && (Integer.parseInt(splitRange[1][1]) >= Integer.parseInt(splitRange[0][0])))
                sum++;


        }
        return sum;
    }

}
