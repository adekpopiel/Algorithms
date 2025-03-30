package day10;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Day10 {

    private final String WEST = "west";
    private final String NORTH = "north";
    private final String EAST = "east";
    private final String SOUTH = "south";


    /*
    The pipes are arranged in a two-dimensional grid of tiles:

    | is a vertical pipe connecting north and south.
    - is a horizontal pipe connecting east and west.
    L is a 90-degree bend connecting north and east.
    J is a 90-degree bend connecting north and west.
    7 is a 90-degree bend connecting south and west.
    F is a 90-degree bend connecting south and east.
    . is ground; there is no pipe in this tile.
    S is the starting position of the animal; there is a pipe on this tile, but your sketch doesn't show what shape the pipe has.
     */

    public ArrayList<Node> partOne(final String file) {
        Scanner sc = new Scanner(getClass().getClassLoader().getResourceAsStream(file));


        int currentX = 0;
        int currentY = 0;
        int linesCount = 0;

        // Read input
        ArrayList<ArrayList<String>> input = new ArrayList<>();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            ArrayList<String> lineStr = new ArrayList(Arrays.stream(line.split("")).toList());
            if (lineStr.contains("S")) {
                 currentY = linesCount;
                 currentX = lineStr.indexOf("S");
            }
            input.add(lineStr);
            linesCount++;
        }
        // Create a polygon starting from S
        ArrayList<Node> pipe = new ArrayList<>();
        Node startingPoint = new Node(currentX, currentY, "S");
        pipe.add(startingPoint);

        Node next;
        String originDirection = "";
        String north = input.get(currentY - 1).get(currentX);
        String west = input.get(currentY).get(currentX - 1);
        String south = input.get(currentY + 1).get(currentX);
        String east = input.get(currentY).get(currentX + 1);

        String nextSign = "";
        if (isNorthEligible(north)) {
            nextSign = north;
            currentY--;
            originDirection = SOUTH;
        }
        else if (isSouthEligible(south)) {
            nextSign = south;
            currentY++;
            originDirection = NORTH;
        }

        else if (isEastEligible(east)) {
            nextSign = east;
            currentX++;
            originDirection = WEST;
        } else if (isWestEligible(west)) {
            nextSign = west;
            currentX--;
            originDirection = EAST;
        }

        next = new Node(currentX, currentY, nextSign);
        pipe.add(next);

        while(!next.sign.equals(startingPoint.sign)) {
            String nextDirection = nextDirection(next.sign, originDirection);
            switch (nextDirection) {
                case NORTH : {
                    nextSign = input.get(currentY - 1).get(currentX);
                    currentY--;
                    originDirection = SOUTH;
                    break;
                }
                case SOUTH : {
                    nextSign = input.get(currentY + 1).get(currentX);;
                    currentY++;
                    originDirection = NORTH;
                    break;
                }
                case EAST: {
                    nextSign = input.get(currentY).get(currentX + 1);;
                    currentX++;
                    originDirection = WEST;
                    break;
                }
                case WEST: {
                    nextSign = input.get(currentY).get(currentX - 1);;
                    currentX--;
                    originDirection = EAST;
                }
            }
            next = new Node(currentX, currentY, nextSign);
            if (!Objects.equals(next.sign, startingPoint.sign)) {
                pipe.add(next);
            }
        }
        System.out.println("Result: " + pipe.size()/2);
        return pipe;
    }

    public void partTwo(ArrayList<Node> pipe, final String file) {
        //build polygon
        Path2D path = new Path2D.Double();

        path.moveTo(pipe.get(0).x, pipe.get(0).y);


        for (int i = 1; i < pipe.size(); i++) {
            path.lineTo(pipe.get(i).x, pipe.get(i).y);
        }

        path.closePath();

        Scanner sc = new Scanner(getClass().getClassLoader().getResourceAsStream(file));

        ArrayList<ArrayList<String>> input = new ArrayList<>();
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            ArrayList<String> lineStr = new ArrayList(Arrays.stream(line.split("")).toList());
            input.add(lineStr);
        }

        //iterate through all input points
        int numberOfPointsEnclosedByThePipe = 0;
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.get(i).size(); j++) {
                Point2D point  = new Point2D.Double(j, i);
                final int x = j;
                final int y = i;
                Optional<Node> result = pipe.stream().filter(n -> n.x == x && n.y == y).findFirst();
                if (path.contains(point) && result.isEmpty()) {
                    numberOfPointsEnclosedByThePipe++;
                    System.out.print("I");
                } else {
                    if (result.isPresent()) {
                        System.out.print(input.get(i).get(j));
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Result part two: " + (numberOfPointsEnclosedByThePipe));
    }

    private String nextDirection(String currentSign, String originalDirection) {
        switch (originalDirection) {
            case SOUTH: {
                switch (currentSign) {
                    case "7":
                        return WEST;
                    case "F":
                        return EAST;
                    case "|":
                        return NORTH;
                }
            }
            case NORTH: {
                switch (currentSign) {
                    case "L":
                        return EAST;
                    case "|":
                        return SOUTH;
                    case "J":
                        return WEST;
                }
            }
            case EAST: {
                switch (currentSign) {
                    case "-":
                        return WEST;
                    case "L":
                        return NORTH;
                    case "F":
                        return SOUTH;
                }
            }
            case WEST : {
                switch (currentSign) {
                    case "-":
                        return EAST;
                    case "J":
                        return NORTH;
                    case "7":
                        return SOUTH;
                }
            }
        }
        throw new IllegalStateException("Something went wrong");
    }

    private boolean isNorthEligible(String sign) {
        return sign.equals("|") || sign.equals("7") || sign.equals("F");
    }

    private boolean isSouthEligible(String sign) {
        return sign.equals("|") || sign.equals("L") || sign.equals("J");
    }

    private boolean isEastEligible(String sign) {
        return sign.equals("-") || sign.equals("7") || sign.equals("J");
    }

    private boolean isWestEligible(String sign) {
        return sign.equals("-") || sign.equals("L") || sign.equals("F");
    }

    public static class Node {
        int x;
        int y;
        String sign;

        public Node(int x, int y, String symbol) {
            this.x = x;
            this.y = y;
            this.sign = symbol;
        }
    }

    public static void main(String[] args) {
        Day10 day10 = new Day10();
        ArrayList<Node> pipe = day10.partOne("input.txt");
        day10.partTwo(pipe, "input.txt");
    }

}


