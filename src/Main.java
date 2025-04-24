
public class Main {
    public static void main(String[] args) {
    }

    public static boolean esPalindromo(String palabra){
        if (palabra.isEmpty()){
            return false;
        }

        String lowercase = palabra.replaceAll("\\.s+","").toLowerCase();

        if (lowercase.isEmpty()){
            return false;
        }
    }
}

//aaaa