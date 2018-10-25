package validate;

public class ValidarFichero {

    private String error;

    protected boolean validar(Validador validadores []){

        for (int i = 0; i < validadores.length ; i++) {

            if( ! validadores[i].validar()){

                error = validadores[i].getError();

                return false;
            }

        }

        return true;
    }

    public String getError() {
        return error;
    }
}
