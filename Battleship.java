//Created by Wan Koo
// 09/03/2018
//CS 3361

import java.util.Scanner;

public class Battleship {

    //method used to find get the left, right, bottom, and top of where the box is.
    public static void getAdjacent(int x, int y) {

        System.out.println("The adjacent tiles are: ");
        /*
        corners are a special case as the have more spaces that are not adjacent
        as compared to the sides of the box.
         */
        //bottom left corner piece
        if(x==0 && y ==0) {
            System.out.println("There is no left");
            System.out.println("The right is " + x+1 + ", " + y);
            System.out.println("The top is " + x + ", " + y+1);
            System.out.println("There is no bottom");

        }

        //top right corner piece
        else if(x==9 && y==9) {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("There is no right");
            System.out.println("There is no top");
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }

        //top left corner piece
        else if (x==0 && y==9) {
            System.out.println("There is no left");
            System.out.println("The right is " + (x + 1) + ", " + y);
            System.out.println("There is no top");
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }

        //bottom right corner piece
        else if (x==9 && y==0) {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("There is no right");
            System.out.println("The top is " + x + ", " + (y + 1));
            System.out.println("There is no bottom");
        }
        //used when in the left side of the square
        else if (x == 0){
            System.out.println("There is no left");
            System.out.println("The right is " + (x + 1) + ", " + y);
            System.out.println("The top is " + x + ", " + (y + 1));
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }

        //used when in on the right side of the square
        else if (x == 9) {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("There is no right");
            System.out.println("The top is " + x + ", " + (y + 1));
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }

        //used when on the top side of the square
        else if (y == 9) {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("The right is " + (x + 1) + ", " + y);
            System.out.println("There is no top");
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }

        //used when on the bottom of the square
        else if (y == 0) {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("The right is " + (x + 1) + ", " + y);
            System.out.println("The top is " + x + ", " + (y + 1));
            System.out.println("There is no bottom");
        }

        //used to print if there are no restraints regarding where the box is.
        else {
            System.out.println("The left is " + (x - 1) + ", " + y);
            System.out.println("The right is " + (x + 1) + ", " + y);
            System.out.println("The top is " + x + ", " + (y + 1));
            System.out.println("The bottom is " + x + ", " + (y - 1));
        }
    }

    public static void getDiagonal(int x, int y) {

        System.out.println("The diagonal tiles are: ");
        /*
        corners are a special case as the have more spaces that are not adjacent
        as compared to the sides of the box.
         */
        //bottom left corner piece
        if(x==0 && y ==0) {
            System.out.println("There is no top left");
            System.out.println("The top right is " + (x+1) + ", " + (y+1));
            System.out.println("There is no bottom right");
            System.out.println("There is no bottom left");

        }

        //top right corner piece
        else if(x==9 && y==9) {
            System.out.println("The bottom left is " + (x - 1) + ", " + (y-1));
            System.out.println("There is no top right");
            System.out.println("There is no top left");
            System.out.println("There is no bottom right ");
        }

        //top left corner piece
        else if (x==0 && y==9) {
            System.out.println("There is no top left");
            System.out.println("There is no bottom left ");
            System.out.println("There is no top left");
            System.out.println("The bottom right is " + (x+1) + ", " + (y - 1));
        }

        //bottom right corner piece
        else if (x==9 && y==0) {
            System.out.println("The top left is " + (x - 1) + ", " + (y+1));
            System.out.println("There is no bottom right");
            System.out.println("There is no top right ");
            System.out.println("There is no bottom left");
        }

        //leftmost
        else if (x == 0){
            System.out.println("There is no top left");
            System.out.println("The top right is " + (x + 1) + ", " + (y + 1));
            System.out.println("There is no bottom left");
            System.out.println("The bottom right is " + (x + 1) + ", " + (y - 1));
        }

        //rightmost
        else if (x == 9){
            System.out.println("There is no top right");
            System.out.println("The top left is " + (x - 1) + ", " + (y + 1));
            System.out.println("There is no bottom right");
            System.out.println("The bottom left is " + (x - 1) + ", " + (y - 1));
        }

        //top
        else if (y == 9){
            System.out.println("There is no top left");
            System.out.println("The bottom right is " + (x + 1) + ", " + (y - 1));
            System.out.println("There is no top right");
            System.out.println("The bottom right is " + (x - 1) + ", " + (y + 1));
        }

        //bottom
        else if (y == 0){
            System.out.println("There is no bottom left");
            System.out.println("The top right is " + (x + 1) + ", " + (y + 1));
            System.out.println("There is no bottom right");
            System.out.println("The top right is " + (x - 1) + ", " + (y + 1));
        }

        //used for all other instances
        else {
            //System.out.println("---------------------------");
            System.out.println("The top left is " + (x - 1) + ", " + (y + 1));
            System.out.println("The top right is " + (x + 1) + ", " + (y + 1));
            System.out.println("The bottom left is " + (x - 1) + ", " + (y - 1));
            System.out.println("The bottom right is " + (x + 1) + ", " + (y - 1));
        }
    }

