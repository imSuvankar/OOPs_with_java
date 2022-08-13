class teachers {
    public String subject;
    public String teacher;

    teachers(String s, String t) {
        this.subject = s;
        this.teacher = t;
    }

    public void show() {
        System.out.println(subject + ": " + teacher);
    }
}

public class asgmt_3_4 {
    public static void main(String[] args) {
        teachers[] faculty = new teachers[5];

        faculty[0] = new teachers("DS", "TB");
        faculty[1] = new teachers("Java", "BD");
        faculty[2] = new teachers("OS", "AG");
        faculty[3] = new teachers("Networking", "SKB");
        faculty[4] = new teachers("Lab", "MD");

        for (int i = 0; i < faculty.length; i++) {
            faculty[i].show();
        }
    }
}