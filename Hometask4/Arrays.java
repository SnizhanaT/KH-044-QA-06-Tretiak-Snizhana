import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Input minimum three words separated by a coma");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(", ");

        int filter;
        do {
            System.out.println("Choose a filter:\n 1-maximum length\n 2-start with\n 3-end with\n 4-contains\n 0-exit");
            filter = scanner.nextInt();

            switch (filter) {
                case 1:
                    System.out.println("Input maximum word length");
                    int wlength = scanner.nextInt();
                    for (int i=0; i< words.length; i++) {
                        String word = words[i];
                        if(word.length() <= wlength) {
                            System.out.println("The word matching your filter is: "+words[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Input first character");
                    String wstart = scanner.next();
                    for (int i=0; i< words.length; i++) {
                        String word = words[i];
                        if(word.startsWith(wstart)) {
                            System.out.println("The word matching your filter is: "+words[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Input last character");
                    String wend = scanner.next();
                    for (int i=0; i< words.length; i++) {
                        String word = words[i];
                        if(word.endsWith(wend)) {
                            System.out.println("The word matching your filter is: "+words[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Input part of a word");
                    String wcontains = scanner.next();
                    for (int i=0; i< words.length; i++) {
                        String word = words[i];
                        if(word.contains(wcontains)) {
                            System.out.println("The word matching your filter is: "+words[i]);
                        }
                    }
                    break;
            }
        } while (filter != 0);
        System.out.println("Exit");
    }
}
