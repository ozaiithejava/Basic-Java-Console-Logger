public class OLogger {
	private static final String PREFIX = "[OZAII - ";

	public static void log(String message) {
		System.out.println(PREFIX + "LOGS] " + message);
	}

	public static void error(String message) {
		System.err.println(PREFIX + "ERROR] " + message);
	}

	public static void info(String message) {
		System.out.println(PREFIX + "INFO] " + message);
		
	}
}