    public static boolean[][] getAllAdjacent (int x, int y) {
        boolean[][] arr = new boolean[10][10];

        // corner pieces are used as base cases
        //bottom left corner
        if(x == 0 && y == 0) {
            arr[x+1][y] = true;
            arr[x][y+1] = true;
            arr[x+1][y+1] = true;
        }

        //top left corner
        else if(x == 0 && y == 9) {
            arr[x+1][y] = true;
            arr[x][y-1] = true;
            arr[x+1][y-1] = true;
        }

        //bottom right corner
        else if(x == 9 && y == 0) {
            arr[x][y+1] = true;
            arr[x-1][y+1] = true;
            arr[x-1][y] = true;
        }

        //top right corner
        else if(x == 9 && y == 9) {
            arr[x-1][y] = true;
            arr[x][y-1] = true;
            arr[x-1][y-1] = true;
        }

        //used for the leftmost side
        else if(x == 0) {
            arr[x][y+1] = true;
            arr[x+1][y+1] = true;
            arr[x+1][y] = true;
            arr[x+1][y-1] = true;
            arr[x][y-1] = true;
        }

        //used for the rightmost side
        else if (x == 9) {
            arr[x-1][y] = true;
            arr[x-1][y+1] = true;
            arr[x+1][y-1] = true;
            arr[x][y-1] = true;
            arr[x-1][y-1] = true;
        }

        //used for the bottommost side
        else if (y == 0) {
            arr[x-1][y] = true;
            arr[x-1][y+1] = true;
            arr[x][y+1] = true;
            arr[x+1][y+1] = true;
            arr[x+1][y] = true;
        }
        //used for the top most side
        else if (y == 9) {
            arr[x-1][y] = true;
            arr[x+1][y] = true;
            arr[x+1][y-1] = true;
            arr[x][y-1] = true;
            arr[x-1][y-1] = true;
        }
        //used for all the other cases
        else {
            arr[x-1][y] = true;
            arr[x-1][y+1] = true;
            arr[x][y+1] = true;
            arr[x+1][y+1] = true;
            arr[x+1][y] = true;
            arr[x+1][y-1] = true;
            arr[x][y-1] = true;
            arr[x-1][y-1] = true;
        }

        return arr;
    }

    public static void printAdjacent(boolean[][] arr) {
        System.out.println("The adjacent tiles are: ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]) {
                    System.out.print("[" + i + ","  + j + "]" + " ");
                }
            }
        }
    }

    //this gets the users input so that we can get the coordinates
    public static String getUserInput() {
        String coordinates;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input the coordinates");
        System.out.println("Valid coordinates include the range of a-i or 0-9");
        System.out.println("Valid formats include: {1,9}, 11, 1 0, a9, (a,0), a 0, A9");

        coordinates = userInput.nextLine();

        return coordinates;
    }

    public static String validUserInput(String coordinates) {
        if (coordinates.length() > 2 || coordinates.length() == 1) {
            System.out.println("Please input correct format");
            coordinates = getUserInput();
        }
        return coordinates;
    }

    //this will parse the user input into just numbers
    public static int parseUserInput(String userInput) {
        int x = Integer.parseInt(userInput.replaceAll("[\\D]", ""));

        /*if (x > 99) {
            System.out.println("Please input correct format");

        }*/
        //System.out.print(x);
        return x;
    }

    //gets the first coordinate of the square by subtracting the mod and dividing by 10.
    public static int firstCoordinate(int x, int y) {
        /* subtracts the mod from the original number giving you a
        multiple of ten which can then be divided to give you a single digit
        which is the first coordinate ex: 85 - 5 = 80/10 = 8.
         */
        return ((x-y)/10);
    }

    //gets the second coordinate
    public static int secondCoordinate(int x) {
        x = x % 10; //divides using mod which will give you the last num

        return x;
    }

    //checks to see if the first character is a character
    public static boolean checkIfChar (String coordinates) {
        String x = coordinates.replaceAll("[^a-zA-Z]", "");
        if (x.length() == 1) {
            return true;
        }
        return false;
    }

    //changes the character into a number
    public static int firstCoordinateIfChar (String coordinate) {
        coordinate.toLowerCase();
        int firstCoordinate = 0;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        for (int i = 0; i < arr.length; i++) {
            if (coordinate.equals(arr[i])) {
                firstCoordinate = i;
                return firstCoordinate;
            }
        }
        return firstCoordinate;
    }

    public static void main(String[] args) {

        String input = getUserInput();
        String check = validUserInput(input);

        //checks to see if there is a character included in the input
        if (checkIfChar(input)) {
            int x = firstCoordinateIfChar(input);
            int y = secondCoordinate(parseUserInput(check));

            getAdjacent(x,y);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            getDiagonal(x,y);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            printAdjacent(getAllAdjacent(x,y));
        }

        //if there is no character it simply runs program with numbers
        else {
            int x = firstCoordinate(parseUserInput(check), secondCoordinate(parseUserInput(check)));
            int y = secondCoordinate(parseUserInput(check));

            getAdjacent(x, y);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            getDiagonal(x,y);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            printAdjacent(getAllAdjacent(x,y));
        }
    }
}

