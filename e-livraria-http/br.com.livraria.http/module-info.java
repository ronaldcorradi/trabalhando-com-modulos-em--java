module br.com.livraria.http {
	requires transitive br.com.livraria.modelo;
	requires java.net.http;
	
	exports br.com.livraria.http.dao;
}