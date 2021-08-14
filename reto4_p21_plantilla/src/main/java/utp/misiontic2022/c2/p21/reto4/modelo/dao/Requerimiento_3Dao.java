package utp.misiontic2022.c2.p21.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_2;

import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p21.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        Connection conexion = JDBCUtilities.getConnection();
        ArrayList respon = new ArrayList<Requerimiento_2>();
        PreparedStatement stmt = null;
        ResultSet rest = null;
        String consulta = "select Proveedor, b.Nombre_Material, b.Importado, b.Precio_Unidad, SUM(Cantidad) as Cantidad from Compra a "
                + "join MaterialConstruccion b on a.ID_MaterialConstruccion = b.ID_MaterialConstruccion "
                + "where a.Proveedor = 'Homecenter' AND b.Importado = 'Si' "
                + "group by b.Nombre_Material HAVING SUM(Cantidad) > 100 order by b.Nombre_Material asc; ";
        try{
            stmt = conexion.prepareStatement(consulta);
            rest = stmt.executeQuery();
            while(rest.next()){
                Requerimiento_3 reque3 = new Requerimiento_3();
                reque3.setProveedor(rest.getString("Proveedor"));
                reque3.setNombre_Material(rest.getString("Nombre_Material"));
                reque3.setImportado(rest.getString("Importado"));
                reque3.setPrecio_Unidad(rest.getInt("Precio_Unidad"));
                reque3.setCantidad(rest.getInt("Cantidad"));
                respon.add(reque3);
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