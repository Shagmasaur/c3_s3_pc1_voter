public class VoterImpl
{
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("Abhishek");
        System.out.print(voter.getName());
        voter.setAge(16);
        System.out.println(" is "+ voter.getAgeCriteria(0));



    }

}
