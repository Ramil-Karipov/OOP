public class Gryffindor {
    private String name;
    private String skill;
    private int character;
    private int magic;
    private int transgress;

    public Gryffindor(String name, String skill, int сharacter, int magic, int transgress) {
        this.name = name;
        this.skill = skill;
        this.character = сharacter;
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
}
