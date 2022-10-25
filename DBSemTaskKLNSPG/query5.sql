SELECT * FROM Zoo.Employee emp
JOIN Zoo.Employee_post post ON post.emp_id = emp.emp_id
WHERE post.post = 'Gondozó'
ORDER BY first_name ASC;