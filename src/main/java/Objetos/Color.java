package Objetos;

public class Color {
    // Foreground
    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    // Background
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    // Templates de strins
    public static final String TITULO_PRIMARIO = Color.ANSI_BLUE + Color.ANSI_GREEN_BACKGROUND + " %s "
            + Color.ANSI_RESET;
    public static final String TEXTO_PRIMARIO = Color.ANSI_BLUE + " %s " + Color.ANSI_RESET;
    public static final String TEXTO_ALERTA = Color.ANSI_RED_BACKGROUND + " %S " + Color.ANSI_RESET;
}
