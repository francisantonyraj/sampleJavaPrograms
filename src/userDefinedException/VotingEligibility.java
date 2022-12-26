package userDefinedException;

public class VotingEligibility {

    public void voteEligibility(int age) throws InvalidAgeException {
        if (age > 18) {
            System.out.println("Eligible to vote");
        } else {
            throw new InvalidAgeException("Not Eligible to vote");
        }

    }
}
