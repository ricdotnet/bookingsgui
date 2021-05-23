package Staff;

import java.util.ArrayList;
import java.util.List;

public class Members {

    public List<Member> membersList = new ArrayList<>();

    public void populate() {
        membersList.add(new Member("123456789", "Ricardo"));
        membersList.add(new Member("321654987", "Adriana"));
        membersList.add(new Member("147258369", "Raphael"));
    }

    /**
     * MemberConstructor Class
     */
    public class Member {
        private final String memberId;
        private final String memberName;

        private Member(String memberId, String memberName) {
            this.memberId = memberId;
            this.memberName = memberName;
        }

        public String getMemberId() {
            return memberId;
        }
        public String getMemberName() {
            return memberName;
        }
    }
}
