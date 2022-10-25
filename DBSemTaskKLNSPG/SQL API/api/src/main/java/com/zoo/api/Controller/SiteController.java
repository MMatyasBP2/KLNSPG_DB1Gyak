package com.zoo.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.zoo.api.Models.Site;
import com.zoo.api.Modules.SiteModules;

@RestController
@RequestMapping("/sites")
public class SiteController {
   
    @Autowired
    private SiteModules siteModule;

    @PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Site create(@RequestBody Site site) {
		return siteModule.storeSite(site);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Site> read() {
		return siteModule.getAllSite();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Site read(@PathVariable int id) {
		return siteModule.getSiteById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable int id) {
		siteModule.deleteSite(id);
	}
	
	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/{id}")
	public Site update(@PathVariable int id, @RequestBody Site site) {
		return siteModule.updateSite(site, id);
	}
}
