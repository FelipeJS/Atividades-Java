package servidor;

import javax.xml.ws.Endpoint;

public class ServidorJogo {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/WebServices/jogo", new JogoAritmetico());
    }
}
