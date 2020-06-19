package br.com.livraria.nf.servico;

import br.com.livraria.modelo.dominio.NotaFiscal;

public class NotaFiscalServico {

	public static void emitir(NotaFiscal nf) {
		try {
			System.out.println("emitindo");
			Thread.sleep(5000);
			System.out.println(nf);
		} catch (Exception e) {
			System.out.println("Falha ao emitir a Nota Fiscal");
		}
	}
}
