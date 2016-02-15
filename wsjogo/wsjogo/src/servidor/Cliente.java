package servidor;

import cliente.Attack;
import cliente.CounterAttack;
import cliente.Defense;
import cliente.Golpes;

public class Cliente {

    private String nome;
    private int vida;
    private int status = 2;
    Golpes a = new Attack();
    Golpes d = new Defense();
    Golpes c = new CounterAttack();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida += vida;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void putComando(String comando, Cliente cliente) {
        switch (comando) {
            case "A":
                a.golpear(cliente);
                break;
            case "D":
                d.golpear(cliente);
                break;
            default:
                c.golpear(cliente);
                break;
        }
    }

}
