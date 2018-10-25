package validate;

import java.util.ArrayList;

public class ValidarSexo extends ValidarLista  implements Validador{

    private static final String [] valores  = {"Hombre" , "Mujer"};

    private static final String error = "El  valor no esta en la lista";

    private String value;

    public ValidarSexo(String value) {
        this.value = value;
    }

    @Override
    public boolean validar(){
        return super.validar(valores,value);
    }

    @Override
    public String getError(){
        return this.error;
    }
}
