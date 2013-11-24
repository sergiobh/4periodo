package exercicio07.questao01;

public class ConsoleLogger implements Logger{
	
	private static ConsoleLogger consoleLogger;
	
	private ConsoleLogger(){
		
	}
	
	public static ConsoleLogger getConsoleLogger(){
		
		if(consoleLogger == null){
			consoleLogger = new ConsoleLogger();
		}
		
		return consoleLogger;
	}

	@Override
	public void log(String msg) {
	
		System.out.println(msg);
	}
}
