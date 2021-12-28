/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Empleado;
import com.service.EmpleadoServices;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JuanDavid
 */
@ManagedBean
@SessionScoped
public class EmpleadoController {

    private Empleado empleado = new Empleado();
    EmpleadoServices empser = new EmpleadoServices();
    private List<Empleado> empleados = new LinkedList();
    
    public EmpleadoController() {
        listar();
    }
    
    public void registrar(){
        empser.crear(empleado);
        empleado = new Empleado();
        listar();
    }
    
    public void listar(){
        empleados = empser.consultarTodo(Empleado.class);
    }

    /**
     * @return the empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
