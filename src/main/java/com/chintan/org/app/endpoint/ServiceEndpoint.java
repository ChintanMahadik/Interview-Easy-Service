package com.chintan.org.app.endpoint;

import com.chintan.org.app.model.ModuleDetails;
import com.chintan.org.app.row.InterviewEasyRow;
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

    @GetMapping(value = "/home", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home(){
        return "Welcome to Interview Easy";
    }

    @GetMapping(value = "/getModules", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InterviewEasyRow> getModules(){
        return applicationService.getModules();
    }

    @PostMapping(value = "/addModules", produces = MediaType.TEXT_PLAIN_VALUE)
    public String addModules(@RequestBody ModuleDetails moduleDetails){
        return applicationService.addModules(moduleDetails);
    }
}
