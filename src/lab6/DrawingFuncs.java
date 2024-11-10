/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Mahmoud Waleed
 */
public class DrawingFuncs implements DrawingEngine {
    private ArrayList<Shape> shapes;
    
    public DrawingFuncs(){
        shapes = new ArrayList<>();
    }
    
    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void removeShape(Shape shape) {
       shapes.remove(shape);
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }

    @Override
    public void refresh(Graphics canvas) {
        for(Shape shape: shapes){
            shape.draw(canvas);
        }
    }
    
}
