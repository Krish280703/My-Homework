package com.learning.java;

public class Java_Homework_1 {
    public static void main(String[] args) {

        String[] Topics = {"➢ What is Software?", "➢ Software Risks","➢ What is Software Testing?", "➢ Benefits of Software Testing",
                "➢ Who does Testing?","➢ Qualifications of a tester","➢ What is Manual Testing?","➢ SDLC ","➢ STLC",
                "➢ Challenges of Manual Testing", "➢ Principles of Software Testing","➢ Test Plan and it’s benefits", "➢ Test Plan Template",
                "➢ Test Scenario + Template", "➢ Test Case + Template" , "➢ Test Scenario vs Test Case", "➢ Testing Techniques",
                "➢ What is a bug?","➢ Bug Lifecycle" , "➢ Bug Template","➢ Severity Vs Priority","➢ Defect Tracking Tool (JIRA)",
                "➢ Testing Levels" ,"➢ White Box Testing" ,"➢ Blackbox Testing" ,"➢ Static vs Dynamic Testing",
                "➢ Exploratory Testing","➢ Ad-Hoc Testing","➢ Software Development Models","➢ Waterfall",
                "➢ Iterative","➢ V-Model (Verification and Validation)","➢ Agile","➢ Definition of Ready/Done",
                "➢ What is Automation Testing?","➢ Advantages and Disadvantages of Automation","➢ What is Java?",
                "➢ Where is Java used?","➢ Java Features","➢ What is an IDE?"};


        for (int i = 1; i <= Topics.length; i++) {
            System.out.println(i + ": " + Topics[i - 1]);
        }
    }
}
