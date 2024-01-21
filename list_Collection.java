import java.util.*;
class list_Collection{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Git");
        list.add("github");
        list.add("coimbatore");
        list.add("Tamilnadu");
        list.add("India");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        }
    }
