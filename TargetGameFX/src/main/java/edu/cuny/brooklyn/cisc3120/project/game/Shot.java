package edu.cuny.brooklyn.cisc3120.project.game;

import javafx.scene.paint.Color;

public class Shot {
    private int x;
    private int y;
    private Color color;
    
    public Shot(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.BLUE;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Color getColor() {
        return color;
    }
}
