package Exercise_Files_B.Solutions.x06_ComplexObjects.StringBuilder.src;

public class Sbuilder {

    public static void main(String[] args) {
        String s1 = "Welcome";
        StringBuilder sb = new StringBuilder(s1);

        sb.append(" to California!");

        System.out.println(sb);
    }

}
