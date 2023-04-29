public class TextFragmentRemover {

    public static void main(String[] args) {
        String text = "Це текст, який містить декілька слів. Деякі слова містять фрагменти, які маємо видалити.";
        String[] fragments = {"фрагменти", "маємо"};

        String result = removeFragments(text, fragments);

        System.out.println(result);
    }

    public static String removeFragments(String text, String[] fragments) {
        String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            boolean containsFragment = false;
            for (String fragment : fragments) {
                if (word.contains(fragment)) {
                    containsFragment = true;
                    break;
                }
            }
            if (!containsFragment) {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}