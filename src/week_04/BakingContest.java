package week_04;

public class BakingContest {

    public static void main(String[] args) {

        double myScore1 = 8.5, myScore2 = 7.9, myScore3 = 8.3, otherPeopleScore1 = 8.5, otherPeopleScore2 = 7.9;

        double myScoreAverage = (myScore1+myScore2+myScore3)/3;

        if(myScoreAverage > otherPeopleScore1 && myScoreAverage > otherPeopleScore2){
            System.out.println("Congratulations you earned First place with a score of: "+ myScoreAverage);
        }else if (myScoreAverage < otherPeopleScore1 && myScoreAverage < otherPeopleScore2) {
            System.out.println("Congratulations you earned Third place with a score of: "+ myScoreAverage);
        }else{
            System.out.println("Congratulations you earned Second place with a score of: "+ myScoreAverage);
        }


    }

}
/*
Task 8: BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and our cookies will be rated by 3 judges.

    Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
    Then also define two other people's final score and determine which place you earned int the baking contest

        you can earn either: First place, Second place, or Third place

        Ex:
            input:
                your score = 8.5, 7.9, 8.3
                other people score = 8.5 and 7.9

                output: Congratulations you earned Second place with a score of: 8.2
                    -> don't worry about decimal formatting
 */