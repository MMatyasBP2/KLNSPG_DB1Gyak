package com.zoo.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zoo.api.Models.Site;

public interface SiteRepo extends JpaRepository<Site, Integer> {

}
