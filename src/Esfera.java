public class Esfera extends Forma{
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double area(){
        return 4 * Math.PI * Math.pow(radio, 2);
    }
}
