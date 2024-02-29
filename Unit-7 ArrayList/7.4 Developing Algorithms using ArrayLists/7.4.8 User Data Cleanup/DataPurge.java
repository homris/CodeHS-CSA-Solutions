import java.util.ArrayList;
public class DataPurge {
 
 public static void removeDuplicates(ArrayList<String> members) {
 
    int j = 0;

    for(int i = 0; i < members.size(); i++) {
        j = i + 1;
        while(j < members.size()) {
            if(members.get(i).equals(members.get(j))) {
                System.out.println("Duplicate "+ members.get(j));
                members.remove(j);
                
            }
            else {
                j++;
                
            }
        }
    }
 }

 public static void removeName(ArrayList<String> members, String name) {
    int i = 0;
    while(i < members.size()) {
        if(members.get(i).contains(name)) {
            System.out.println("Removing " + members.get(i));
            members.remove(i);
            
        }
        else {
            i++;
            
        }
        
    }
 }


 public static boolean correctlyFormatted(ArrayList<String> members){
    boolean result = true;

    for(String person : members) {
        if(!person.contains(" ")) {
            return false;
            
        }

        String firstLetter = person.substring(0, 1);
        if(firstLetter != firstLetter.toUpperCase())
        {
        return false;
        }

        int lastNameIndex = person.indexOf(" ") + 1;
        
        String last = person.substring(lastNameIndex, lastNameIndex + 1);
        if(last != last.toUpperCase())
        {
        return false;
        }
        }

 return result;
 }
}