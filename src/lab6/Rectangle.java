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
public class Rectangle extends AllShapes{

    private double length;
    private double width;
    public Rectangle(int x, int y, Map<String, Double[]> properties, String name) {
        super(x, y, properties, name);
        Double[]rectArr = properties.get("Side"); 
        this.length = rectArr[0];
        this.width = rectArr[1];
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.fillRect(x, y, (int)length, (int)width);
    }
    
}
