SELECT anim.name AS Name FROM Zoo.Animal anim
JOIN Zoo.User user ON user.user_id = anim.user_id
WHERE user.city = 'Budapest';