SELECT sit.name AS Zoo FROM Zoo.Site sit
JOIN Zoo.Habitat hab
ON sit.site_id = hab.site_id
WHERE hab.name = 'Medve park';