public class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double area(){
        return 0;
    }

    public String toString() {
        return "La forma es un/a" + nombre;
    }
}
