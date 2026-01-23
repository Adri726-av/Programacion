package ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {
    static void main(String[] args) {
        String texto = "En caso de incidencias técnicas urgentes, el correo adecuado es soporte.tecnico@empresa.com, adjuntando capturas de pantalla si es posible. Para propuestas comerciales o alianzas estratégicas, las comunicaciones deben enviarse a negocios@empresa.com.  o, alternativamente, a alianzas@partner.org. Finalmente, si necesitas hablar directamente con recursos humanos, puedes escribir a rrhh@empresa.com, indicando en el asunto el motivo de tu mensaje.";
        String patron = "^\\w+@\\w+\\.\\w{2,3}";

        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(texto);
        int contador = 0;
        while (matcher.find()) {

        }
    }
}
