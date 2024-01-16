package org.centrale.app;

import java.util.Objects;

public class ClassTest {
    /*
    Position X and Y
    */
    private int x,y ;

    ClassTest(){
        x = 0;
        y = 0;
    }

    ClassTest (int x, int y) {
        this.x = x;
        this.y = y;
    }

    ClassTest (ClassTest pt) {
        this.x = pt.getX();
        this.y = pt.getY();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void affichage() {
        System.out.println("Les coordonnées sont : [" + this.x + "; " + this.y + "]" );
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    /** méthode permettant de calculer la distance entre deux points*/
    public double distance(ClassTest p){
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        double dist = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2) );

        return dist;
    }

    @Override
    public String toString() {
        return  "x=" + x + ", y=" + y ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }


        ClassTest p = (ClassTest) obj;

        return x == p.x && Objects.equals(y, p.y);
    }
}
