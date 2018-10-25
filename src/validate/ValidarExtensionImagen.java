package validate;

import validate.Validador;
import validate.ValidarLista;

public class ValidarExtensionImagen extends ValidarLista implements Validador {

    private String value;
    private String [] valores = {"jpg" , "png"};
    private final String error = "extension no valida";

    public ValidarExtensionImagen(String extension) {
        this.value = extension;
    }

    @Override
    public boolean validar() {
        return super.validar(valores,value);
    }

    @Override
    public String getError() {
        return null;
    }
}
