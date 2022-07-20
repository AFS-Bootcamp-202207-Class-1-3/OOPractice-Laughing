package practice08;


public class Klass {
    private int number;
    private Student leader;
    public Klass(int number) {
        this.number = number;
    }


    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }

    public Student getLeader() {
        return leader;
    }

    public boolean assignLeader(Student stu){
        if(stu.getKlass().getNumber()!=this.number){
            System.out.print("It is not one of us.\n");
            return false;
        }
        this.leader=stu;
        return true;
    }

    public void appendMember(Student stu){
        stu.setKlass(this);
    }
}
