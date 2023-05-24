import java.util.ArrayList;
import java.util.Random;

public class EliminarMetade {
    public static void main(String[] args) throws InterruptedException {
        Random gerador = new Random();
        ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
        listaDeUsuario.add(new Usuario("Prijola"));
        listaDeUsuario.add(new Usuario("Jaum Edu"));
        listaDeUsuario.add(new Usuario("Fuabium"));
        listaDeUsuario.add(new Usuario("Manu"));
        listaDeUsuario.add(new Usuario("Keven"));
        listaDeUsuario.add(new Usuario("Little Predro"));
        listaDeUsuario.add(new Usuario("Valderraminha"));
        listaDeUsuario.add(new Usuario("Beck"));
        listaDeUsuario.add(new Usuario("Alehand"));
        listaDeUsuario.add(new Usuario("Felipin"));
        listaDeUsuario.add(new Usuario("Santana"));
        listaDeUsuario.add(new Usuario("Kethilin"));
        listaDeUsuario.add(new Usuario("Macieu"));
        listaDeUsuario.add(new Usuario("Byanka"));
        listaDeUsuario.add(new Usuario("Prates RANDAMDAM"));
        listaDeUsuario.add(new Usuario("LEOZIN CHEI DO HACK APELAO"));
        System.out.println("DONA ESTÁ ELIMINANDO.....\n");
        int tamanho = listaDeUsuario.size();
        int par = tamanho / 2;
        int impar = par + 1;
        if (tamanho % 2 == 0) {
            for (int i = 0; i < par; i++) {
                int aleatorio = gerador.nextInt(par);
                Thread.sleep(1000);
                System.out.println(listaDeUsuario.get(aleatorio).nome + " -> FOI DE AREA DO PISTÃO");
                listaDeUsuario.remove(aleatorio);
            }
            System.out.println("\nOS QUE SOBRARAM FORAM: \n");
                for (int cont = 0; cont < par; cont++) {
                    Thread.sleep(1000);
                    System.out.println(listaDeUsuario.get(cont).nome);
                }
        } else {
            for (int j = 0; j < impar; j++) {
                int sAleatorio = gerador.nextInt(impar);
                listaDeUsuario.remove(sAleatorio);
            }
                for (int cont = 0; cont <= listaDeUsuario.size(); cont++) {
                    System.out.println(listaDeUsuario.get(cont).nome);


            }
        }
        System.out.println("\n| ESTES FORAM OS NOMES QUE SOBREVIVERAM DO UNIVERSO DA DS7! |");
    }
}