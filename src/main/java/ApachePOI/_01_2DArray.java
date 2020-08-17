package ApachePOI;

public class _01_2DArray {

    public static void main(String[] args) {

        String[][] zoo = {{"Lion", "3"} , {"Tiger" ,"2"} , {"Zebra", "4"} , {"Bear" , "8"}};

        System.out.println(zoo[2][0]);

//      Print all the data from the 2d array use a for loop

        System.out.println("-------------------------");

        for(int i = 0 ; i <zoo.length ; i++){

            for(int j = 0 ; j < zoo[i].length ; j++){

                System.out.println(zoo[i][j]);
            }
        }

//       Print the next data for the zebra



    }

}
