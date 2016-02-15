package servidor;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService
public class JogoAritmetico {

    List<Cliente> clientes = new ArrayList();

    public String getLife() {
        String resp = "+------- PLACAR ------+\n";
        for (Cliente cliente : clientes) {
            resp += "- " + cliente.getNome() + " : " + cliente.getVida() + "\n";
        }
        resp += "+---------------------+\n";
        return resp;
    }

    public void registrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}
