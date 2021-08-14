package utp.misiontic2022.c2.p21.reto4.vista;


import java.util.ArrayList;
import utp.misiontic2022.c2.p21.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_3;
import static utp.misiontic2022.c2.p21.reto4.vista.VistaRequerimientos.requerimiento2;
public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
            ArrayList <Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
            
            for (int i = 0; i < requerimiento1.size(); i++) {
                System.out.printf("%s %s %s %d %d %n", requerimiento1.get(i).getNombre_Material(), requerimiento1.get(i).getPrecio_Unidad());
            }
            /*
            var requerimiento1,2,3 = controlador.consultarrequerimiento1,2,3()
            for(Requerimiento1,2,3 registro : requerimiento1,2,3){
                system.out.printf("", registro.getdelacolumna a imprimir(),registro.getdelacolumna a imprimir(), ... asi hasta finalizar))
            
            }
            */
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList <Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            
            for (int i = 0; i < requerimiento2.size(); i++) {
                System.out.printf("%s %s %s %d %d %n", requerimiento2.get(i).getConstructora(), requerimiento2.get(i).getCiudad());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList <Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
            
            for (int i = 0; i < requerimiento3.size(); i++) {
                System.out.printf("%s %s %s %d %d %n", requerimiento3.get(i).getProveedor(), requerimiento3.get(i).getNombre_Material(),
                        requerimiento3.get(i).getImportado(), requerimiento3.get(i).getPrecio_Unidad(),
                        requerimiento3.get(i).getCantidad());
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
