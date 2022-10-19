SELECT user.username AS Username FROM Zoo.User user
JOIN Zoo.Animal anim ON anim.user_id = user.user_id
JOIN Zoo.Eat eat ON eat.animal_id = anim.animal_id
JOIN Zoo.Food food ON food.food_id = eat.food_id
WHERE food.name = 'Aszalt gyümölcsök' AND user.city != 'Budapest';