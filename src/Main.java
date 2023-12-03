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
                new Slytherin("Когтевран учатся Чжоу Чанг", "умны, мудры, остроумны и полны творчества", 80, 98, 82),
                new Slytherin("Падма Патил", "умны, мудры, остроумны и полны творчества", 84, 93, 79),
                new Slytherin("Маркус Белби", "умны, мудры, остроумны и полны творчества", 88, 95, 85),
        };
        printService PrintService = new printService();
        System.out.println("Факультет: Гриффиндор");
        PrintService.print(gryffindors);
        System.out.println("Факультет: Пуффендуй");
        PrintService.print(hufflepuffs);
        System.out.println("Факультет: Когтевран");
        PrintService.print(ravenclaws);
        System.out.println("Факультет: Слизерин");
        PrintService.print(slytherins);
    }
}
