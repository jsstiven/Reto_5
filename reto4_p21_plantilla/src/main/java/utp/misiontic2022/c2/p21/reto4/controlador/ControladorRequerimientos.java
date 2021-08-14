package utp.misiontic2022.c2.p21.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p21.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p21.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p21.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    // Su código
    /*
        private requerimiento_1,2,3dao requerimiento_dao
        publiccontroladorequerimientos(){
        this.requerimiento_dao = new requerimiento_1,2,3dao()
        }
    */
    private Requerimiento_1Dao requerimiento_dao_1;
    private Requerimiento_2Dao requerimiento_dao_2;
    private Requerimiento_3Dao requerimiento_dao_3;
    
    public ControladorRequerimientos(){
        this.requerimiento_dao_1 = new Requerimiento_1Dao();
        this.requerimiento_dao_2 = new Requerimiento_2Dao();
        this.requerimiento_dao_3 = new Requerimiento_3Dao();
    }
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return requerimiento_dao_1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return requerimiento_dao_2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return requerimiento_dao_3.requerimiento3();
    }
}
