/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/15/17
 
 Description: The program implements algebraic reasoning to find
 the number of votes cast for one candidate. It then uses this information
 to calculate the number of votes earned by the other candidates.
 What I learned: Implementing algebraic reasoning into a java program.
 Difficulties I faced: No significant challenges faced.
 **/
public class Election
{
    public static void main(String ar[])
    {
        /*
         * Algebraic Reasoning:
         * 
         * Total votes = 9485
         * Mary's Votes = x
         * Peter's Votes = x-74
         * Paul's Votes = x-23
         * Joan's Votes = x-86
         * 
         * Total Votes = (x)+(x-74)+(x-23)+(x-86) = 9485
         * 4x = 9485+74+23+86
         * x = (9485+74+23+86)/4
         */
        int total = 9485;
        int maryVote = (9485+74+23+86)/4;
        int peterVote = maryVote-74, paulVote = maryVote-23,
        joanVote = maryVote-86;
        System.out.println("Mary won the election which gives her "+maryVote+" votes");
        System.out.println("Pete has 74 less than Mary giving him "+peterVote+" votes");
        System.out.println("Paul has 23 less than Mary giving him "+paulVote+" votes");
        System.out.println("Joan has 86 less than Mary giving her "+joanVote+ "votes");
        System.out.println();
        System.out.println("Total votes =                         "+total+" votes");
    }
}
/**
 Program Output:
 
 Mary won the election which gives her 2417 votes
 Pete has 74 less than Mary giving him 2343 votes
 Paul has 23 less than Mary giving him 2394 votes
 Joan has 86 less than Mary giving her 2331votes

 Total votes =                         9485 votes
 
 **/
