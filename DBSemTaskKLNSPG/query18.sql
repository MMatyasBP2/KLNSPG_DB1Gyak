SELECT user.first_name AS Surname, user.last_name AS Forename FROM Zoo.User user
JOIN Zoo.Animal anim ON anim.user_id = user.user_id
JOIN Zoo.Habitat habit ON habit.habitat_id = anim.habitat_id
JOIN Zoo.Site zoo_site ON zoo_site.site_id = habit.site_id
WHERE user.city = 'Budapest' AND zoo_site.name NOT LIKE 'Fővárosi%';