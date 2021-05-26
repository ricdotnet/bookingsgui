package Staff;

import java.util.ArrayList;
import java.util.List;

public class Members {

    public List<Member> membersList = new ArrayList<>();

    public void populate() {
        membersList.add(new Member("123456789", "Ricardo", true));
        membersList.add(new Member("321654987", "Adriana", true));
        membersList.add(new Member("147258369", "Raphael", false));
    }

    /**
     * MemberConstructor Class
     */
    public class Member {
        private final String memberId;
        private final String memberName;
        private Boolean isValid;

        private Member(String memberId, String memberName, Boolean isValid) {
            this.memberId = memberId;
            this.memberName = memberName;
            this.isValid = isValid;
        }

        public String getMemberId() {
            return memberId;
        }
        public String getMemberName() {
            return memberName;
        }
        public Boolean getMemberStatus() {
            return isValid;
        }
    }
}
