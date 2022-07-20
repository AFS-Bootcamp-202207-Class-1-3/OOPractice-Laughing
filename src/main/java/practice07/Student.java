package practice07;

public class Student extends Person {

    protected Klass klass;
    public Student(int id,String name, int age,Klass klass) {
        super(id,name, age);
        this.klass=klass;
    }

    public Klass getKlass() {
        return klass;
    }
    @Override
    public String introduce(){
        return super.introduce() +
                " I am a Student."+
                (isLeader()?
                 String.format(" I am Leader of Class %d.",getKlass().getNumber()):
                 String.format(" I am at Class %d.",getKlass().getNumber())
                );
    }

    public boolean isLeader(){
        if(this.klass.getLeader()==null) return false;
        return this.klass.getLeader().getId()==this.id;
    }
}
