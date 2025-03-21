import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcularPintura {
    @Test
    void calcularPintura(){
        Esfera esfera=new Esfera("Josefa",3.12);
        Pintura pintura=new Pintura(29.5);
        assertEquals(esfera.area()/pintura.getCobertura(),pintura.cantidad(esfera));
    }
}
