SELECT user.post_code AS Post_code, user.city AS City, user.street AS Street, user.number AS Number
FROM Zoo.User user
JOIN Zoo.Animal anim ON user.user_id = anim.user_id
JOIN Zoo.Habitat habit ON anim.habitat_id = habit.habitat_id
JOIN Zoo.Site zoo_site ON habit.site_id = zoo_site.site_id
WHERE zoo_site.name LIKE '%Veszprém%'
GROUP BY user.street;