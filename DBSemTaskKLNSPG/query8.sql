SELECT anim.name AS Name FROM Zoo.Animal anim
JOIN Zoo.Habitat hab ON anim.habitat_id = hab.habitat_id
WHERE hab.description LIKE '%etetni%nem%';