public class Soal7 {
    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] firstArray = {2,5,3};
        int[] secondArray = {9,5,3};
        int[] thirdArray = {2,4,9};
        int[] fourthArray = {10,11,12};
        int[] fifthArray = {13,14,15};
        int[] sixthArray = {16,17,18};
        int[] seventhArray = {19,20,21};
        int[] eighthArray = {22,23,24};
        int[] ninethArray = {25,56,27};

        //Two Dimensional Array
        int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};

        int [][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};

        int [][] twoDimensionalArray3 = {seventhArray, eighthArray, ninethArray};

        //Third Dimensional Array
        int [][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};

        for (int i = 0; i < 3; i++)
        {
            System.out.print("{ ");
            for(int j = 0; j < 3; j++)
            {
                System.out.print("{");
                for (int l = 0; l < 3; l++)
                {
                    System.out.print(threeDimensionalArray[i][j][l] + " ");
                }
                System.out.print("} ");
            }
            System.out.print("} ");
        }
    }
}
