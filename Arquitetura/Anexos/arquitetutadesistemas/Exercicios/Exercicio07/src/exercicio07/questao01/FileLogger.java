package exercicio07.questao01;



public class FileLogger implements Logger {

	private static FileLogger fileLogger;

	private FileLogger() {

	}

	public static FileLogger getFileLogger() {

		if (fileLogger == null) {
			fileLogger = new FileLogger();
		}

		return fileLogger;
	}

	@Override
	public void log(String msg) {
		FileUtil fileUtil = new FileUtil();
		
		fileUtil.writeToFile("log.txt", msg, true, true);
	}
}
