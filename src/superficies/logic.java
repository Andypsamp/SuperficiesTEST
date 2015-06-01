/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author VfromVendetta
 */
public class logic {
    public static float calcular(Modelo contenedor){
        float superficie = 0;
        if (contenedor.getSelectArea() == 0){
            contenedor.setSquareArea(contenedor.getSideLength()*contenedor.getSideLength());
            superficie = contenedor.getSquareArea();
        }else if(contenedor.getSelectArea() == 1){
            contenedor.setCircleArea((float) 3.14159265 *(contenedor.getRadius()*contenedor.getRadius()));
            superficie = contenedor.getCircleArea();
        }else if(contenedor.getSelectArea()== 2){
            contenedor.setTriangleArea((contenedor.getBaseLength()*contenedor.getHeight())/2);
            superficie = contenedor.getTriangleArea();
        }else if(contenedor.getSelectArea()== 3){
            contenedor.setRectangleArea(contenedor.getSideHeight()*contenedor.getSideLength());
            superficie = contenedor.getRectangleArea();
        }
        return superficie;
    }
}
