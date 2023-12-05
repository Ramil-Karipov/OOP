public class Gryffindor extends Hogwarts {
    public Gryffindor(String name, String skill, int сharacter, int magic, int transgress) {
        super(name, skill, сharacter, magic, transgress);
    }

    public void сomparison(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getCharacter() + student1.getMagic() + student1.getTransgress();
        int sum2 = student2.getCharacter() + student2.getMagic() + student2.getTransgress();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " - Лучший на факультете Гриффиндор, чем Рон");
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " - Лучший на факультете Гриффиндор, чем Гарри");
        } else {
            System.out.println("Характеристики идентичны");
        }
    }
}








