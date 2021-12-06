package MyLaptop.specification;

public class Keyboard {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private String languageInKeyboard;
    private boolean lightYesOrNot;
    private String light;

    public Keyboard() {
    }

    public Keyboard(String languageInKeyboard, boolean lightYesOrNot, String light) {
        this.languageInKeyboard = languageInKeyboard;
        this.light = light;
        this.lightYesOrNot = lightYesOrNot;
    }

    public boolean isLightYesOrNot() {
        return lightYesOrNot;
    }

    public void setLightYesOrNot(boolean lightYesOrNot) {
        this.lightYesOrNot = lightYesOrNot;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getLanguageInKeyboard() {
        return languageInKeyboard;
    }

    public void setLanguageInKeyboard(String languageInKeyboard) {
        this.languageInKeyboard = languageInKeyboard;
    }

    @Override
    public String toString() {
        return "Keyboard         " +
                  ANSI_WHITE + " layout :" + languageInKeyboard + "Glows: " + true + "" +
                ", Color " + light + ANSI_RESET;
    }
}
