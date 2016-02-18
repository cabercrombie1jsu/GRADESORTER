#GRADESORTER Introduction
The Program GRADESORTER is a program that sorts grades based on the test scores from (0-200). It then determines the number of students having scores in each of the following ranges: 0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200. 

#Implementation
I usually prefer to write code recursively but this code, was most definetely iteratively. The program contains two classes: "LabAssignment1.java" and "Main.java". "LabAssignment.java" calls the grades from the user and sorts them and places them in their correct category. "Main.java" actually contains the grades that "LabAssignment1.java" needs. 

##LABAssignment1.java
###Methods: 
---- public static int[] loadGradesFromFile(String newFile): self explanatory, this method loads the grades from a text file. In this function, I used the scanner function in order to scan the grades that I needed. 
---- public static int[] createBins(int[] data, int[] upperBound): This function plays as the convenient function, this is where I place the grades and where I would like to store them. 


##Main.java


#HowToRunIt
