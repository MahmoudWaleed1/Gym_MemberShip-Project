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
public class Line extends AllShapes {
    private int x1;
    private int y1;

    public Line(int x, int y, Map<String, Double[]> properties, String name) {
        super(x, y, properties, name);
        Double[] point = properties.get("Point");
        this.x1 = point[0].intValue();
        this.y1 = point[1].intValue();
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.drawLine(x, y, x1, y1);
    }
}
