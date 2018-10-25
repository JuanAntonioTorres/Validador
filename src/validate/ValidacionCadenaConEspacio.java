package validate;

public class ValidacionCadenaConEspacio extends  ValidacionExpresionRegular implements Validador{

    private static final String patron = "w.*";

    private static final String mensajeError = "La cadena contiene espacios";

    private String value;

    public ValidacionCadenaConEspacio(String value) {
        this.value = value;
    }

    @Override
    public boolean validar(){
        return super.validar(value,patron);
    }

    @Override
    public String getError() {
        return mensajeError;
    }

}

