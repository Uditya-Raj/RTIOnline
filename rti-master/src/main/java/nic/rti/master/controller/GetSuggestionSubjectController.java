package nic.rti.master.controller;


import nic.rti.master.entity.SuggestionSubject;
import nic.rti.master.service.GetSuggestionSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetSuggestionSubjectController {

    @Autowired
    private GetSuggestionSubjectService suggestionSubjectService;

    @GetMapping(value = "/GetSuggestionSubject", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SuggestionSubject>> getSuggestionSubject() {
        List<SuggestionSubject> suggestionSubject = suggestionSubjectService.getSuggestionSubject();
        if(suggestionSubject !=null && !suggestionSubject.isEmpty()){
            return new ResponseEntity<>(suggestionSubject, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
