public class Main {
    public static void main(String[] args) {
        System.out.println(esPalindromo("ana"));
    }

    public static boolean esPalindromo(String palabra){
        if (palabra.isEmpty()){
            return false;
        }

        String lowercase = palabra.replaceAll("\\s+", "").toLowerCase();


        if (lowercase.isEmpty()){
            return false;
        }

        char[] caracteres = lowercase.toCharArray();
        char[] invertido = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = caracteres[caracteres.length - 1 - i];
        }

        String resultado = new String(invertido);

        if (resultado.equals(lowercase)) {
            return true;
        } else {
            return false;
        }
    }
}

//aaaa