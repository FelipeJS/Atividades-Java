package cliente;

import servidor.Cliente;
import servidor.JogoAritmetico;

public class Attack implements Golpes {

    JogoAritmetico jogo = new JogoAritmetico();

    @Override
    public int golpear(Cliente cliente) {
        cliente.setStatus(1);
        if (jogo.getClientes().get(0).getNome().equals(cliente.getNome())) {
            switch (jogo.getClientes().get(1).getStatus()) {
                case 2:
                    jogo.getClientes().get(1).setVida(-2);
                    break;
                case 3:
                    cliente.setVida(-2);
                    break;
                default:
                    cliente.setVida(-2);
                    jogo.getClientes().get(1).setVida(-2);
            }
        } else {
            switch (jogo.getClientes().get(0).getStatus()) {
                case 2:
                    jogo.getClientes().get(0).setVida(-2);
                    break;
                case 3:
                    cliente.setVida(-2);
                    break;
                default:
                    cliente.setVida(-2);
                    jogo.getClientes().get(1).setVida(-2);
            }
        }
        return 0;
    }
}
