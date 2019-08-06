package ro.itschool.curs16;

import java.nio.file.AccessDeniedException;

public class CheckedExceptionMain {
    public static void main(String[] args) {
        try {
            throwsCheckedException();
        } catch (AccessDeniedException e) {
            e.printStackTrace();
        }
    }

    private static void throwsCheckedException() throws AccessDeniedException {
        throw new AccessDeniedException("this is checked");
    }
}
