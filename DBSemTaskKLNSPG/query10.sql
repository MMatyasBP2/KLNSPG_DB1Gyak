SELECT DISTINCT anim.racial AS Racial FROM Zoo.Animal anim
JOIN Zoo.Habitat hab ON anim.habitat_id = hab.habitat_id
WHERE hab.location = '#3';