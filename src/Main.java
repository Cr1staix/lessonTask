import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите категорию (завтрак, обед, ужин): ");
        String category = scanner.nextLine().toLowerCase();
        System.out.print("Вы голодны? (да/нет): ");
        String hunger = scanner.nextLine().toLowerCase();
        String eat;
        String drink;
        if (hunger.equals("да")) {
            eat = switch (category) {
                case "завтрак" -> "Могу вам предложить йогурт с фруктами";
                case "обед" -> "Могу вам предложить стейк с картофелем";
                case "ужин" -> "Могу вам предложить пасту с соусом";
                default -> "Неважно сколько времени, я могу принести вам любое блюдо";
            };
        } else if (hunger.equals("нет")) {
            eat = switch (category) {
                case "завтрак" -> "Могу вам предложить омлет с тостами";
                case "обед" -> "Могу вам предложить салат с курицей";
                case "ужин" -> "Могу вам предложить суп-пюре";
                default -> "Неважно сколько времени, я могу принести вам любое блюдо.";
            };
        } else {
            eat = "Извините, я не понял голодны ли вы?";
        }
        drink = switch (category) {
            case "завтрак" -> " и кофе";
            case "обед", "ужин" -> " и сок";
            default -> " Неважно сколько времени, я могу принести вам любой напиток";
        };
        System.out.print(eat + drink);
    }
}