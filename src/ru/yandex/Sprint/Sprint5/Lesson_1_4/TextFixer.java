package ru.yandex.Sprint.Sprint5.Lesson_1_4;

public class TextFixer {

    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String fixText(String text) {
        text = text.trim();
        text = text.replace("цевилизаций", "цивилизаций").replace("„", "«")
                .replace("“", "»");
        String textSave = text.substring(1);
        String textUpper = text.substring(0, 1).toUpperCase();
        text = textUpper + textSave;
        // Реализуйте этот метод
        return text;
    }

    public static void main(String[] args) {

        String text = "    история каждой из крупных галактических цевилизаций может быть разделена на три различные, " +
                "ярко выраженные фазы: Борьба за выживание, Любопытство и Утонченность, также именуемые фазами " +
                "„Как?“, „Зачем?“ и „Где?“. Пример: если для первой фазы характерен вопрос: „Как бы нам поесть?“," +
                " а для второй „Зачем мы едим?“, то третья отличается вопросом: „Где бы нам лучше поужинать?“.   ";

        var textFixer = new TextFixer();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }
}
