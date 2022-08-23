public class Voter
{

    static final int VOTER_ELIGIBLE_AGE=18;
    private String name;
    private int    age;

    public Voter() {
        name = "";
        age = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAgeCriteria(int age) {
        if (getAge() < VOTER_ELIGIBLE_AGE) {

        }
        if (getAge()>=VOTER_ELIGIBLE_AGE){
            return "Eligible for vote";

        }
        if (getAge()<VOTER_ELIGIBLE_AGE){
            return "not eligible for vote";

        }
        return "";
    }
}

