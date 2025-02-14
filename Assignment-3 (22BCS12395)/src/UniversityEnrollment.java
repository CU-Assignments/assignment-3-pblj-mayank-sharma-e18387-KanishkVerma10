// Problem 3: University Enrollment System

import java.util.HashMap;
import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

public class UniversityEnrollment {
    private static final int COURSE_CAPACITY = 2;
    private static final HashMap<String, Integer> enrolledStudents = new HashMap<>();
    private static final HashMap<String, Boolean> prerequisites = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        prerequisites.put("Core Java", true);  
        prerequisites.put("Data Structures", false);

        try {
            System.out.print("Enter Course Name: ");
            String course = scanner.nextLine().trim();

            System.out.print("Enter Required Prerequisite: ");
            String prerequisite = scanner.nextLine().trim();

            if (!prerequisites.containsKey(prerequisite)) {
                throw new IllegalArgumentException("Error: The prerequisite '" + prerequisite + "' is not recognized.");
            }

            if (!prerequisites.get(prerequisite)) {
                throw new PrerequisiteNotMetException("Error: Complete '" + prerequisite + "' before enrolling in '" + course + "'.");
            }

            int currentEnrollment = enrolledStudents.getOrDefault(course, 0);
            if (currentEnrollment >= COURSE_CAPACITY) {
                throw new CourseFullException("Error: The course '" + course + "' is full.");
            }

            enrolledStudents.put(course, currentEnrollment + 1);
            System.out.println("Enrollment successful in '" + course + "'.");

        } catch (PrerequisiteNotMetException | CourseFullException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }
}
