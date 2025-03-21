import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    Esfera esfera=new Esfera("Josefa",3.12);
    Rectangulo rectangulo=new Rectangulo("Filiberto",5,5.7);
    Cilindro cilindro=new Cilindro("Perico",5.34,7.13);

    @Test
    void TesttoString(){

        assertEquals( "Esfera{" +
                "radio=" + esfera.getRadio() +
                ", nombre='" + esfera.getNombre() + '\'' +
                '}',esfera.toString());
        assertEquals("Rectangulo{" +
                "largo=" + rectangulo.getLargo() +
                ", alto=" + rectangulo.getAlto() +
                ", nombre='" + rectangulo.getNombre() + '\'' +
                '}',rectangulo.toString());
        assertEquals("El radio del cilindro" + cilindro.getRadio(),cilindro.toString());
    }

    @Test
    void devolverArea(){
        assertEquals(4 * Math.PI * Math.pow(esfera.getRadio(), 2),esfera.area());
        assertEquals(rectangulo.getLargo()*rectangulo.getAlto(),rectangulo.area());
        assertEquals((2*Math.PI*cilindro.getRadio())*(cilindro.getRadio()+cilindro.getAltura()),cilindro.area());
    }

}
