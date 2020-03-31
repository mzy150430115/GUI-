package exam;

import java.util.ArrayList;

public class Teacher {
    public  int CheakPaper(ArrayList<Question> paper,String[] answer){
        System.out.println("老师正在批卷子，请等待最终成绩。。。");
        try{
            Thread.sleep(5000);

        }catch (Exception e){
            e.printStackTrace();
        }
        int score = 0;
        for(int i=0;i<paper.size();i++){
            Question question = paper.get(i);
            if(question.getAnswer().equalsIgnoreCase(answer[i])){
                score+=(100/paper.size());
            }
        }
        return score;
    }
}
