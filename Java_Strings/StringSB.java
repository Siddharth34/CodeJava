import java.util.*;

public class StringSB {

StringBuilder builder = new StringBuilder();

for(int i = 0 ; i < 26 ; i++ ){
    char ch = (char)('a' + i);
    builder.append(ch);
}

System.out.println(builder.toString());
}
}
    
//  mutable 
// Dose not Create a seprate object for all
