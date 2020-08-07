package StepDefinition;

import java.util.ArrayList;

public class TwoDarrayExample {

    public static void main(String[] args) {

//        String[][] myElements = {{"NameInput" , "AliFees"} , {"CodeInput" , "123"} };
//
//        System.out.println(myElements[1][1]);

        ArrayList<String> str1 = new ArrayList<>();

        str1.add("Elemetn1");
        str1.add("Elemetn2");
        str1.add("Elemetn3");

        for(int i = 0 ; i<str1.size() ; i++){

            System.out.println(str1.get(i).toUpperCase());

        }


    }
}
