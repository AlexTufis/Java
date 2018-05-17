public class Customer {
    String name;
    boolean member = false;
    String memberType;

    Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean isMember() {
        return this.member;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType(){
        return this.memberType;
    }

    public void setMemberType(String type){
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Name of customer:- " +  getName() + ",the type of the membership that is " + getMemberType();
    }
}
