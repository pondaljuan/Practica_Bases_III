/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultados;

import funcion.AsignadorTablas;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

/**
 *
 * @author willpc
 */
public class PagPrincipal extends JFrame {

    AsignadorTablas ct = new AsignadorTablas();
    
    
    private Object[][] objetosTabla;

    public PagPrincipal() throws SQLException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        objetosTabla = ct.EstructuraTabla(1, 1);

        String[] columnNames = {
            "Apartado",
            "Base de datos",
            "Consulta", 
            "Estatus",
            "Duración",
            "Comparación Estatus",
            "Comparación Duración",
            "Tiempo real Primera vez",
            "Tiempo real Segunda vez"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(objetosTabla, columnNames);

        String[] espacio = {"", "", "", "", "", "", ""};

        ModeloTabla.addRow(espacio);
        objetosTabla = ct.EstructuraTabla(2, 2);

        for (int i = 0; i < 11; i++) {
            ModeloTabla.addRow(objetosTabla[i]);
        }

        ModeloTabla.addRow(espacio);
        objetosTabla = ct.EstructuraTabla(3, 3);

        for (int i = 0; i < 11; i++) {
            ModeloTabla.addRow(objetosTabla[i]);
        }

        ModeloTabla.addRow(espacio);
        objetosTabla = ct.EstructuraTabla(4, 4);

        for (int i = 0; i < 11; i++) {
            ModeloTabla.addRow(objetosTabla[i]);
        }

        ModeloTabla.addRow(espacio);
        objetosTabla = ct.EstructuraTabla(5, 5);

        for (int i = 0; i < 11; i++) {
            ModeloTabla.addRow(objetosTabla[i]);
        }
        ModeloTabla.addRow(espacio);
        objetosTabla = ct.EstructuraTabla(6, 6);

        for (int i = 0; i < 11; i++) {
            ModeloTabla.addRow(objetosTabla[i]);
        }

        final JTable tabla = new JTable(ModeloTabla);

        tabla.setPreferredScrollableViewportSize(new Dimension(screenSize.width, screenSize.height));
        JScrollPane scrollPane = new JScrollPane(tabla);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
