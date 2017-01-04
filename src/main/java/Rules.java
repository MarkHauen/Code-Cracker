import java.util.ArrayList;

public class Rules {

    static ArrayList<Code> numCorrectWellPlaced(ArrayList<Code> possiblesList, Code rule){
        ArrayList<Code> newList = new ArrayList<Code>();
        int counter;
        for (Code test : possiblesList) {
            counter = 0;
            if (test.x == rule.x) {
                counter++;
            }
            if (test.y == rule.y) {
                counter++;
            }
            if (test.z == rule.z) {
                counter++;
            }
            if (counter == rule.number) {
                newList.add(test);
            }
        }
        return newList;
    }

    static ArrayList<Code> numCorrectWrongPlaced(ArrayList<Code> list, Code rule){
        ArrayList<Code> newList = new ArrayList<Code>();
        int counter;
        for (Code test : list) {
            counter = 0;
            if ( test.numberArray.contains(rule.x) && ( !(test.x == rule.x) ) ) {
                counter++;
            }
            if ( test.numberArray.contains(rule.y) && ( !(test.y == rule.y) ) ) {
                counter++;
            }
            if ( test.numberArray.contains(rule.z) && ( !(test.z == rule.z) ) ) {
                counter++;
            }
            if ( counter == rule.number ) {
                newList.add(test);
            }
        }
        return newList;
    }

    static ArrayList<Code> nothingCorrect(ArrayList<Code> list, Code rule){
        ArrayList<Code> newList = new ArrayList<Code>();
        for (Code test : list){
            if ( !( (test.numberArray.contains(rule.x)) | (test.numberArray.contains(rule.y)) | (test.numberArray.contains(rule.z)) ) ) {
                newList.add(test);
            }
        }
        return newList;
    }
}
