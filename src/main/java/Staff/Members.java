package Staff;

import java.util.ArrayList;
import java.util.List;

public class Members {

    public List<Member> membersList = new ArrayList<>();

    public void populate() {
        membersList.add(new Member("123456789", "Ricardo", "Rocha", true, "12/12/20", true, "N19 4HF"));
        membersList.add(new Member("321654987", "Adriana", "Greco", true, "13/12/20", false, "E1 4DU"));
        membersList.add(new Member("147258369", "Raphael", "Freitas", false, "10/12/19", true, "BN21 3RG"));
        membersList.add(new Member("111222333", "Joanne", "Doe", false, "10/12/19", false, "N10 1TN"));
        membersList.add(new Member("112233445", "Marco", "Polo", true, "10/12/19", false, "N11 5AH"));
        membersList.add(new Member("101010101", "Victor", "Anthon", true, "10/12/19", true, "SW12 3HG"));
    }

    /**
     * MemberConstructor Class
     */
    public class Member {
        private final String memberId;
        private final String firstName;
        private final String lastName;
        private Boolean isValid;
        private final String joinedDate;
        private Boolean isOrganizer;
        private String postCode;

        private Member(String memberId, String firstName, String lastName, Boolean isValid, String joinedDate, Boolean isOrganizer, String postCode) {
            this.memberId = memberId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.isValid = isValid;
            this.joinedDate = joinedDate;
            this.isOrganizer = isOrganizer;
            this.postCode = postCode;
        }

        public String getMemberId() {
            return memberId;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public Boolean getMemberStatus() {
            return isValid;
        }
        public void setMemberStatus(Boolean isValid) {
            this.isValid = isValid;
        }
        public String getJoinedDate() {
            return joinedDate;
        }
        public Boolean getOrganizerStatus() {
            return isOrganizer;
        }
        public void setOrganizerStatus(Boolean isOrganizer) {
            this.isOrganizer = isOrganizer;
        }
        public String getPostCode() {
            return postCode;
        }
        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }
    }
}
