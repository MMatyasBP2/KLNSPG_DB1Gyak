SELECT anim.name AS Name, anim.racial AS Racial FROM Zoo.Animal anim
JOIN Zoo.Eat eat ON anim.animal_id = eat.animal_id
JOIN Zoo.Food food ON eat.food_id = food.food_id
WHERE food.name = 'Sárgarépa' AND eat.feeding_time LIKE '%18:00%';