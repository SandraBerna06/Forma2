public class Cilindro extends Forma{
    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    public double area(){
        return ((2*Math.PI*radio)*(radio+altura));
    }
    public String toString() {

        return "El radio del cilindro" + radio;
    }
}
