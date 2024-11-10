/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Graphics;

import java.util.Map;

/**
 *
 * @author Mahmoud Waleed
 */
public class Circle extends AllShapes {
    private double radius;

    public Circle(int x, int y, Map<String, Double[]> properties, String name) {
        super(x, y, properties, name);
        Double[]radiusArr = properties.get("Radius"); 
        this.radius = radiusArr[0];
    }
 
    

    @Override
    public void draw(Graphics canvas) {
        canvas.drawOval(x, y, 2*(int)radius, 2*(int)radius);
    }

    
}
