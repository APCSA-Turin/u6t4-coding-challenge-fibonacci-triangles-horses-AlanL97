package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void setX(int newX) {
      x = newX;
    }

    public void setY(int newY) {
      y = newY;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      double xlength = Math.abs(x-other.x);
      double ylength = Math.abs(y-other.y);
      return Math.sqrt(Math.pow(xlength, 2) + Math.pow(ylength, 2));
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      return "(" + x + ", " + y + ")";
    }
  }
  