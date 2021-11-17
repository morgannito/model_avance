
@startuml

title DrawApp - Class Diagram


package Factory <<Factory>> {
interface ShapeFactory {
    + Shape makeShape(int x, int y) ;
    }
class CircleFactoryr{
    +int radius;
    + Shape makeShape(int x, int y):Circle;
    }
class RectangleFactory {
    +int width ;
    +int height ;
    + Shape makeShape(int x, int y):Rectangle;
    }
}


package Dessin <<Dessin>> {
interface Shape
{
    +void draw(Graphics g);
}


class Circle{
 +int x;
 +int y;
 +int radius;
 +void draw(Graphics g) ;


}
class Rectangle{
    +int x;
    +int y;
    +int width;
    +int height;
    +void draw(Graphics g) ;
}
@enduml