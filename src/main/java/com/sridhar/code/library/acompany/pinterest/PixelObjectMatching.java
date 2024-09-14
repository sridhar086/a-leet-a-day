package com.sridhar.code.library.acompany.pinterest;

import java.util.LinkedList;
import java.util.Queue;


// Your previous Plain Text content is preserved below:

// Pad for Sridhar Ramasamy - Senior Backend Software Engineer

// A Pinterest pin is a 2D grid of pixels that makes up an image. There are some objects in the pin that we can identify, such as a purse or a pair of shoes. Each object is composed of a set of connected pixels inside the pin.

// You are given an API function boolean isSameObject(Pixel p1, Pixel p2) which returns true if the input pixels are part of the same object. It will return false if they are not part of the same object, or if one of the pixels does not have any object at all.


//  X X X _ _
//  _ X Y Y _
//  _ Y Y _ _
//  Z Z _ _ _


//  X X X _ _
//  _ X Y Y _
//  _ Y Y _ _
//  Z Z _ X X


//  X X X _ _
//  _ X Y Y _
//  _ Y Y _ _
//  Z Z _ X X


// There are only three types of objects in the given matrix defined by X Y and z
// leverage this function to count the number of objects in the pin



public class PixelObjectMatching {

    record Pixel(int x, int y) {
    }

    static Pixel[][] createPin(int width, int height) {
        Pixel[][] pin = new Pixel[width][height];
        for (int i = 0; i != pin.length; i++) {
            for (int j = 0; j != pin[i].length; j++) {
                pin[i][j] = new Pixel(i, j);
            }
        }
        return pin;
    }


    static boolean isSameObject(Pixel p1, Pixel p2) {
        Pixel[] x = { new Pixel(2, 1), new Pixel(3, 1), new Pixel(3, 2), new Pixel(4, 2), new Pixel(3, 3), new Pixel(4, 3) };
        Pixel[] y = { new Pixel(2, 3), new Pixel(2, 4), new Pixel(3, 4), new Pixel(3, 5) };
        Pixel[] z = { new Pixel(6, 4), new Pixel(7, 4), new Pixel(6, 5), new Pixel(6, 6) };
        Pixel[][] all = { x, y, z };

        for (Pixel[] object : all) {
            boolean p1Exists = false, p2Exists = false;
            for (Pixel p : object) {
                if (p.x == p1.x && p.y == p1.y) {
                    p1Exists = true;
                }
                if (p.x == p2.x && p.y == p2.y) {
                    p2Exists = true;
                }
                if (p1Exists && p2Exists) {
                    return true;
                }
            }
        }

        return false;
    }


    static int countObjects(Pixel[][] pin) {
        // Code solution here!
        boolean[][] visited = new boolean[pin.length][pin[0].length];
        int count = 0;

        for(int i = 0; i< visited.length; i++) {
            for(int j = 0; j < visited.length; j++) {
                // check if two pixels are not visited and they belong to same object, then proceed
                // into the loop
                if(!visited[i][j] && checkAdjacency(pin, i, j, i, j)) {

                    Queue<int[]> queue = new LinkedList<>();
                    queue.add((new int[]{i, j}));
                    boolean queueFlag = false;
                    while(!queue.isEmpty()) {
                        int[] arr = queue.poll();
                        visited[arr[0]][arr[1]] = true;
                        int before = queue.size();
                        generateAdjacencies(arr[0], arr[1], pin.length, pin[0].length, queue, pin, visited);
                        int after = queue.size();

                        if(!queueFlag && after > before) queueFlag = true;
                    }
                    if(queueFlag) count++;
                }
            }
        }
        return count;

    }

    static void generateAdjacencies(int i, int j, int xmax, int ymax, Queue<int[]> queue, Pixel[][] pin, boolean[][] visited) {

        System.out.println("i: " + i + " j:" + j);
        if(i+1 >= 0 && i+1 < xmax && checkAdjacency(pin, i, j, i+1, j) && !visited[i+1][j]) {
            queue.add(new int[]{i+1, j});
        }
        if(i-1 >= 0 && i-1 < xmax && checkAdjacency(pin, i, j, i-1, j) && !visited[i-1][j]) {
            queue.add(new int[]{i-1, j});
        }
        if(j-1 >= 0 && j-1 < ymax && checkAdjacency(pin, i, j, i, j-1) && !visited[i][j-1]) {
            queue.add(new int[]{i, j-1});
        }
        if(j+1 >= 0 && j+1 < ymax && checkAdjacency(pin, i, j, i, (j+1)) && !visited[i][j+1]) {
            queue.add(new int[]{i, j+1});
        }
    }

    static boolean checkAdjacency(Pixel[][] pin, int i, int j, int nexti, int nextj) {

        // Check and validate i and j on all the 4 directions
        return isSameObject(pin[i][j], pin[nexti][nextj]);

    }

    // testing
    public static void main(String[] args) {
        Pixel[][] pin = createPin(8, 8);
        int numObjects = countObjects(pin);
        System.out.println("Number of objects in the pin: " + numObjects);


    }
}
