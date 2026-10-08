import java.util.Scanner;

public class Main {
    private static final String BOLD = "\033[1m";
    private static final String RESET = "\033[0m";
    private static final String LINE =
            "================================================";

    private static void showTitle(String title) {
        System.out.println();
        System.out.println(LINE);
        System.out.println(BOLD + title + RESET);
        System.out.println(LINE);
    }