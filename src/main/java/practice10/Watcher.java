package practice10;

import java.util.HashMap;
import java.util.Map;

public class Watcher {
    private static final Map<Integer,Teacher> mapToTeacher=new HashMap<>();

    public static void addMapToTeacher(int classNumber,Teacher teacher){
        mapToTeacher.put(classNumber,teacher);
    }

    public static void notifyTeacherStudentJoin(int classNumber,Student stu){
        if(!mapToTeacher.containsKey(classNumber)) return;
        Teacher teacher=mapToTeacher.get(classNumber);
        teacher.printStuJoin(classNumber,stu);
    }

    public static void notifyTeacherStudentLeader(int classNumber,Student stu){
        if(!mapToTeacher.containsKey(classNumber)) return;
        Teacher teacher=mapToTeacher.get(classNumber);
        teacher.printStuLeader(classNumber, stu);
    }
}
