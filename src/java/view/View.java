package view;

import model.AAnimal;

public interface View {

    enum MainMenuCommand {
        ADD_ANIMAL ("Добавить животное"),
        SHOW_SKILLS("Показать команды"),
        REMOVE_ANIMAL ("Вывести животное"),
        EXIT ("Выйти");

        private String tag;

        MainMenuCommand(String tag) {
            this.tag = tag;
        }

        public String getTag() {
            return tag;
        }
    }

    enum AddSkillMenuCommand {
        ADD_SKILL ("Добавь команду"),
        EXIT ("Выйти");

        private String tag;

        AddSkillMenuCommand(String tag) {
            this.tag = tag;
        }

        public String getTag() {
            return tag;
        }
    }

    void showRegistry();


    MainMenuCommand showMainMenuWithResult();

    boolean showAddAnimalDialog();

    int showRemoveAnimalDialog();

    void showDetailInfoAnimalDialog();

    void showAnimalInfo(AAnimal animal);

    AddSkillMenuCommand showAddSkillMenu(AAnimal animal);

    boolean showAddSkillDialog(AAnimal animal);
}
