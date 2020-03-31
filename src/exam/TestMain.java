package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
        ExamMachine machine = new ExamMachine();

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入考试系统，\n请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入密码");
        String password = input.nextLine();

        Student student = new Student(username,password);
        String result = machine.login(student.getUsername(),student.getPassword());
        if(result.equals("登录成功")){
            System.out.println("登录成功\n"+student.getUsername()+"开始考试，谁做个弊先死个妈");
            ArrayList<Question> paper = machine.getPaper();
            String[] answers = student.exam(paper);//xueshengkaoshi

            Teacher teacher = new Teacher();
            int score = teacher.CheakPaper(paper,answers);
            System.out.println(student.getUsername()+"最终成绩为:"+score);
        }





//        Question question = new Question("1.如下哪个选项不是Java基本数据类型？\n\tA.String\n\tB.Char\n\tC.Int\n\tD.Float","A");
//        System.out.println(question.getTitle());
    }

}
