package school.managment.system;
public class SchoolManagmentSystem {
    static public String[] args1;
    public static void main(String[] args) {
        args1 = args;
        if (Database.tableExists("school")) {
            LoginFrame.counter = true;
            new FirstFrame();
        }
        else {
            Database.deleteTableStudent();
            Database.deleteTableTeacher();
            Database.deleteTableResult();
            Database.deleteTableAccount();

            Database.createTableStudent();
            Database.createTableTeacher();
            Database.createTableResult();
            Database.createTableAccount();
            Database.createTableAttendance();

            Database.createTableSchool();
            new OptionalFrame();
        }
    }
}
