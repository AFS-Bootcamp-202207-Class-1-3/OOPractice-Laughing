package practice06;


public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name, int age,Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    @Override
    public String introduce(){
        return this.klass==null?
                super.introduce()+" I am a Teacher. I teach No Class.":
                String.format("%s I am a Teacher. I teach Class %d.",super.introduce(),this.klass.getNumber());
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduceWith(Student stu){
        return this.klass.getNumber()==stu.getKlass().getNumber()?
                String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName())
                :String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());

    }
}
