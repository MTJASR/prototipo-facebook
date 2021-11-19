package MODELO;

//import ALERTAS.Mensajes_Flotates;
import CONTROLADOR.CONEXION;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CRUD_USUARIO {

    CONEXION c = new CONEXION();

    public void CREATE(String nombre, String apellido, String correo, String usuario, String contaseña) {
        try {
            Connection cn = c.con();
            PreparedStatement ps = cn.prepareStatement("insert into tbusuario(nom_usu,ape_usu,ema_usu,usu_usu,pass_usu) values(?,?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, correo);
            ps.setString(4, usuario);
            ps.setString(5, contaseña);
            ps.execute();
            cn = null;
            c.desconectar();
            JOptionPane.showMessageDialog(null, "EL USUARIO " + nombre + "  " + " A SIDO AGREGADO CORRECTAMENTE");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void READ() {
//        Mensajes_Flotates m = new Mensajes_Flotates();
        String sql = "";
        sql = ("select * from TBCIUDAD");
        try {
            Connection cn = c.con();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                rs.getString(1);
                rs.getString(2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
//            m.Error("ERROR", e.getMessage());
        }
    }

    public void UPDATE(String codigo, String nombre, String departamento) {
//        Mensajes_Flotates m = new Mensajes_Flotates();
        try {
            Connection cn = c.con();
            PreparedStatement ps = cn.prepareStatement("update TBCIUDAD set nom_ciu'" + nombre + "',cod_dep_fk'" + departamento + "' where cod_ciu='" + codigo + "'");
            ps.executeUpdate();
            cn = null;
            c.desconectar();
            JOptionPane.showMessageDialog(null, "LA CIUDAD " + nombre + "  " + " A SIDO ACTUALIZADA CORRECTAMENTE");
            //m.Informacion("INFORMACIÓN", "CIUDAD ACTUALIZADA");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //m.Error("ERROR", e.getMessage());
        }
    }

    public void DELETE(String codigo) {
//        Mensajes_Flotates m = new Mensajes_Flotates();
        try {
            Connection cn = c.con();
            PreparedStatement ps = cn.prepareStatement("delete from TBCIUDAD where cod_ciu='" + codigo + "'");
            if (JOptionPane.showConfirmDialog(null, "¿Desea Realmente eliminar este registro?", null, JOptionPane.YES_NO_OPTION) == 0) {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "LA CIUDAD " + codigo + "  " + " A SIDO ELIMINADO CORRECTAMENTE");
//                m.Informacion("INFORMACION", "CIUDAD ELIMINADA");
            }
            cn = null;
            c.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            // m.Error("ERROR", e.getMessage());
        }
    }

}
