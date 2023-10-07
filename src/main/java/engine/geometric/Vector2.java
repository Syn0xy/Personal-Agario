package engine.geometric;

import engine.util.Mathf;

public class Vector2 {
    private double x;
    private double y;

    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2(){
        this(0, 0);
    }

    public double getX(){ return x; }
    public double getY(){ return y; }

    public void plus(Vector2 v){ plus(v.getX(), v.getY()); }
    public void plus(double a){ plus(a, a); }
    public void plus(double x, double y){ plusX(x); plusY(y); }
    public void plusX(double x){ this.x += x; }
    public void plusY(double y){ this.y += y; }

    public void minus(Vector2 v){ minus(v.getX(), v.getY()); }
    public void minus(double a){ minus(a, a); }
    public void minus(double x, double y){ minusX(x); minusY(y); }
    public void minusX(double x){ this.x -= x; }
    public void minusY(double y){ this.y -= y; }

    public void multiply(Vector2 v){ multiply(v.getX(), v.getY()); }
    public void multiply(double a){ multiply(a, a); }
    public void multiply(double x, double y){ multiplyX(x); multiplyY(y); }
    public void multiplyX(double x){ this.x *= x; }
    public void multiplyY(double y){ this.y *= y; }

    public Vector2 copy(){ return new Vector2(x, y); }

    public double distance(Vector2 v){
        return Mathf.hypotenuse(Mathf.distance(x, v.getX()), Mathf.distance(y, v.getY()));
    }

    public static Vector2 random(double max){
        return new Vector2(Mathf.random(max), Mathf.random(max));
    }

    public static Vector2 random(double min, double max){
        return new Vector2(Mathf.random(min, max), Mathf.random(min, max));
    }

    public static Vector2 randomRange(double x, double y){
        return new Vector2(Mathf.random(x), Mathf.random(y));
    }

    public String toString(){
        return getClass().getSimpleName() + "[x:" + x + ", y:" + y + "]";
    }
}