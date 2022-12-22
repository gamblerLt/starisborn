package collection;

import java.util.*;

public class StudentTest {

    private static final String QUESTIONS = "Kas yra obuolys?,Gyvunas,Pastatas,Vaisius,3;Ka geria karve?,Piena,Alu,Vandeni,3;Is ko gaminamos pomidoru sultys?,Is morku,Is pomidoru,Is vistienos,2;" +
            "Kas yra vista?,Gyvunas,Pastatas,Vaisius,1;Ka eda jautis?,Siena,Kepsnius,Cipsus,1;Is ko gaminami kiausiniai?,Is vistu,Is pomidoru,Is bulviu,1;" +
            "Kas yra namas?,Gyvunas,Pastatas,Vaisius,2;Ka eda katinas?,Siena,Kepsnius,Cipsus,2;Is ko gaminami megztiniai?,Is vilnos,Is pomidoru,Is bulviu,1;" +
            "Kas yra fosa?,Gyvunas,Pastatas,Vaisius,1;Ka duoda karve?,Piena,Alu,Vandeni,1;Is ko gaminamos morku sultys?,Is morku,Is pomidoru,Is vistienos,1;" +
            "Kas yra bunkeris?,Gyvunas,Pastatas,Vaisius,2;Ka geria antis?,Piena,Alu,Vandeni,3;Is ko gaminami cepelinai?,Is morku,Is pomidoru,Is bulviu,3";

    private final Map<Integer, Question> questions = new HashMap<>();
    int count = 1;
    public static void main(String[] args) {
        StudentTest task = new StudentTest();
        task.fillUpQuestionsMap();
        Set<Question> questionsForUser = task.getQuestionsForUser();

       int mark = task.getStudentMark(questionsForUser);
       //todo gera > 8 < 5 vidutiniskai 5 ir tt
        System.out.println("Jusu pazymys: " +mark);
        if(mark <= 3){
            System.out.println("Jusu pazymys neigiamas (>=3)");
        }else if(mark < 7) {
            System.out.println("Neblogas pasirodymas");
        } else if (mark <=10) {
            System.out.println("Puiku");
                    }else{

        System.out.println("Kazkas ne taip ...");
        }


    }
    private int getStudentMark(Set<Question>questionsForUser){
        Scanner sc = new Scanner(System.in);
        int questionCount = 1;
        int mark = 0;
        for(Question q: questionsForUser){
            System.out.println(questionCount++ + q.question());
            int aCount = 1;
            for(String a: q.answers()){
                System.out.println(aCount++ + a);
            }
            int userAnswer = sc.nextInt(); // todo kad neivestu stringo arba didesnio skaiciaus nei yra atsakymu
            if(userAnswer == q.correctAnswer()){
                mark++;

                }
                if(userAnswer > aCount){
                    System.out.println("Tiek atsakymu nera");

                    return sc.nextInt();

            }

        } return mark;

    }
    /*  do
    {
      try
      {
                                Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer value only  ");
        n=sc.nextInt();
        flag=false;
      }
      catch(Exception e)
      {
        // accept integer only.
        System.out.println("Enter only integer value.."+e);
        flag=true;
      }
    }
    while(flag);

        System.out.println("The Integer Value Entered is "+n);

    }*/

    private Set<Question>getQuestionsForUser(){
        Set<Question> uniqueQuestions = new LinkedHashSet<>();

        Random random = new Random();

        while(uniqueQuestions.size() < 10) {

            int numb = random.nextInt(15) + 1;
            Question question = questions.get(numb);
            if (question != null) {
                uniqueQuestions.add(question);
            }
        }

        return uniqueQuestions;
    }

    //reikia metodo uzpildyti mapa
    private void fillUpQuestionsMap(){
        String[] questionsSplit = QUESTIONS.split(";");
        for (String q: questionsSplit){
            //q -.. Kas yra obuolys? ...Vaisius, 3
            System.out.println(q);
            String[] qSplit = q.split(",");
            //paaiskinimai pas andriu faile
            List<String> answers = Arrays.stream(qSplit).toList().subList(1, qSplit.length -1);



            Question question = new Question(qSplit[0], answers, Integer.parseInt(qSplit[qSplit.length - 1]));

            questions.put(count++, question);
        }


    }
}
