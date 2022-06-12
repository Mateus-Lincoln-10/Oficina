/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author victor
 */
@Named(value = "managedBeanSession")
@SessionScoped
public class ManagedBean implements java.io.Serializable {

    /**
     * Creates a new instance of ManagedBean
     */
    //@Getter @Setter private String email;    ;
    //@Getter @Setter private String name;
    //@Getter @Setter private String password;
    @Getter @Setter private int valor1;
    @Getter @Setter private int valor2;
    @Getter private int resultado;
    
    public void somar() {
        resultado = valor1 + valor2;
    }

}
