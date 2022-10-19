package com.zoo.api.Modules;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zoo.api.Models.Site;
import com.zoo.api.Repo.SiteRepo;

@Service
public class SiteModules {
    
    @Autowired
    private SiteRepo siteRepository;


    public Site storeSite(Site site)
    {
        return siteRepository.save(site);
    }

    public List<Site> getAllSite()
    {
        return siteRepository.findAll();
    }

    public Site getSiteById(int id)
    {
        return siteRepository.findById(id).orElseThrow(() -> new RuntimeException("Site found for the id "+id));	
    }

    public Site updateSite(Site site, int id) {
		Site updatedSite = siteRepository.findById(id).get();
        updatedSite.setName(site.getName());
        updatedSite.setArea(site.getArea());
        updatedSite.setOpening_hours(site.getOpening_hours());
        return siteRepository.save(updatedSite);
	}
	
	public void deleteSite(int id) {
		Site deleteSite = siteRepository.findById(id).get();
        siteRepository.delete(deleteSite);
	}
}
