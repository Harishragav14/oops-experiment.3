import java.util.*;

public class UniqueCharactersCheck {

public static void main(String[] args) { Scanner sc = new Scanner(System.in);
System.out.print("Enter a word or phrase: "); String input = sc.nextLine();
String str = input.toLowerCase().replaceAll(" ", ""); Set<Character> seen = new HashSet<>();
boolean isPerfect = true; char repeatingChar = '\0';
for (char c : str.toCharArray()) { if (seen.contains(c)) {
isPerfect = false; repeatingChar = c; break;
}

seen.add(c);

}

if (isPerfect) { System.out.println("Output: PERFECT");
System.out.println("[Reason: \"" + input + "\" does not have any character repeating]");
} else {

System.out.println("Output: NOT PERFECT");

System.out.println("[Reason: \"" + input + "\" has '" + repeatingChar + "' as repeating character]");
}

}
