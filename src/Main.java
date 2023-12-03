public class Main {
    public static void main(String[] args) {
        System.out.println("Факультет: Гриффиндор");

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "благородство, честь и храбрость", 88, 74, 90),
                new Gryffindor("Гермиона Грейнджер", "благородство, честь и храбрость", 93, 86, 80),
                new Gryffindor("Рон Уизли", "благородство, честь и храбрость", 76, 85, 87),
        };
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor person = gryffindors[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getCharacter() + "; Магия: " + person.getMagic() + "; Расстояние трансгрессии: " + person.getTransgress());

        }
        System.out.println("Факультет: Пуффендуй");

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Драко Малфой", "трудолюбивы, верны, честны", 78, 64, 80),
                new Hufflepuff("Грэхэм Монтегю", "трудолюбивы, верны, честны", 78, 64, 80),
                new Hufflepuff("Грегори Гойл", "трудолюбивы, верны, честны", 78, 64, 80)

        };
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff person = hufflepuffs[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getСharacter() + "; Магия: " + person.getMagic() + "; Расстояние трансгрессии: " + person.getTransgress());
        }
        System.out.println("Факультет: Когтевран");

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Захария Смит", "трудолюбивы, верны, честны", 67, 56, 77),
                new Ravenclaw("Седрик Диггори", "трудолюбивы, верны, честны", 69, 47, 36),
                new Ravenclaw("Джастин Финч-Флетчли", "трудолюбивы, верны, честны", 89, 78, 55),

        };
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw person = ravenclaws[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getСharacter() + "; Магия: " + person.getMagic() + "; Расстояние трансгрессии: " + person.getTransgress());
        }
        System.out.println("Факультет: Слизерин");

        Slytherin[] slytherins = {
                new Slytherin("Когтевран учатся Чжоу Чанг", "умны, мудры, остроумны и полны творчества", 80, 98, 82),
                new Slytherin("Падма Патил", "умны, мудры, остроумны и полны творчества", 84, 93, 79),
                new Slytherin("Маркус Белби", "умны, мудры, остроумны и полны творчества", 88, 95, 85),
        };
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin person = slytherins[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getСharacter() + "; Магия: " + person.getMagic() + "; Расстояние трансгрессии: " + person.getTransgress());

        }
    }
}