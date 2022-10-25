SELECT COUNT(sex) AS Count, first_name AS Surname, last_name AS Forename FROM Zoo.Employee emp
JOIN Zoo.Site zoo_site ON zoo_site.site_id = emp.site_id
WHERE zoo_site.name LIKE 'Fővárosi%' AND emp.sex = 'M' AND emp.birth_date < '1970-01-01';