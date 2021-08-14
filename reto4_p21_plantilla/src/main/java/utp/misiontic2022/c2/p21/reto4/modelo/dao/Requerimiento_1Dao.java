package utp.misiontic2022.c2.p21.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p21.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        /* esto es en base al minireto solo es una guia 
        var connection = jdbcutilities.getconnection()
        var respon = new arraylist<requerimiento1,2,3>()
        PreparedStatement stmt = null
        ResultSet rest = null
        ty{
        String consulta = "*inserto la consulta dependiendo del requerimiento*"
        stmt = connection.preparatedStatement(consulta)
        rest = stmt.executequery()
        while(rest.next()){
            var requerimiento 1,2,3  = new requerimiento1,2,3()
            requerimiento 1,2,3.setdelavariablecorrespondientehastacompletarlo(rest.getString(nombre de la columna de la consulta))
        
            respon.add(requerimiento 1,2,3)
        }
        }finally{
            if(rest != null){
                reset.close()
        
            }
            if(stmt!= null){
                stmt.close()
            }
        }
        
        retorna respon
        */
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList respon = new ArrayList<Requerimiento_1>();
        PreparedStatement stmt = null;
        ResultSet rest = null;
        String consulta = "select Nombre_Material, Precio_Unidad from MaterialConstruccion "
                          + "where Importado = 'Si' order by Precio_Unidad desc";
        try{
            stmt = conexion.prepareStatement(consulta);
            rest = stmt.executeQuery();
            while(rest.next()){
                Requerimiento_1 reque1 = new Requerimiento_1();
                reque1.setNombre_Material(rest.getString("Nombre_Material"));
                reque1.setPrecio_Unidad(rest.getInt("Precio_Unidad"));
                respon.add(reque1);
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