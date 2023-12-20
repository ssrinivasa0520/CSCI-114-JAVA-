//Balloon.java
public class Balloon {
    private double radius;

    public Balloon() {
        radius = 0;
    }

    public void inflate(double amount){
        radius += amount;
    }

    public double getVolume(){
        return (4.0/3)*Math.PI*Math.pow(radius,3);
    }

    public static void main(String[] args) {
        Balloon balloon1 = new Balloon();
        balloon1.inflate(10);
        System.out.printf("Volume = %.2f\n",balloon1.getVolume());

        Balloon balloon2 = new Balloon();
        balloon2.inflate(15);
        System.out.printf("Volume = %.2f\n",balloon2.getVolume());
    }
}