/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import CONTROLADOR.CONEXION;
import VISTA.PRINCIPAL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MT JASR
 */
public class INGRESO {

    CONEXION c = new CONEXION();

    public void ingreso() {
        try {
            Connection cn = c.con();
            int resultado = 0;
            int cc = 0;
            String pass = PRINCIPAL.txtusuario.getText();
            String usu = PRINCIPAL.txtcontraseña.getText();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from where usu_usu='" + usu + "' and pass_usu='" + pass + "'");
            while (rs.next()) {
                cc = Integer.parseInt(rs.getString(1));
            }
            cn = null;
            JOptionPane.showMessageDialog(null,"Wellcome");
            c.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error");
        }

    }
}
