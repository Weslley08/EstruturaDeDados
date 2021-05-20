package strings;

public class StringBuilder {

  public static void main(String[] args) {

    String nome = " Weslley";

    final java.lang.StringBuilder  builder = new java.lang.StringBuilder(nome);
    System.out.println(builder.append(" Cezario "));

    final java.lang.StringBuilder  reverse = builder.reverse();

    System.out.println(reverse);

    final java.lang.StringBuilder  insert = reverse.insert(0, " #").insert(reverse.length(), "#");
    System.out.println(insert);

  }

}
