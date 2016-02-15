package cliente;

import servidor.Cliente;
import servidor.JogoAritmetico;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteJogo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        JogoAritmeticoService jas = new JogoAritmeticoService();
        JogoAritmetico port = jas.getPort(JogoAritmetico.class);
        System.out.println("Informe seu nome: ");
        Cliente cliente = new Cliente();
        Golpes a = new Attack();
        Golpes d = new Defense();
        Golpes c = new CounterAttack();

        try {
            cliente.setNome(reader.readLine());
            cliente.setVida(100);
            port.registrar(cliente);
        } catch (IOException ex) {
            Logger.getLogger(ClienteJogo.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (cliente.getVida() > 100) {
            System.out.println(port.getLife());
            System.out.println("COMANDO:");
            String comando = reader.readLine();
            cliente.putComando(comando, cliente);
        }

        if (port.getClientes().get(0).getVida() > 0) {
            System.out.println("Vencedor:" + port.getClientes().get(0).getNome());
        } else {
            System.out.println("Vencedor:" + port.getClientes().get(1).getNome());
        }
    }
}
