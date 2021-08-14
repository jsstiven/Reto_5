package utp.misiontic2022.c2.p21.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p21.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList respon = new ArrayList<Requerimiento_2>();
        PreparedStatement stmt = null;
        ResultSet rest = null;
        String consulta = "select DISTINCT Constructora, Ciudad from Proyecto "
                          + "where Ciudad like 'B%' order by Ciudad";
        try{
            stmt = conexion.prepareStatement(consulta);
            rest = stmt.executeQuery();
            while(rest.next()){
                Requerimiento_2 reque2 = new Requerimiento_2();
                reque2.setConstructora("Constructora");
                reque2.setCiudad(rest.getNString("Ciudad"));
                respon.add(reque2);
            }
        }finally{
            if(rest != null){
                rest.close();
            }
            
            if(stmt != null){
                stmt.close();
            }
            
            if (conexion != null) {
                conexion.close();
            }
        }
        return respon;
    }
}