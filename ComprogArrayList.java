import java.util.*;
import java.io.*;

class ComprogArrayList
{
public static void main(String[] args) throws IOException 
{
Scanner inp = new Scanner(System.in);
String nme;
int cmmd1, cmmd2, taon, slot;


ArrayList <String> patients = new ArrayList <String>();
ArrayList <Integer> age = new ArrayList <Integer>();

System.out.println("Search for Patient [1]");
System.out.println("Add a Patient [2] ");
System.out.println("Exit [0] ");

System.out.println("Choose a Command: ");
cmmd1 = inp.nextInt();

if (cmmd1 == 1)
{
System.out.print("Search for: ");
cmmd2 = inp.nextInt();
}
else if (cmmd1 == 2)
{
System.out.println("[Available Slots]");
System.out.println();
System.out.println("Slot 1: ");
System.out.println("Slot 2: ");
System.out.println("Slot 3: ");
System.out.println("Slot 4: ");
System.out.println("Slot 5: ");

System.out.println("Pick a slot: ");
slot = inp.nextInt();

if (slot > 0 && slot < 6)
{
File recs = new File("Patient " + slot);
FileWriter edit = new FileWriter("Patient " + slot + ".txt");
System.out.print("Name: ");
nme = inp.nextLine();
patients.add(nme);
inp.nextLine();
System.out.print("Age: ");
taon = inp.nextInt();
age.add(taon);
inp.nextLine();

}
}




//need na malagyan:
//automatically na ma aassign sa specific na number yung bawat patients para pag ni input yung lists, maglagay tayo ng slots feature
// also needs array streams para ma save yung mga vacant na slots kahit mag exit ng program


}
}