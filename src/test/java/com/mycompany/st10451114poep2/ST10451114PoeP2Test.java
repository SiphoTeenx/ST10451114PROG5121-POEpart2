/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10451114poep2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author RC_Student_lab
 */
public class ST10451114PoeP2Test {
    
    /**
     *
     */
    public ST10451114PoeP2Test() {
       
        
    }
      @BeforeEach
       // Reset taskCounter anf totalHours before each test
    public void setUp() {
        Task.taskCounter = 0; 
        Task.totalHours = 0;
    }
     /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
         // Create a task with a valid description (under 50 characters)
        Task validTask = new Task("Login Feature", "Create login to authenticate users", "Robyn Harrison", 8, "To Do");
        assertTrue(validTask.checkTaskDescription(), "Expected description to be valid and under 50 characters.");
        
        // Create a task with an invalid description (more than 50 characters)
        Task invalidTask = new Task("Add Task Feature", "This is a very long task description that exceeds fifty characters.", "Mike Smith", 10, "Doing");
        assertFalse(invalidTask.checkTaskDescription(), "Expected description to be invalid and exceed 50 characters.");
        // TODO review the generated test code and remove the default call to fail.
     
    }
    public void testCheckTaskDescription() {
    // Create a task with a valid description (under 50 characters)
    Task validTask = new Task("Login Feature", "Create login to authenticate users", "Robyn Harrison", 8, "To Do");
    // Assert that the description is valid (true)
    boolean expectedValidResult = true;
    boolean actualValidResult = validTask.checkTaskDescription();
    assertEquals(expectedValidResult, actualValidResult, "Expected description to be valid and under 50 characters.");
    // Create a task with an invalid description (more than 50 characters)
    Task invalidTask = new Task("Add Task Feature", "This is a very long task description that exceeds fifty characters.", "Mike Smith", 10, "Doing");
    // Assert that the description is invalid (false)
    boolean expectedInvalidResult = false;
    boolean actualInvalidResult = invalidTask.checkTaskDescription();
    assertEquals(expectedInvalidResult, actualInvalidResult, "Expected description to be invalid and exceed 50 characters.");
}
     /**
     * Test of createTaskID method, of class Task.
@@ -81,29 +84,30 @@ public void testReturnTotalHours() {
        assertEquals(expectedTotalHours, Task.returnTotalHours(), "Total task hours should be the sum of all task durations.");
    }

    /**
     * Test of addTasks method, of class Task.
     */
      @Test
    public void testPrintTaskDetails() {
        // Task 1: "Login Feature" by "Robyn Harrison"
       // Task 1: "Login Feature" by "Robyn Harrison"
    Task task = new Task("Login Feature", "Create login to authenticate users", "Robyn Harrison", 8, "To Do");

    // Print actual output for debugging
    System.out.println("Actual Task Details:\n" + task.printTaskDetails());

    // Expected output
    String expectedDetails = """
                             Task Status: To Do
                             Developer: Robyn Harrison
                             Task Number: 4
                             Task Name: Login Feature
                             Task Description: Create login to authenticate users
                             Task ID: LO:0:SON
                             Task Duration: 8 hours""";
    
    
    
    static void testPrintTaskDetails() {
        // Create an instance of Task
        Task task1 = new Task("Login Feature", "Create login to authenticate users", "Robyn Harrison", 8, "To Do");
        // Generate the expected output based on current logic
        String expectedDetails = "Task Status: To Do\n" +
                                 "Developer: Robyn Harrison\n" +
                                 "Task Number: 0\n" +
                                 "Task Name: Login Feature\n" +
                                 "Task Description: Create login to authenticate users\n" +
                                 "Task ID: LO:0:SON\n" +  // Verify if this matches the actual ID format
                                 "Task Duration: 8 hours";

    // Assert that the expected and actual values match
    assertEquals(expectedDetails, task.printTaskDetails());
}
    
        // Capture actual output from printTaskDetails
        String actualDetails = task1.printTaskDetails();
        // Debug output
        System.out.println("Expected Output:\n" + expectedDetails);
        System.out.println("Actual Output:\n" + actualDetails);
        // Use assertEquals to check if actual output matches expected output
        assertEquals(expectedDetails, actualDetails, "Task details for task1 should match the expected output.");
    }
    
    
    
    
    

    

    
    

