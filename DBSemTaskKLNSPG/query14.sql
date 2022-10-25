SELECT anim.name AS Name FROM Zoo.Animal anim
JOIN Zoo.Eat eat ON anim.animal_id = eat.animal_id
JOIN Zoo.food food ON eat.food_id = food.food_id
JOIN Zoo.Food_company comp ON food.food_id = comp.food_id
WHERE comp.company LIKE 'Felix%' AND eat.feeding_time LIKE '%12:00%';