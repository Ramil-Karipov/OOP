import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "благородство, честь и храбрость", 88, 74, 90),
                new Gryffindor("Гермиона Грейнджер", "благородство, честь и храбрость", 93, 86, 80),
                new Gryffindor("Рон Уизли", "благородство, честь и храбрость", 76, 85, 87),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Драко Малфой", "трудолюбивы, верны, честны", 74, 65, 78),
                new Hufflepuff("Грэхэм Монтегю", "трудолюбивы, верны, честны", 77, 63, 71),
                new Hufflepuff("Грегори Гойл", "трудолюбивы, верны, честны", 88, 71, 70)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Захария Смит", "трудолюбивы, верны, честны", 67, 56, 77),
                new Ravenclaw("Седрик Диггори", "трудолюбивы, верны, честны", 69, 47, 36),
                new Ravenclaw("Джастин Финч-Флетчли", "трудолюбивы, верны, честны", 89, 78, 55),
        };
        Slytherin[] slytherins = {
                new Slytherin("Чжоу Чанг", "умны, мудры, остроумны и полны творчества", 80, 98, 82),
                new Slytherin("Падма Патил", "умны, мудры, остроумны и полны творчества", 84, 93, 79),
                new Slytherin("Маркус Белби", "умны, мудры, остроумны и полны творчества", 88, 95, 85),
        };
        printService PrintService = new printService();
        System.out.println("Факультет: Гриффиндор");
        PrintService.print(gryffindors);
        System.out.println("Факультет: Слизерин");
        PrintService.print(hufflepuffs);
        System.out.println("Факультет: Пуффендуй");
        PrintService.print(ravenclaws);
        System.out.println("Факультет: Когтевран");
        PrintService.print(slytherins);
        System.out.println();

        Gryffindor garry = new Gryffindor("Гарри Поттер", "благородство, честь и храбрость", 88, 74, 90);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", "благородство, честь и храбрость", 93, 86, 80);
        Gryffindor ron = new Gryffindor("Рон Уизли", "благородство, честь и храбрость", 76, 85, 87);

        Hufflepuff zahary = new Hufflepuff("Захария Смит", "трудолюбивы, верны, честны", 67, 56, 77);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", "трудолюбивы, верны, честны", 69, 47, 36);
        Hufflepuff djastin = new Hufflepuff("Джастин Финч-Флетчли", "трудолюбивы, верны, честны", 89, 78, 55);

        Ravenclaw joy = new Ravenclaw("Чжоу Чанг", "умны, мудры, остроумны и полны творчества", 80, 98, 82);
        Ravenclaw padma = new Ravenclaw("Падма Патил", "умны, мудры, остроумны и полны творчества", 84, 93, 79);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", "умны, мудры, остроумны и полны творчества", 88, 95, 85);

        Slytherin drako = new Slytherin("Драко Малфой", "трудолюбивы, верны, честны", 74, 65, 78);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", "трудолюбивы, верны, честны", 77, 63, 71);
        Slytherin gregory = new Slytherin("Грегори Гойл", "трудолюбивы, верны, честны", 88, 71, 70);

        garry.сomparison(germiona,ron);
        System.out.println();
        zahary.сomparison(sedrik,djastin);
        System.out.println();
        joy.сomparison(padma,markus);
        System.out.println();
        drako.сomparison(graham,gregory);
        System.out.println();
        System.out.println(germiona.findTheBestPowerRaveandHuff(padma,ron));


    }
}
