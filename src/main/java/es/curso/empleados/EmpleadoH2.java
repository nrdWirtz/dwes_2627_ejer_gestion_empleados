package es.curso.empleados;

import es.curso.empleados.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoH2 {


    public List<Empleado> listarTodos() throws SQLException {
        // TODO Recuperar todos los empleados ordenados por id.

       throw pendiente("listarTodos");
    }


    public boolean insertar(Empleado empleado) throws SQLException {
        // TODO Insertar el empleado recibido y devolver si se añadió una fila.
        throw pendiente("insertar");
    }


    public boolean eliminar(int id) throws SQLException {
        // TODO Eliminar el empleado con ese id y devolver si se eliminó una fila.
        throw pendiente("eliminar");
    }


    public boolean modificar(double salario) throws SQLException {
        // TODO Actualizar salario a partir del id y devolver si se modificó una fila.
        throw pendiente("modificar");
    }


    public List<Empleado> buscarPorSalario(double salarioMinimo, double salarioMaximo)
            throws SQLException {
        // TODO Recuperar los empleados cuyo salario esté en el intervalo, incluidos los límites.
        throw pendiente("buscarPorSalario");
    }

    private UnsupportedOperationException pendiente(String metodo) {
        return new UnsupportedOperationException(
                "Método " + metodo + " pendiente de implementar"
        );
    }
}
