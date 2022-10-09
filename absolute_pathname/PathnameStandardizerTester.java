package absolute_pathname;

public class PathnameStandardizerTester {
    public static void main(String[] args) {
        System.out.println(PathnameStandardizer.standardize("/usr/bin/../bin/./scripts/../"));
    }
}
