package exercicio07.questao01;

public class LoggerFactory {
	
	public Logger getLogger(){
	
		if(Principal.tipo){
			return FileLogger.getFileLogger();
		}else{
			return ConsoleLogger.getConsoleLogger();
		}
	}
}
