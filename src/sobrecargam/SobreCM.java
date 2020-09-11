package sobrecargam;

/**
 * @author MichaelTc
 */
public class SobreCM {
                String name;
                int edad,cedula;

        public SobreCM(String name, int edad) {
            this.name = name;
            this.edad = edad;
        }

        public SobreCM(int cedula) {
            this.cedula = cedula;
        }

        public void informacion(){
            System.out.println("Soy "+name+" y tengo "+edad+" años");
        }
        public void informacion(int km){
            System.out.println("He corrido "+km+" Kilometros el dia de hoy  mi DNI es:"+cedula);
        }
      
}
