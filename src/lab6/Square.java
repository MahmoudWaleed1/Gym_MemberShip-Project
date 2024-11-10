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
public class Square extends AllShapes{
    private double side;
    public Square(int x, int y, Map<String, Double[]> properties, String name) {
        super(x, y, properties, name);
        Double[]sideArr = properties.get("Side"); 
        this.side = sideArr[0];
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.fillRect(x, y, (int)side, (int)side);
    }
    
}
