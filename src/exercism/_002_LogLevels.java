package exercism;

// From: https://exercism.org/tracks/java/exercises/log-levels
public class _002_LogLevels {
    public static void main(String[] args) {
        String msg = "[ERROR]: Illegal argument";

        System.out.println(LogLevels.message(msg));
        System.out.println(LogLevels.logLevel(msg));
        System.out.println(LogLevels.reformat(msg));

    }
    static class LogLevels {
        public static String message(String logLine) {
            return logLine.substring(logLine.indexOf(":") + 1).strip();
        }
        public static String logLevel(String logLine) {
            return extractLog(logLine);
        }
        public static String reformat(String logLine) {
            return String.format("%s (%s)", message(logLine), extractLog(logLine));
        }
        private static String extractLog(String logLine){
            return logLine.substring(logLine.indexOf("[") + 1, logLine.lastIndexOf("]")).toLowerCase();
        }
    }
}
