/*
 * RhombusTest
 *
 * Oleksii Shevchenko KNUTE m1
 */

/*
 * Rhombus
 *
 * 07.08.20
 */

public class Rhombus {

    private int side;
    private double angle;
    private double arrea;


    //calc
    public Rhombus(double arrea){

        this.arrea = arrea;
    }

    public Rhombus(int side, double angle, double arrea) {
        this.side = side;
        this.angle = angle;
        this.arrea = arrea;
    }

    //get set
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public void setArrea(double arrea) {
        this.arrea = arrea;
    }

    //methods
    public double getArrea() {                                                               //1) Площа
        return 0.5 * this.getLongDiagonal() * this.getShortDiagonal();
    }

    public double getPerimeter() {                                                           //2) Периметр
        return 4 * this.getSide();
    }

    public double getLongDiagonal() {                                                        //3) Довга діагональ
        return this.getSide() * Math.sqrt(2 + 2 * Math.cos(this.getAngle()));
    }

    public double getShortDiagonal() {                                                       //4) Коротка діагональ
        return this.getSide() * Math.sqrt(2 - 2 * Math.cos(this.getAngle()));
    }


    public boolean isQuadrat() {                                                             //5) Чи квадрат
        boolean result;


        if (this.getAngle() == Math.PI / 2) {

            result = true;
        } else {
            result = false;
        }
        return result;


    }


}
