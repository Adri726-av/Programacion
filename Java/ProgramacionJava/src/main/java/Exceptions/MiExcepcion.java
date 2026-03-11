package Exceptions;

public class MiExcepcion extends Exception{
    public MiExcepcion(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return "MiExcepcion{" +
                "message='" + getMessage() + '\'' +
                '}';
    }
}
