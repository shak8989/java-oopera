import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }



    public void printActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
            return;
        }

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }
    public void printDirector() {
        System.out.println(director);
    }
    public void addActor(Actor actor) {

        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле.");
        } else {
            listOfActors.add(actor);
            System.out.println("Актёр добавлен.");
        }
    }
    public void replaceActor(Actor newActor, String surnameToReplace) {

        Actor actorToRemove = null;

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surnameToReplace)) {
                actorToRemove = actor;
                break;
            }
        }

        if (actorToRemove == null) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден.");
        } else {
            listOfActors.remove(actorToRemove);
            listOfActors.add(newActor);
            System.out.println("Актёр заменён.");
        }
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }
}



