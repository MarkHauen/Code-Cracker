import java.util.ArrayList;
import java.util.Arrays;

class Code {

    int x;
    int y;
    int z;
    ArrayList<Integer> numberArray;
    String[] rule;
    int number;

    private int parseNumber(String[] rule) {
        if(rule[0].equalsIgnoreCase("one")){
            return 1;
        } else
            return 2;
    }

    Code(int x, int y, int z, String rule){
        this.x = x;
        this.y = y;
        this.z = z;
        this.rule = rule.split(" ");
        this.number = parseNumber(this.rule);
        this.numberArray = new ArrayList<Integer>(Arrays.asList(x,y,z));
    }

    String printNumbers() {
        return "" + x + y + z;
    }
}
