package lms.model;

public class Member{
    private String memberID;
    private String memberName;
    private int BorrowedCount;

    public Member(String memberID,String memberName){
        setMemberID(memberID);
        setMemberName(memberName);
        this.BorrowedCount=0;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getBorrowedCount() {
        return BorrowedCount;
    }

    public void setMemberID(String memberID) {
        if(memberID==null||memberID.trim().isEmpty()){
            throw new IllegalArgumentException("The member ID can not be empty");
        }
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        if(memberName==null||memberName.trim().isEmpty()){
            throw new IllegalArgumentException("The Member Name csn not be Empty");
        }
        this.memberName = memberName;
    }

    public void setBorrowedCount(int borrowedCount) {
        if(borrowedCount<0){
            throw new IllegalArgumentException("Borrow count can not be negative");
        }
        BorrowedCount = borrowedCount;
    }
    public void incrementBorrowedCount(){
        setBorrowedCount(this.BorrowedCount+1);
    }

    @Override
    public String toString() {
        return "Members { Member ID ='"+memberID+"',Member Name ='"+memberName+"',BorrowedCount ='"+BorrowedCount+"'}";
    }
}
