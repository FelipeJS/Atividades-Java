package br.com.jogodaforca.main;

import br.com.jogodaforca.game.Jogo;
import br.com.jogodaforca.model.Palavra;

public class StartSemBanco {

	public static void main(String[] args) {
		int erros = 0;
		Palavra palavra = new Palavra();
		Jogo jogo = new Jogo();

		// i representa o codigo da palavra no banco, nesse exemplo meu banco
		// tem 3 palavras, codigo 1, 2 e 3
		for (int i = 1; i < 4; i++) {
			palavra.setCodigo(i);
			// PalavraDAO dao = new PalavraDAO();

			try {
				// Palavra palavraRetorno = dao.buscarPalavra(palavra);
				Palavra palavraRetorno = new Palavra();
				palavraRetorno.setPalavra("boi");
				palavraRetorno.setCategoria("Animal"); // Depois comenta esse
														// trecho e descomenta a
														// parte do DAO

				char[] palavraDinamica = new char[palavraRetorno.getPalavra()
						.length()];
				System.out.println(palavraRetorno.getCategoria());
				jogo.setLetra();

				for (int tentativa = 99; tentativa > 0; --tentativa) {
					boolean errou = true;
					for (int tam = 0; tam < palavraRetorno.getPalavra()
							.length(); tam++) {
						if (jogo.getLetra() == palavraRetorno.getPalavra()
								.charAt(tam)) {
							palavraDinamica[tam] = jogo.getLetra();
							errou = false;
						} else {
							if (palavraDinamica[tam] == '\0') {
								palavraDinamica[tam] = '-';

							}
						}
					}

					if (errou) {
						erros++;
						if (erros < 5)
							System.out.printf("Voc� ainda tem %d tentativas.",
									5 - erros);
						else {
							System.out.println("Game over motherfucker!");
							break;
						}
					}

					boolean isFinished = false;
					for (int tamDin = 0; tamDin < palavraRetorno.getPalavra()
							.length(); tamDin++) {
						if (palavraDinamica[tamDin] == '-') {
							isFinished = false;
							break;
						} else
							isFinished = true;
					}
					if (isFinished) {
						for (int tamDin = 0; tamDin < palavraRetorno
								.getPalavra().length(); tamDin++) {
							System.out.print(palavraDinamica[tamDin]);
						}
						System.out.print("\n Parabens voce venceu!!!\n");
						break;
					} else {
						for (int tamDin = 0; tamDin < palavraRetorno
								.getPalavra().length(); tamDin++) {
							System.out.print(palavraDinamica[tamDin]);
						}
					}

					jogo.setLetra();

				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao tentar iniciar o jogo");
			}
		}

	}

}
