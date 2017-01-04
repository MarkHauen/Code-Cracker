import java.util.ArrayList;

public class App {


    private static Code code1_1 = new Code(6, 8, 2, "one well");
    private static Code code1_2 = new Code(6, 1, 4, "one wrong");
    private static Code code1_3 = new Code(2, 0, 6, "two wrong");
    private static Code code1_4 = new Code(7, 3, 8, "nothing");
    private static Code code1_5 = new Code(8, 7, 0, "one wrong");
    private static Code[] game1 = {code1_1,code1_2,code1_3,code1_4,code1_5};

    private static Code code2_1 = new Code(5, 4, 8, "one well");
    private static Code code2_2 = new Code(5, 3, 0, "nothing");
    private static Code code2_3 = new Code(1, 5, 7, "two wrong");
    private static Code code2_4 = new Code(8, 0, 6, "one wrong");
    private static Code code2_5 = new Code(6, 4, 7, "one wrong");
    private static Code[] game2 = {code2_1,code2_2,code2_3,code2_4,code2_5};



    public static void main(String[] args) {
        ArrayList<Code> possibles = generatePossibles();

        for ( Code code : game1 ) {
            possibles = runTest(possibles, code);
        }
        System.out.println("Game one result is: " + possibles.get(0).printNumbers());


        possibles = generatePossibles();
        for ( Code code : game2 ) {
            possibles = runTest(possibles, code);
        }
        System.out.println("Game one result is: " + possibles.get(0).printNumbers());

    }

    private static ArrayList<Code> runTest(ArrayList<Code> list, Code code){
        if(code.rule[0].equalsIgnoreCase("nothing")){
            list = Rules.nothingCorrect(list,code);
        } else if (code.rule[1].equalsIgnoreCase("well")){
                list = Rules.numCorrectWellPlaced(list,code);
            } else {
            list = Rules.numCorrectWrongPlaced(list, code);
        }
        return list;
    }

    private static ArrayList<Code> generatePossibles() {
        ArrayList<Code> list = new ArrayList<Code>();
        for(int x = 0; x < 10; x++){
            for(int y = 0; y < 10; y++){
                for(int z = 0; z < 10; z++){
                    list.add(new Code(x,y,z,"n o n e"));
                }
            }
        }
        return list;
    }
}

