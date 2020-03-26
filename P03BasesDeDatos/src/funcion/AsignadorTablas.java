/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion;

import java.sql.SQLException;

/**
 *
 * @author willpc
 */
public class AsignadorTablas {

    private String sentencia;

    private String[] duration;
    private String[] durationComparacion;

    private String[] status;
    private String[] statusComparacion;
    private Object[][] getObjetosTabla;

    private String[] tipo = {"Funciones predefinidas", "Funciones simples", "Funciones complejas"};
    private String[] baseDeDatos={"world","sakila"};
    CalculadorConsultas cDDBB = new CalculadorConsultas();

    public AsignadorTablas() {
        this.duration = cDDBB.getDuration();
        this.status = cDDBB.getStatus();

        this.durationComparacion = cDDBB.getDurationComparacion();
        this.statusComparacion = cDDBB.getStatusComparacion();

    }

    public Object[][] EstructuraTabla(int tip, int sentencia) throws SQLException {

        switch (sentencia) {
            case 1:
                cDDBB.world_P_Count();
                break;
            case 2:
                cDDBB.sakila_P_Max();
                break;
            case 3:
                cDDBB.world_S_City_Select();
                break;
            case 4:
                cDDBB.sakila_S_Actor_Select();
                break;

            case 5:
                cDDBB.world_C_City_Country_Join();
                break;
            case 6:
                cDDBB.sakila_C_actor_actorInf_Join();
                break;
        }

        if (tip == 1) {

            Object[][] objetosTabla = {
                {tipo[0], baseDeDatos[0], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        }
        if (tip == 2) {
            Object[][] objetosTabla = {
                {tipo[0], baseDeDatos[1], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        }

        if (tip == 3) {

            Object[][] objetosTabla = {
                {tipo[1], baseDeDatos[0], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        }
             if (tip == 4) {

            Object[][] objetosTabla = {
                {tipo[1], baseDeDatos[1], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        } 
              if (tip == 5) {

            Object[][] objetosTabla = {
                {tipo[2], baseDeDatos[0], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        }
               if (tip == 6) {

            Object[][] objetosTabla = {
                {tipo[2], baseDeDatos[1], cDDBB.getSentencia(), status[0], duration[0], statusComparacion[0], durationComparacion[0], cDDBB.getTiempo1(), cDDBB.getTiempo2()},
                {"", "", "", status[1], duration[1], statusComparacion[1], durationComparacion[1]},
                {"", "", "", status[2], duration[2], statusComparacion[2], durationComparacion[2]},
                {"", "", "", status[3], duration[3], statusComparacion[3], durationComparacion[3]},
                {"", "", "", status[4], duration[4], statusComparacion[4], durationComparacion[4]},
                {"", "", "", status[5], duration[5], statusComparacion[5], durationComparacion[5]},
                {"", "", "", status[6], duration[6], statusComparacion[6], durationComparacion[6]},
                {"", "", "", status[7], duration[7], statusComparacion[7], durationComparacion[7]},
                {"", "", "", status[8], duration[8], statusComparacion[8], durationComparacion[8]},
                {"", "", "", status[9], duration[9], statusComparacion[9], durationComparacion[9]},
                {"", "", "", status[10], duration[10], statusComparacion[10], durationComparacion[10]}
            };
            return objetosTabla;
        }
             else {
            return null;
        }

    }

}
