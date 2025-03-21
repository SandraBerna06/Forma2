import java.util.ArrayList;

public class MainPintura {
    static ArrayList<Forma>forma =new ArrayList<>();
    public static void main(String[] args) {
        Esfera esfera=new Esfera("Esfera", 2.34);
        Rectangulo rectangulo=new Rectangulo("Rectangulo", 1.13, 2.12);
        Cilindro cilindro=new Cilindro("Cilindro",2.45,4);
        Pintura pintura=new Pintura(250);
        
        System.out.println("Cantidad de pintura (esfera): "+pintura.cantidad(esfera));
        System.out.println("------------------------");
        System.out.println("Cantidad de pintura (rectángulo): "+pintura.cantidad(rectangulo));
        System.out.println("-------------------------");
        System.out.println("Cantidad de pintura (cilindro): " +pintura.cantidad(cilindro));

    }
}
