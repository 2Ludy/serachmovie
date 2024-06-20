import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieOperations movieOperations = new MovieOperations();

        while (true) {
            System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ==========");
            System.out.println("  1.영화입력(I)        2.영화출력(P)      3.영화검색(S)      4.종료(E)");
            System.out.println("=============================================");
            System.out.print("메뉴입력 : ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "I":
                    inputMovies(scanner, movieOperations);
                    break;
                case "P":
                    movieOperations.printMovies();
                    break;
                case "S":
                    searchMovies(scanner, movieOperations);
                    break;
                case "E":
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static void inputMovies(Scanner scanner, MovieOperations movieOperations) {
        while (true) {
            System.out.print("영화 제목 (종료 : -1) : ");
            String title = scanner.nextLine();
            if (title.equals("-1")) break;

            System.out.print("주연 : ");
            String major = scanner.nextLine();

            System.out.print("러닝타임 : ");
            int runningTime = Integer.parseInt(scanner.nextLine());

            System.out.print("평점 : ");
            double rating = Double.parseDouble(scanner.nextLine());

            System.out.print("장르 (1: 드라마, 2: 액션, 3: 호러) : ");
            int genre = Integer.parseInt(scanner.nextLine());

            movieOperations.addMovie(new MovieDTO(title, major, runningTime, rating, genre));
        }
    }

    private static void searchMovies(Scanner scanner, MovieOperations movieOperations) {
        while (true) {
            System.out.print("검색할 장르 (1 : 드라마, 2 : 액션, 3 : 호러): ");
            int genre = Integer.parseInt(scanner.nextLine());

            if (genre == 1 || genre == 2 || genre == 3) {
                movieOperations.searchMoviesByGenre(genre);
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}