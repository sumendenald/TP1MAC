/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class TestPoint {
    public static void main(String[] args) {
        Point point00 = new Point();
        Point pointQcq = new Point(0,0);
        point00.affiche();
        pointQcq.affiche();
        point00.deplaceXY(27, 33);
        point00.affiche();
    }
    
}
