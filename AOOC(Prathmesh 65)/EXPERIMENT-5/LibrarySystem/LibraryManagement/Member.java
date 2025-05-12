package LibraryManagement;

public class Member{
    String name;
    int number_id;

    public Member(String name, int id){
        this.name = name;
        this.number_id = id;
    }

    public void show_member_info(){
        System.out.println("-------Member Details--------");
        System.out.println("Member Name: " + name);
        System.out.println("Memeber ID: " + number_id);
    }
}
