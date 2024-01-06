
import controller.Controller;
import storage.AStorage;
import view.ConsoleView;
import view.View;

public class Appl {

    public static void run() {
        Controller controller = new Controller(new AStorage());
        View view = new ConsoleView(controller);

        while (true) {
            view.showRegistry();
            View.MainMenuCommand code = view.showMainMenuWithResult();
            switch (code) {
                case ADD_ANIMAL -> {
                    boolean result = view.showAddAnimalDialog();
                    String resMessage = result ? "Животное добавлено" : "Error";
                    System.out.println(resMessage);
                }
                case SHOW_SKILLS -> {
                    view.showDetailInfoAnimalDialog();
                }
                case REMOVE_ANIMAL -> {
                    int removeId = view.showRemoveAnimalDialog();
                    String resMessage = removeId > -1  ? "Выведено животное" + removeId : "Error";
                    System.out.println(resMessage);
                }
                case EXIT -> {
                    System.out.println("... )");
                    return;
                }
            }
        }
    }
}
