package startegy_design;

public class Main {
    public static void main(String[] args) {
        String text = "This is a text to format";

        TextFormatter uppercaseFormatter = new UpperCaseFormatter();
        TextFormatter lowercaseFormatter = new LowerCaseFormatter();

        TextEditor editor = new TextEditor(uppercaseFormatter);
        String result = editor.formatText(text);
        System.out.println("Uppercase: " + result);

        editor = new TextEditor(lowercaseFormatter);
        result = editor.formatText(text);
        System.out.println("Lowercase: " + result);
        //test
    }
}
