/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Albertaco
 */
public class PoligonoRegular extends Forma {
       
    public PoligonoRegular (int _posX, int _posY, Color _color, boolean _relleno, int _ladosPoligono){
        super(_posX, _posY, new int [_ladosPoligono], new int [_ladosPoligono], _color, _relleno, _ladosPoligono);
    }  
}
