package DynamicProgramming;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RobotInGrid {

    public ArrayList<Point> identifyPath(boolean[][] robot_maze){

        ArrayList<Point> path = new ArrayList<>();
        HashMap<Point, Boolean> noPath = new HashMap<>();

        if(robot_maze.length == 0 || robot_maze == null){
            return null;
        }
        if(checkIfPath(robot_maze, robot_maze.length - 1, robot_maze[0].length - 1, path, noPath)) {
            return path;
        }
        return null;
    }

    public boolean checkIfPath(boolean[][] maze, int row, int column, ArrayList<Point> path, HashMap<Point, Boolean> noPath){

        if(row < 0 || column < 0 || !maze[row][column]){
            return false;
        }

        Point p = new Point(row, column);

        if(noPath.containsKey(p)){
            return noPath.get(p);
        }

        boolean pointAtOrigin = row == 0 || column == 0;
        boolean isPath = false;

        if (pointAtOrigin || checkIfPath(maze, row, column - 1, path, noPath) || checkIfPath(maze, row - 1, column, path, noPath)) {
            path.add(p);
            isPath = true;
            return isPath;
        }

        noPath.put(p, isPath);
        return isPath;
    }


}
