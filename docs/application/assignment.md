# LMS Assignment Details 
<strong> Instructions: </strong>
<br>
You will work in a team of 5 together to design a Library Management System (LMS) that stores, retrieves, edits, and deletes information. You need to provide the following:
- 1.) Zip file for your Java project.
    - a. If you are using NetBeans: make sure that your project is open in NetBeans (the only open project), click on File -> Export Project -> To ZIP ... to generate one zip file.
    - b. If you are using a different IDE: put all java classes in one single zip file.
- 2.) Documentation pdf file: this file has the following sections:
    - a. Introduction: briefly describe the purpose of the project.
    - b. Architecture: provide a UML class diagram showing a big picture of your project. Use the Lucidchart, visit (https://www.lucidchart.com/pages/) then click on Sign up free and select the free version and sign up. Next, you can start the online editor and create UML class diagram for your project. You can save and come back later to work on it. Once you finished all the work, click on File -> Export -> PDF and download the file to submit.
    - c. MySQL Database: describes the structure of your database like tables and fields used along with connection information like username and password.
    - d. GUI: describe how to use the GUI. There are two ways to do that:
        - i. Describe the purpose of every GUI component, like this button do this and this window do that and so on.
        - ii. Provide scenarios or use-cases. For example, adding a new item scenario and you start by asking the user to click on add new item button then a window will open, and you have to enter information on this field and that field and so on till the user finish this task. Then you explain another scenario like searching for an item and so on.
    - e. Testing: describe how you used Unit testing to check for errors in your project. For example, you can state that you design the insert unit testing for existing item to see if the function for adding new books that exists in the library return back with an error.


<br>
<strong> Rubrics:</strong>
<br>
    1- 20% for UML class diagrams (each student must contribute with at least one class).
    <br>
    2- 40% for Java classes design (each student must contribute with at least one class).
    <br>
    3- 10% for Java GUI (it is possible that one student takes care of this task).
    <br>
    4- 10% for database files (it is possible that one student takes care of this task).
    <br>
    5- 20% for documentation and testing (all students must contribute to this section).


<br>
<strong>Details:</strong>
<br>
Design a Library Management System (LMS) that consists of three main parts:
- Part 1: Classes design
- Part 2: GUI design
- Part 3: Main class and database connectivity



<br>


<strong> Part 1: Consider the following when designing your classes:</strong>
- 1- Each class should be in a separate file.
- 2- Attributes with * are complex ones, in other words, there need to be implemented as classes and used with composition.
- 3- There are lots of repetitions, so you need to use inheritance by
using more classes.
        (Hint: all classes share publication date and title, so these can be put on a separate class and all other classes inherit these 2 attributes)
- 4- Protect some attributes by making them private and provide setters
and getters methods. You need to confirm with me after deciding what
you will do, and this is through the design report.

<pre>
class Book:
*Author list
Title
*Publisher
Edition number
Publication year
*Chapters
*Figures
</pre>

<pre>
class Thesis:
*Author
Title
*Department
*Committee members
Publication year
*Chapters
*Figures
</pre>

<pre>
class Dissertation:
*Author
Title
*Department
*Committee members
Publication year
*Chapters
*Figures
</pre>

<pre>
class ConferencePaper:
*Author list
Title
Conference name
*Location
*Period (3/13 – 3/16)
Publication year
</pre>


<pre>
class JournalPaper:
*Author list
Title
Journal name
Publication year
</pre>


<pre>
class ResearchReport:
*Author list
Title
Publication Year:
</pre>

<pre>
class Magazine:
Title
Publication Year:
</pre>

<Strong> Part-2: Design a GUI that support the following operations: </Strong>
1- Add a new item.
2- Remove an existing item.
3- Search for an item.
4- Edit an item.
5- Generate a report for a summary of available items.

<Strong> Part-3: Design the Main class to use your GUI and the classes you designed for the project. You also need to use MySQL database to save data about LMS. </Strong>
