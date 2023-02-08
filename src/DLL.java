public class DLL {
    DLL next;
    DLL prev;
    String key;

    DLL(){
        this.head=new DLL("1");
        this.tail=new DLL("2");
        head.next=tail;
        tail.prev=head;
    }
    DLL(String key){
        this.key=key;
    }

     DLL head;
     DLL tail;


    public void add(DLL temp){
        DLL tailm1=tail.prev;
        tailm1.next=temp;
        tail.prev=temp;
        temp.next=tail;
        temp.prev=tailm1;
    }

    public void delete(DLL temp){
        DLL tempm1=temp.prev;  //temp minus 1
        DLL tempp1=temp.next;  //temp plus 1
        tempm1.next=tempp1;
        tempp1.prev=tempm1;
        temp.next=null;
        temp.prev=null;
    }
}
