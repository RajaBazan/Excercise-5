package hello.com;
class square{

    int side;

    //setter

    public void setSide(int side) {

        this.side = side;

    }

}

class calcSquare extends square{

    public int area(){

        return 4*side;

    }

}

//Rectangle

class rectangle{

    int length;

    int breath;

    public void setLength(int length) {

        this.length = length;

    }

    public void setBreath(int breath) {

        this.breath = breath;

    }

}

class calcRectangle extends rectangle{

    public int area(){

        return length*breath;

    }

}

//circle

class circle12{

    float radius;

    public void setRadius(float radius) {

        this.radius = radius;

    }

}

class calcCircle extends circle12{

    public float area(){

        return (float)Math.PI*radius*radius;

    }

    public float circumference(){

        return 2*(float)Math.PI*radius;

    }

}

//cylinder

class cylinder12{

    float radius;

    float height;

    public void setRadius(float radius) {

        this.radius = radius;

    }

    public void setHeight(float height) {

        this.height = height;

    }

}

class calcCylinder extends cylinder12{

    public float surface_area(){

        return 2*(float)Math.PI*radius*height;

    }

    public float volume(){

        return (float)Math.PI*radius*radius*height;

    }

}

//sphere

class sphere{

    float radius;

    public void setRadius(float radius) {

        this.radius = radius;

    }

}

class calcSphere extends sphere{

    public float circumference(){

        return 2*(float)Math.PI*radius;

    }

    public float surface_area(){

        return 4*(float)Math.PI*radius*radius;

    }

    public float volume(){

        return (4/3)*(float)Math.PI*radius*radius;

    }

}

public class Lec_68_Excercise_5 {

    public static void main(String[] args) {

        //Square

        calcSquare sq = new calcSquare();

        sq.setSide(3);

        System.out.println("side of square: "+sq.side);

        System.out.println("area of square: "+sq.area());



        //Rectangle

        calcRectangle r = new calcRectangle();

        r.setLength(5);

        r.setBreath(8);

        System.out.println("length of rectangle: "+r.length);

        System.out.println("breath of rectangle: "+r.breath);

        System.out.println("area of rectangle: "+r.area());



        //circle

        calcCircle c = new calcCircle();

        c.setRadius(2.5f);

        System.out.println("Radius of circle: "+c.radius);

        System.out.println("Circumference of circle: "+c.circumference());

        System.out.println("Area of circle: "+c.area());



        //Cylinder

        calcCylinder cc = new calcCylinder();

        cc.setRadius(4);

        cc.setHeight(9);

        System.out.println("Radius of cylinder: "+cc.radius);

        System.out.println("Height of cylinder: "+cc.height);

        System.out.println("Surface Area of cylinder: "+cc.surface_area());

        System.out.println("Volume of cylinder: "+cc.volume());



        //Sphere

        calcSphere sp = new calcSphere();

        sp.setRadius(3.5f);

        System.out.println("Radius of sphere is: "+sp.radius);

        System.out.println("Circumference of sphere is: "+sp.circumference());

        System.out.println("Surface area of sphere is: "+sp.surface_area());

    }

}
