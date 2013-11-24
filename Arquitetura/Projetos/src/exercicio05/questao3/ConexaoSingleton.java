package exercicio05.questao3;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class ConexaoSingleton {

	private static Connection conexao = null;
	private static ConexaoSingleton self = null;

	protected Connection getConector() throws ClassNotFoundException, SQLException {
		if (conexao == null) {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/arquitetura", "root","123456");
		}
		return conexao;
	}

	public static synchronized ConexaoSingleton getInstacia() {
		if (self == null){
			self = new ConexaoSingleton();
		}
		
		return self;
	}

	@Override
	protected void finalize() throws Throwable {
		if (self != null) {
			desconectar();
		}
	}

	public void desconectar() {
		try {
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}