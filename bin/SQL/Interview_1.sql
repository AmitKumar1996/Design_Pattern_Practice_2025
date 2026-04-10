✅ Part 1: Salary in the Same Table
🔹 Problem Statement
You have a table called Employee with the following columns:

Eid (Employee ID)

Fname (First Name)

Lname (Last Name)

Email

Salary

Write an SQL query to print the first names of all employees whose salary is greater than or equal to the salary of the employee with the first name "Rita".

🔹 Table Structure
Table Name: Employee

Column Name	Type
Eid	INT
Fname	VARCHAR
Lname	VARCHAR
Email	VARCHAR
Salary	DECIMAL

🔹 Solution (Correct SQL Query)
sql
Copy
Edit
SELECT Fname
FROM Employee
WHERE Salary >= (
    SELECT Salary
    FROM Employee
    WHERE Fname = 'Rita'
);
✅ Part 2: Salary in a Separate Table
🔹 Problem Statement
Now assume the salary data has been moved to a separate table called Salary. Write an SQL query to print the first names of all employees whose salary is greater than or equal to the salary of the employee with the first name "Rita".

🔹 Table Structures
Table 1: Employee

Column Name	Type
Eid	INT
Fname	VARCHAR
Lname	VARCHAR
Email	VARCHAR

Table 2: Salary

Column Name	Type
Eid	INT
Salary	DECIMAL

🔹 Solution (Correct SQL Query)
sql
Copy
Edit
SELECT e.Fname
FROM Employee e
JOIN Salary s ON e.Eid = s.Eid
WHERE s.Salary >= (
    SELECT s2.Salary
    FROM Employee e2
    JOIN Salary s2 ON e2.Eid = s2.Eid
    WHERE e2.Fname = 'Rita'
);


🔹Second Highest Salary:-

SELECT * FROM Employee
ORDER BY salary DESC
LIMIT 1 OFFSET 1;


