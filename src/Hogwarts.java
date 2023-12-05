public class Hogwarts {
    private String name;
    private String skill;
    private int character;
    private int magic;
    private int transgress;

    public Hogwarts(String name, String skill, int character, int magic, int transgress) {
        this.name = name;
        this.skill = skill;
        this.character = character;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getCharacter() {
        return character;
    }

    public void setCharacter(int character) {
        this.character = character;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int FullScoreMagic() {
        int full = this.getMagic() + this.getTransgress();
        return full;
    }

    public String findTheBestPowerRaveandHuff(Hogwarts name1, Hogwarts name2) {
        if (name1.FullScoreMagic() < name2.FullScoreMagic()) {
            return "Ученик: " + name2.getName() + ", обладает большей мощностью магии, чем " + name1.getName();
        } else {
            return "Ученик: " + name1.getName() + ", обладает большей мощностью магии, чем " + name2.getName();
        }
    }
}
