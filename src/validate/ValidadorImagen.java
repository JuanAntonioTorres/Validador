package validate;

public class ValidadorImagen extends ValidarFichero {

    private String value;

    public ValidadorImagen(String value) {
        this.value = value;
    }

    public boolean validar(){

        String nombreImagen = new String(value.substring(0 , value.lastIndexOf('.')));

        String extension = new String(value.substring(value.lastIndexOf('.')));

        Validador [] validadores = {new ValidarExtensionImagen(extension) ,new ValidacionCadenaConEspacio(nombreImagen)};

        return super.validar(validadores);

    }

}
