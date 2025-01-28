public class Rectangulo extends Forma{
    private double largo;
    private double alto;

    public Rectangulo(String nombre, double largo, double alto) {
        super(nombre);
        this.largo = largo;
        this.alto = alto;
    }

    public double area(){
        return largo*alto;
    }
}
