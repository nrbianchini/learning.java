package bianchini.nathalia.learningjava.introduction;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = 20;
        long bigNumber = 2L;
        float bigFloat = 2f;
        byte ageByte = 21; // min -128 max 127
        short ageShort = 22;
        boolean isIt = true;
        char character = '\u004e';
        String name = "Nathalia Raquel Bianchini";

        System.out.println("The age is " + age);
        System.out.println(isIt);
        System.out.println("char " +character);
        System.out.println("String " +name);
    }
}
