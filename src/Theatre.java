import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {


        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Сидорова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Олег", "Иванов", Gender.MALE, 175);

        Director director1 = new Director("Сергей", "Волков", Gender.MALE, 10);
        Director director2 = new Director("Мария", "Смирнова", Gender.FEMALE, 7);


        String musicAuthor = "Чайковский";
        String choreographer = "Алексей Морозов";
        Show show=new Show(
                "Гамлет",
                120,
                director1,
                new ArrayList<>()
        );


        Opera opera = new Opera(
                "Евгений Онегин",
                150,
                director2,
                new ArrayList<>(),
                musicAuthor,
                "Текст либретто оперы...",
                40
        );


        Ballet ballet = new Ballet(
                "Лебединое озеро",
                130,
                director1,
                new ArrayList<>(),
                musicAuthor,
                "Текст либретто балета...",
                choreographer
        );

        show.addActor(actor1);
        show.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);


        System.out.println("Актёры в драме:");
        show.printActors();

        System.out.println("Актёры в опере:");
        opera.printActors();

        System.out.println("Актёры в балете:");
        ballet.printActors();


        System.out.println("Замена актёра в драме:");
        show.replaceActor(actor3,"Петров");
        show.printActors();

        //  Попытка заменить несуществующего актёра
        System.out.println("Попытка замены в опере:");
        opera.replaceActor(actor1 ,"Несуществующий");

        //  Вывод либретто
        System.out.println("Либретто оперы:");
        opera.printLibretto();

        System.out.println("Либретто балета:");
        ballet.printLibretto();
    }
}