package DelfinMain;

import Menu.MainMenu;
import Service.FileControl;
import Service.UserInput;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;
import org.beryx.textio.TextTerminal;
import Member.MemberList;
import org.slf4j.Logger;

import java.awt.*;
import java.util.ArrayList;

public class DelfinMain {

    public static MemberList listOfMembers = new MemberList();

    public static void main(String[] args) {
        //INIT MEMBER LIST
        listOfMembers = FileControl.readSerializableFromFile("list");

        //
        //

       /* MemberIdGenerator memberIdGenerator = new MemberIdGenerator();
        MemberIdGenerator memberIdGenerator2 = new MemberIdGenerator();

        LocalDate MaltheDate = LocalDate.of(1998, 1, 30);
        LocalDate MarkDate = LocalDate.of(1996, 10, 30);

        Member Malthe = new Member("Malthe", MaltheDate, "Hoffmeyersvej 67", "61331776", true);
        Member Mark = new Member("Mark", MarkDate, "Lygten 37", "8888888", true);


        listOfMembers.put("1",Malthe);
        listOfMembers.put("2",Mark);

        */

        UserInput.setupConsole();
        MainMenu.runMenu();
        FileControl.writeSerializableToFile(listOfMembers,"list");
        UserInput.textio.dispose();
    }
}