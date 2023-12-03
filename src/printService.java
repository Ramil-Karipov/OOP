public class printService {


    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor person = gryffindors[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getCharacter() + "; Магия: " + person.getMagic() +
                    "; Расстояние трансгрессии: " + person.getTransgress());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff person = hufflepuffs[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getCharacter() + "; Магия: " + person.getMagic() +
                    "; Расстояние трансгрессии: " + person.getTransgress());
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw person = ravenclaws[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getCharacter() + "; Магия: " + person.getMagic() +
                    "; Расстояние трансгрессии: " + person.getTransgress());
        }
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin person = slytherins[i];
            System.out.println("Имя учащегося: " + person.getName() + "; Особенности: " + person.getSkill() +
                    "; Характер: " + person.getCharacter() + "; Магия: " + person.getMagic() +
                    "; Расстояние трансгрессии: " + person.getTransgress());

        }
    }
}
