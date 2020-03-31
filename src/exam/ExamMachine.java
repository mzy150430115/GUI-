package exam;

import java.util.*;

public class ExamMachine {
    private HashMap<String,String> userbox = new HashMap<String,String>();
    {
        userbox.put("mzy","123");
    }
    private HashSet<Question> questionBank = new HashSet<Question>();
    {
        questionBank.add(new Question("2.如下哪个选项不是Java基本数据类型？\n\tA.String\n\t.Char\n\tC.Int\n\tD.Float","A"));
        questionBank.add(new Question("\"3.如下哪个选项不是Java基本数据类型？\n\tA.String\\n\\tB.Char\\n\\tC.Int\\n\\tD.Float\"","A"));
        questionBank.add(new Question("\"4.如下哪个选项不是Java基本数据类型？\n\tA.String\\n\\tB.Char\\n\\tC.Int\\n\\tD.Float\"","A"));
        questionBank.add(new Question("\"5.如下哪个选项不是Java基本数据类型？\n\tA.String\\n\\tB.Char\\n\\tC.Int\\n\\tD.Float\"","A"));
        questionBank.add(new Question("\"6.如下哪个选项不是Java基本数据类型？\n\tA.String\\n\\tB.Char\\n\\tC.Int\\n\\tD.Float\"","A"));
    }
    //设计一个方法 生成随机试卷
    // 参数 确定试卷五道题
    public ArrayList<Question> getPaper(){

        System.out.println("正在生成试卷，请稍等");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
            //随机抽试卷的时候 试卷的题目不重复 set存--arraylist
        HashSet<Question> paper =new HashSet<Question>();
        //产生一个随机序号 去寻找题目 题库是一个set没有序号--题库--ArrayList
        ArrayList<Question> questionBank = new ArrayList<Question>(this.questionBank);
        //随机抽
        while (paper.size()!=5) {

            int index = new Random().nextInt(this.questionBank.size());
            Question question = questionBank.get(index);
            paper.add(question);
           }return new ArrayList<Question>(paper);


    }
        public String login(String username,String password){
           String realPassword =  this.userbox.get(username);
           if(realPassword!=null && realPassword.equals(password)){
               return "登录成功";
           }
           return "用户名密码错误";



        }
}
