package userDefinedException;

public class StateElection {

    public static void main(String[] args) {
        VotingEligibility votingEligibility = new VotingEligibility();
        try {
            votingEligibility.voteEligibility(13);
        } catch (InvalidAgeException ex) {
            System.out.println(ex);
        }

//        votingEligibility.voteEligibility(13);
        System.out.println("Voting booth is near by Ecity");

        //log, exception
    }
}
