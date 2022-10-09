package absolute_pathname;

import java.util.Arrays;
import java.util.Stack;

public class PathnameStandardizer {
    /*Problem: Convert the given absolute pathname with ".." and "." to shortest standard pathname
    Input: /usr/bin/../bin/scripts/..
    Output: /usr/bin
     */
    public static String standardize(String pathname) {
        //Condition: The first directory in the pathname cannot be ".." or "."
        String[] directories = pathname.split("/");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < directories.length; i++) {
            if(directories[i].isEmpty() || directories[i].equals(".")) {
                continue;
            }

            if(directories[i].equals("..")) {
                stack.pop();
                continue;
            }

            stack.push(directories[i]);
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
            sb.insert(0,"/");
        }

        return sb.toString();
    }
}
