package Excepciones;

import Exceptions.PersonaException;

public class GestionaExcepcionesPropias {
    static void main(String[] args) {
        try {
            throw new PersonaException();
        } catch (PersonaException e) {
            System.out.println("Ha ocurrido excepcion de tipo PersonaException");
        }
    }
}
