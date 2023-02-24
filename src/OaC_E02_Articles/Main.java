package OaC_E02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split(", ");

        Article article = new Article(inputLine[0], inputLine[1], inputLine[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            inputLine = scanner.nextLine().split(": ");
            String command = inputLine[0];

            switch (command){
                case "Edit":
                    article.edit(inputLine[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(inputLine[1]);
                    break;
                case "Rename":
                    article.rename(inputLine[1]);
                    break;
                default:
                    break;
            }
        }

        System.out.println(article.getTitle() + " - " + article.getContent() + ": " + article.getAuthor());
    }
}
