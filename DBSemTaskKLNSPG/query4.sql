SELECT emp.first_name AS Surname, 
       emp.last_name AS Forename, 
       emp.birth_date AS Birth_date 
FROM Zoo.Employee emp
WHERE emp.first_name = 'Simon';