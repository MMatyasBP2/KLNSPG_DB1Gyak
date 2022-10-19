SELECT anim.name AS Name, food.name AS Food FROM Zoo.Animal anim
JOIN Zoo.Eat eat ON anim.animal_id = eat.animal_id
JOIN Zoo.Food food ON eat.food_id = food.food_id
WHERE is_delicious = false
ORDER BY anim.name ASC;