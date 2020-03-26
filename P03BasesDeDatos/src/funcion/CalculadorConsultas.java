/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author willpc
 */
public class CalculadorConsultas {

    //Tiempo
    private String[] Status;
    private String[] Duration;

    //Tiempo real
    private long inicio;
    private long fin1;
    private long fin2;

    private long tiempo1;
    private long tiempo2;

    //Tiempo Comparación
    private String[] StatusComparacion;
    private String[] DurationComparacion;

    //Sentencia
    private String sentencia;

    //conexión
    private String driver;
    private String url;
    private Statement statement;
    private Connection conexion;
    private ResultSet resultados;

    public CalculadorConsultas() {

        Duration = new String[20];
        Status = new String[20];

        DurationComparacion = new String[20];
        StatusComparacion = new String[20];

    }

    private void start(int indice, int base) {
        switch (indice) {
            case 1:
                sentencia = "SELECT count(*) FROM country";
                break;
            case 2:
                sentencia = "select max(length) from film";
                break;
            case 3:
                sentencia = "SELECT * FROM city";
                break;
            case 4:
                sentencia = "SELECT first_name FROM actor";
                break;
            case 5:
                sentencia = "SELECT city.name, country.name FROM city inner join country on city.countrycode = country.code  where country.name = 'Spain'";
                break;
            case 6:
                sentencia = "SELECT a.first_name, a.last_name, ai.film_info FROM actor a join actor_info ai on a.actor_id = ai.actor_id where ai.first_name = 'NICK'";
                break;

        }
        if (base == 1) {
            url = "jdbc:mysql://localhost:3306/world";
        } else {
            url = "jdbc:mysql://localhost:3306/sakila";
        }

        driver = "com.mysql.jdbc.Driver";
        statement = null;
        conexion = null;
        resultados = null;
    }
    //predefinidas

    private void world_country_Count() throws SQLException {

        start(1, 1);

        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("count(*)"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("count(*)"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
  private void sakila_maxlength_film() throws SQLException {

        start(2, 2);
        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("max(length)"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("max(length)"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    //Simples
    private void world_city_Select() throws SQLException {

        start(3, 1);
        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("Name"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("Name"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    private void sakila_First_name_Actor() throws SQLException {

        start(4, 2);
        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("first_name"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("first_name"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    //Complejas
    private void world_city_country() throws SQLException {

        start(5, 1);

        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("name"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("name"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void sakila_actor_actorinfo_Join() throws SQLException {

        start(6, 2);

        inicio = System.currentTimeMillis();
        try {
            Class.forName(driver);

            conexion = DriverManager.getConnection(url, "root", "15612100");
            statement = conexion.createStatement();

            resultados = statement.executeQuery("SET profiling = 1");

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("first_name"));
            }
            resultados = statement.executeQuery("show profile for query 1");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    Status[i] = resultados.getString("Status");
                    Duration[i] = resultados.getString("Duration");

                    i++;
                }

            }
            fin1 = System.currentTimeMillis();

            tiempo1 = fin1 - inicio;

            resultados = statement.executeQuery(sentencia);
            while (resultados.next()) {
                System.out.println(resultados.getString("a.first_name"));
            }
            resultados = statement.executeQuery("show profile for query 2");

            while (resultados.next()) {
                int i = 0;
                while (resultados.next()) {
                    StatusComparacion[i] = resultados.getString("Status");
                    DurationComparacion[i] = resultados.getString("Duration");

                    i++;
                }
            }
            fin2 = System.currentTimeMillis();

            tiempo2 = fin2 - fin1;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultados != null) {
                    resultados.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }


    public void world_P_Count() throws SQLException {
        world_country_Count();
    }

    public void sakila_P_Max() throws SQLException {
        sakila_maxlength_film();
    }

  
    public void world_S_City_Select() throws SQLException {
        world_city_Select();
    }

    public void sakila_S_Actor_Select() throws SQLException {
        sakila_First_name_Actor();
    }

    
    public void world_C_City_Country_Join() throws SQLException {
        world_city_country();
    }

    public void sakila_C_actor_actorInf_Join() throws SQLException {
        sakila_actor_actorinfo_Join();
    }

    
    public String getSentencia() {
        return sentencia;
    }

  
    public String[] getStatus() {
        return Status;
    }

    public String[] getDuration() {
        return Duration;
    }

    public String[] getStatusComparacion() {
        return StatusComparacion;
    }

    public String[] getDurationComparacion() {
        return DurationComparacion;
    }

    public long getTiempo1() {
        return tiempo1;
    }

    public long getTiempo2() {
        return tiempo2;
    }

}
