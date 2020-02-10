package Lecture9;

import java.util.ArrayList;

public class MazeRecursion {
    public static void main(String[] args) {
        maze(3,3,"");
        System.out.println(listmaze(3,3,""));
    }
    public static void maze(int row, int col, String processed){
        if (row == 1 && col == 1){
            System.out.println(processed);
            return;
        }
        if ( row > 1){
            maze(row-1,col,processed + "V");
        }
        if ( col > 1){
            maze(row, col-1, processed + "H");
        }
    }
    public static ArrayList listmaze(int row, int col, String processed){

            if (row == 1 && col == 1){
                ArrayList list = new ArrayList();
                list.add(processed);
                return list;
            }

        ArrayList list = new ArrayList();

            if ( row > 1){
                list.addAll(listmaze(row-1,col,processed + "V"));
            }
            if ( col > 1){
                list.addAll(listmaze(row, col-1, processed + "H"));
            }
        return list;
    }
}
