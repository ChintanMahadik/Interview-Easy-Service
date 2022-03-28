package com.chintan.org.app.endpoint;

import com.chintan.org.app.model.Module;
import com.chintan.org.app.row.ModuleRow;
import com.chintan.org.app.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(originPatterns = {("${cors.filter.pattern}")}, maxAge = 3600)
@RequestMapping("/api")
public class ServiceEndpoint {

    @Autowired
    ApplicationService applicationService;

    @GetMapping(value = "/getModules", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ModuleRow> getModules(@RequestParam String categoryName){
        return applicationService.getModules(categoryName);
    }

    @PostMapping(value = "/addModule", produces = MediaType.APPLICATION_JSON_VALUE)
    public ModuleRow addModules(@RequestBody Module module){
        return applicationService.addModule(module);
    }
}
