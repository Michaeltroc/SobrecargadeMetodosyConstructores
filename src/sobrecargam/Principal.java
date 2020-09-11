package sobrecargam;

/**
 * @author MichaelTc
 */
public class Principal {

    public static void main(String[] args) {
          
       SobreCM persona = new SobreCM("Michae Trochez",19);
       persona.informacion();
 
       SobreCM persona1 =new SobreCM(10214);
       persona1.informacion(23);

    }
    
}
