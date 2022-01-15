package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int count = 1;
        int volumeOfArray = rows*columns;
        int hRow = 0;
        int vColumn = 0;
        if (rows == 1){
            count = 0;
            for (int i=0; i<columns; i++){
                count++;
                array[hRow][vColumn] = count;
                vColumn++;
            }
            return array;
        }
        for (int i=0;i<columns;i++){
            array[hRow][vColumn] = count;
            count++;
            if (i<columns-1)
                vColumn++;
        }
        for (int i=0; i<rows; i++){
            if (i<rows-1)
                hRow++;
            array[hRow][vColumn] = count;
            if (i<rows-2)
                count++;
        }
        for (int i=0;i<columns; i++){
            array[hRow][vColumn] = count;
            count++;
            if (vColumn>0){
                vColumn--;
            } else
                hRow--;
        }

        while (array[hRow][vColumn] == 0){
            array[hRow][vColumn] = count;
            count++;
            hRow--;
        }
        hRow++;
        while (volumeOfArray+1 != count){
            while (array[hRow][vColumn+1] == 0){
                vColumn++;
                array[hRow][vColumn] = count;
                count++;
            }
            while (array[hRow+1][vColumn] == 0){
                hRow++;
                array[hRow][vColumn] = count;
                count++;
            }
            while (array[hRow][vColumn-1] == 0){
                vColumn--;
                array[hRow][vColumn] = count;
                count++;
            }
            while (array[hRow-1][vColumn] == 0){
                hRow--;
                array[hRow][vColumn] = count;
                count++;
            }
        } return array;
    }
}
