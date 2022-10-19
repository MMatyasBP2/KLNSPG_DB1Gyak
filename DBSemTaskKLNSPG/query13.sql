SELECT user.first_name AS Surname, user.last_name AS Forename FROM Zoo.User user
JOIN Zoo.Animal anim
ON anim.user_id = user.user_id
JOIN Zoo.Eat eat ON eat.animal_id = anim.animal_id
JOIN Zoo.Food food ON food.food_id = eat.food_id
JOIN Zoo.food_company comp ON comp.food_id = food.food_id
WHERE comp.company = 'Frosty food';