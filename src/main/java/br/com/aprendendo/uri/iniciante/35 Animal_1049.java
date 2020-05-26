import java.io.IOException;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Animal {

    public static void main(String[] args) throws IOException {
        Map<String, Map<String, String>> vertebrados = new HashMap<>();
        vertebrados.put("ave", new HashMap<String, String>());
        vertebrados.get("ave").put("carnivoro", "aguia");
        vertebrados.get("ave").put("onivoro", "pomba");

        vertebrados.put("mamifero", new HashMap<String, String>());
        vertebrados.get("mamifero").put("onivoro", "homem");
        vertebrados.get("mamifero").put("herbivoro", "vaca");

        Map<String, Map<String, String>> invertebrados = new HashMap<>();
        invertebrados.put("inseto", new HashMap<String, String>());
        invertebrados.get("inseto").put("hematofago", "pulga");
        invertebrados.get("inseto").put("herbivoro", "lagarta");

        invertebrados.put("anelideo", new HashMap<String, String>());
        invertebrados.get("anelideo").put("hematofago", "sanguessuga");
        invertebrados.get("anelideo").put("onivoro", "minhoca");


        Scanner input = new Scanner(System.in);
        String vertebradoOuNao = input.nextLine();
        String grandeClasse = input.nextLine();
        String classeEspecifica = input.nextLine();

        if (vertebradoOuNao.equals("vertebrado")) {
            System.out.println(vertebrados.get(grandeClasse).get(classeEspecifica));
        } else {
            System.out.println(invertebrados.get(grandeClasse).get(classeEspecifica));
        }
    }
}
