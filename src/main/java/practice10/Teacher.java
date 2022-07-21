package practice10;


import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private List<Klass> classes=new LinkedList<>();

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }
    public Teacher(int id,String name, int age, List<Klass> classes) {
        super(id,name, age);
        this.classes=classes;

        for(Klass klass: classes) {
            Watcher.addMapToTeacher(klass.getNumber(),this);
        }
    }

    @Override
    public String introduce(){

        if(this.classes.size()==0) return  super.introduce()+" I am a Teacher. I teach No Class.";
        return String.format("%s I am a Teacher. I teach Class %s.",super.introduce(),getClassesStr());
    }

    public String getClassesStr(){
        List<String> numbers=new LinkedList<>();
        for(Klass klass : this.classes){
            numbers.add(String.valueOf(klass.getNumber()));
        }
        return String.join(", ",numbers);
    }


    public String introduceWith(Student stu){
        return isTeaching(stu)?
                String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName())
                :String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());

    }

    public boolean isTeaching(Student stu){
        List<Integer> numbers=new LinkedList<>();
        for(Klass klass : this.classes){
            numbers.add(klass.getNumber());
        }
        return numbers.contains(stu.getKlass().getNumber());
    }

    public List<Klass> getClasses() {
        return classes;
    }


    public void printStuJoin(int classNumber,Student stu){
        System.out.printf("I am %s. I know %s has joined Class %d.\n",this.getName(),stu.getName(),classNumber);
    }

    public void printStuLeader(int classNumber,Student stu){
        System.out.printf("I am %s. I know %s become Leader of Class %d.\n",this.getName(),stu.getName(),classNumber);
    }
}
