/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mahmoud Waleed
 */
 public abstract class AllShapes implements Shape {     
    protected int x;
    protected int y;
    private Point point;
    private Color color;
    private Color fillColor;
    Map<String, Double[]> properties;
    
    private String name;
    
    public AllShapes(int x, int y, Map<String, Double[]> properties, String name){
        this.x = x;
        this.y = y;
        Point point = new Point(x,y);
        this.properties = new HashMap<>(properties);
        this.name = name;
    }


    @Override
    public void setPosition(Point point) {
        this.point = point;
    }

    @Override
    public Point getPosition() {
        return point;    
    }

    @Override
    public void setProperties(Map<String, Double[]> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double[]> getProperties() {
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
public String getName() {
        return name; 
    }
}
