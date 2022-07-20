package practice05;

import java.text.MessageFormat;

public class Teacher extends Person{
    private int klass=0;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age,int klass) {
        super(name, age);
        this.klass=klass;
    }

    @Override
    public String introduce(){
        return this.klass==0?
                super.introduce()+" I am a Teacher. I teach No Class.":
                String.format("%s I am a Teacher. I teach Class %d.",super.introduce(),this.klass);
    }

    public int getKlass() {
        return klass;
    }
}
