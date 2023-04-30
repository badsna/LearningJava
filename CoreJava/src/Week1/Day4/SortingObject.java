package Week1.Day4;

class Student {
    int id;
    String name;
    int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}

public class SortingObject {
    public static void main(String[] args) {
        Student[] student = new Student[]{new Student(1, "Badsna", 25)
                , new Student(2, "Rujan", 30),
                new Student(3, "Nilima", 20)};

        for (int i = 0; i < student.length-1; i++) {
            for (int j=i+1;j< student.length;j++){
                Student temp;
                if(student[i].getMark()>student[j].getMark()){
                    temp=student[i];
                    student[i]=student[j];
                    student[j]=temp;
                }
            }

        }

        for (int i=0;i<student.length;i++){
            System.out.println(student[i].getId() + student[i].getName() +student[i].getMark());
        }
    }
}
