package backtracking;

public class WordSearch {
    static public boolean isWordExist(char[][] mat, String word) {
        //search for initial char
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if (findWord(mat, word, j, i, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean findWord(char[][] mat, String word, int currX, int currY, int currLenght) {
        int wordLength = word.length();
        if (wordLength == currLenght) {
            return true;
        }

        if (currX < 0 || currY < 0 || currY >= mat.length || currX >= mat[currY].length) {
            return false;
        }

        if (mat[currY][currX] == word.charAt(currLenght)) {
            char temp = mat[currY][currX];
            mat[currY][currX] = '#';

            boolean res = findWord(mat, word, currX, currY - 1, currLenght + 1) ||
                    findWord(mat, word, currX + 1, currY, currLenght + 1) ||
                    findWord(mat, word, currX, currY + 1, currLenght + 1) ||
                    findWord(mat, word, currX - 1, currY, currLenght + 1);

            mat[currY][currX] = temp;
            return res;


        }
        return false;
    }
}