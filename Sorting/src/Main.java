
public class Main {
    public static void main(String[] args) {

        long time = System.nanoTime();
        SortingMethods sortingMethods = new SortingMethods();

        sortingMethods.bubble();
        long bubble = System.nanoTime();
        long finishBubble = bubble - time;
        double secondsBubble = (double) finishBubble / 1_000_000_000.0;
        double minutesBubble = secondsBubble / 60.0;
        System.out.printf("Пузырьковая: %.9f секунд (%.9f минут)\n", secondsBubble, minutesBubble);

        time = System.nanoTime();

        sortingMethods.combSort();
        long comb = System.nanoTime();
        long finishComb = comb - time;
        double secondsComb = (double) finishComb / 1_000_000_000.0;
        double minutesComb = secondsComb / 60.0;
        System.out.printf("Расчёска: %.9f секунд (%.9f минут)\n", secondsComb, minutesComb);

        time = System.nanoTime();

        sortingMethods.cocktailSort();
        long cocktail = System.nanoTime();
        long finishCocktail = cocktail - time;
        double secondsCocktail = (double) finishCocktail / 1_000_000_000.0;
        double minutesCocktail = secondsCocktail / 60.0;
        System.out.printf("Шейкерная: %.9f секунд (%.9f минут)\n", secondsCocktail, minutesCocktail);

        time = System.nanoTime();

        sortingMethods.insertionSort();
        long insertion = System.nanoTime();
        long finishInsertion = insertion - time;
        double secondsInsertion = (double) finishInsertion / 1_000_000_000.0;
        double minutesInsertion = secondsInsertion / 60.0;
        System.out.printf("Вставками: %.9f секунд (%.9f минут)\n", secondsInsertion, minutesInsertion);
    }
}